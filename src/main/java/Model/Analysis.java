package Model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/**
 * @author sergaben on 07/03/2018.
 * @project AnalyseToolDependableSystem
 */
public class Analysis {

    private ArrayList<String> methodsWithDeclaration = new ArrayList<>();
    private ArrayList<String> allMethods = new ArrayList<>();
    private ArrayList<Method> cyclomaticComplexityMethods = new ArrayList<>();
    private ArrayList<Integer> cyclomaticComplexityResults = new ArrayList<>();
    private int noOfDecisionPoint = 0;
    private int noOfLogicalOperators;
    private double halsteadDifficulty;
    private double halsteadEffort;
    private double halsteadVolume;
    private double halsteadBugs;
    private double halsteadProgramLevel;
    private double halsteadTime;
    public Analysis(){
    }

    public ArrayList<Method> getCyclomaticComplexityMethods() {
        return cyclomaticComplexityMethods;
    }

    public void startAnalyserFile(AnalysedFile analysedFile, File code) throws IOException {
        JavaAnalyser javaAnalyser = new JavaAnalyser(code);
        Metrics metrics = new Metrics();
        Comment comment = new Comment();
        Operator operator = new Operator();

        javaAnalyser.parseFromFile();
        javaAnalyser.extractCommentsFromFile(comment,code);
        analysedFile.setCommentQuality(comment.getCommentQuality());
        getRidOfDeclarationMethod(javaAnalyser);
        getConstructorsFromFile(javaAnalyser);
        addOperatorsToMethods(operator);

        int totalNoOfOperators = 0;
        int noOfUniqueOperators =0;
        int totalNoOfOperands =0;
        int noOfUniqueOperands = 0;

        for(Method method : operator.getMethods()){
            for (Object o : method.getOperatorsOccurencesInMethod().entrySet()) {
                Map.Entry pair = (Map.Entry) o;
                totalNoOfOperators += Integer.parseInt(pair.getValue().toString());
            }
        }
        for(Method method: operator.getMethods()){
            for (Object o : method.getUniqueOperatorsInMethod().entrySet()) {
                Map.Entry pair = (Map.Entry) o;
                noOfUniqueOperators += Integer.parseInt(pair.getValue().toString());
            }
        }
        for(Method method: operator.getMethods()){
            totalNoOfOperands += method.getOperandsOccurencesInMethod().size();
            noOfUniqueOperands += method.getUniqueOperandsInMethod().size();
        }

        getHalsteadComplexity(metrics,noOfUniqueOperators,noOfUniqueOperands,totalNoOfOperators,totalNoOfOperands);
        getCyclomaticComplexity(operator,javaAnalyser,metrics);

        setUpResults(analysedFile,javaAnalyser,comment);
    }

    private void getRidOfDeclarationMethod(JavaAnalyser javaAnalyser){
         /*
            The for loop below get rid of the declaration of the methods
         */
        methodsWithDeclaration.addAll(javaAnalyser.getMethods());
        for(String methodWithDeclaration : methodsWithDeclaration){
            allMethods.add(methodWithDeclaration.substring(methodWithDeclaration.indexOf("{")));
        }
    }

    private void getConstructorsFromFile(JavaAnalyser javaAnalyser){
        /*
         * The following nested foreach loops allows the filter of constructors by checking the class body declarations
         * Then it checks if the class body declaration contains the name of the class
         * if the name of the class is found then the body declaration (method) is added to the allMethods arraylist
         */
        for(String classBodyDeclaration: javaAnalyser.getClassBodyDeclarations()){
            for(String className: javaAnalyser.getClassNames()){
                if(classBodyDeclaration.startsWith(className)){
                    allMethods.add(classBodyDeclaration);
                }
            }
        }
    }

    private void addOperatorsToMethods(Operator operator){
        /*
         * Get methods with their respective NoOfOperators and UniqueOperators
         */
        allMethods.forEach(operator::setOperatorsAndOperandsForMethods);

    }

    private void getCyclomaticComplexity(Operator operator, JavaAnalyser javaAnalyser, Metrics metrics){
        operator.getMethods().forEach(method->{

            Iterator it = method.getOperatorsOccurencesInMethod().entrySet().iterator();
            while(it.hasNext()){
                Map.Entry pair = (Map.Entry)it.next();
                String key = pair.getKey().toString();
                switch(key){
                    case "IF":
                        noOfDecisionPoint += method.getOperatorsOccurencesInMethod().get("IF");
                        break;
                    case "FOR":
                        noOfDecisionPoint += method.getOperatorsOccurencesInMethod().get("FOR");
                        break;
                    case "CASE":
                        noOfDecisionPoint += method.getOperatorsOccurencesInMethod().get("CASE");
                        break;
                    case "CATCH":
                        noOfDecisionPoint += method.getOperatorsOccurencesInMethod().get("CATCH");
                        break;
                    case "ELSE":
                        noOfDecisionPoint += method.getOperatorsOccurencesInMethod().get("ELSE");
                        break;
                    case "WHILE":
                        noOfDecisionPoint += method.getOperatorsOccurencesInMethod().get("WHILE");
                        break;
                    case "DOWHILE":
                        noOfDecisionPoint += method.getOperatorsOccurencesInMethod().get("DOWHILE");
                        break;
                    case "TRY":
                        noOfDecisionPoint += method.getOperatorsOccurencesInMethod().get("TRY");
                        break;
                    case "RETURN":
                        noOfDecisionPoint += method.getOperatorsOccurencesInMethod().get("RETURN");
                        break;
                    case "BREAK":
                        noOfDecisionPoint += method.getOperatorsOccurencesInMethod().get("BREAK");
                        break;
                    case "AND":
                        noOfLogicalOperators += method.getOperatorsOccurencesInMethod().get("AND");
                        break;
                    case "OR":
                        noOfLogicalOperators += method.getOperatorsOccurencesInMethod().get("OR");
                        break;
                    case "BITAND":
                        noOfLogicalOperators += method.getOperatorsOccurencesInMethod().get("BITAND");
                        break;
                    case "BITOR":
                        noOfLogicalOperators += method.getOperatorsOccurencesInMethod().get("BITOR");
                        break;
                    case "BANG":
                        noOfLogicalOperators += method.getOperatorsOccurencesInMethod().get("BANG");
                        break;
                    case "CARET":
                        noOfLogicalOperators += method.getOperatorsOccurencesInMethod().get("CARET");
                        break;
                    default:
                        // do nothing
                }
                it.remove();
            }
            try {
                noOfLogicalOperators += javaAnalyser.getNumberOfTernaryExpressionsFromFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

            cyclomaticComplexityMethods.add(new Method(method.getBodyMethod(),metrics.calculateCyclomatic(noOfDecisionPoint,noOfLogicalOperators)));
            cyclomaticComplexityResults.add(metrics.calculateCyclomatic(noOfDecisionPoint,noOfLogicalOperators));
            noOfDecisionPoint = 0;
            noOfLogicalOperators = 0;
        });
    }

    private void setUpResults(AnalysedFile analysedFile, JavaAnalyser javaAnalyser, Comment comment) throws IOException {
        analysedFile.setCyclometicComplexityMethods(cyclomaticComplexityResults);
        analysedFile.setHalstead_difficulty(halsteadDifficulty);
        analysedFile.setHalstead_bugs(halsteadBugs);
        analysedFile.setHalstead_effort(halsteadEffort);
        analysedFile.setHalstead_programLevel(halsteadProgramLevel);
        analysedFile.setHalstead_time(halsteadTime);
        analysedFile.setHalstead_volume(halsteadVolume);
        analysedFile.setNoOfClasses(javaAnalyser.getClassNames().size());
        analysedFile.setNoOfLines(javaAnalyser.getNumberOfLinesWithoutSpacesAndCommentsFromFile());
        analysedFile.setSingleLineComments(comment.getSingleLineComments().size());
        analysedFile.setMultilineComments(comment.getMultiLineComments().size());
        analysedFile.setTotalNoOfComments(comment.getSingleLineComments().size() + comment.getMultiLineComments().size());
        analysedFile.setNoOfMethods(allMethods.size());
    }

    private void getHalsteadComplexity(Metrics metrics, int uniqueOperators, int uniqueOperands, int totalNoOfOperators, int totalNoOfOperands){
        metrics.calculateHalsteadMetrics(uniqueOperators,uniqueOperands,totalNoOfOperands,totalNoOfOperators);
       this.halsteadDifficulty = metrics.getDifficultyLevel();
       this.halsteadVolume = metrics.getVolume();
       this.halsteadBugs = metrics.getNoOfDeliveredBugs();
       this.halsteadEffort = metrics.getEffort();
       this.halsteadProgramLevel = metrics.getProgramLevel();
       this.halsteadTime = metrics.getTime();
    }

}
