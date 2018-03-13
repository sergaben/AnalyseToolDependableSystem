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
    private ArrayList<Method> cyclometicComplexityMethods = new ArrayList<>();
    private int noOfDecisionPoint = 0;
    private int noOfLogicalOperators;
    private double halsteadComplexity;
    public Analysis(){
    }

    public ArrayList<Method> getCyclometicComplexityMethods() {
        return cyclometicComplexityMethods;
    }

    public void startAnalyserFile(AnalysedFile analysedFile, File code) throws IOException {
        JavaAnalyser javaAnalyser = new JavaAnalyser(code);
        Metrics metrics = new Metrics();
        Comment comment = new Comment();
        Operator operator = new Operator();

        javaAnalyser.parseFromFile();
        javaAnalyser.extractCommentsFromFile(comment,code);
        getRidOfDeclarationMethod(javaAnalyser);
        getConstructorsFromFile(javaAnalyser);
        addOperatorsToMethods(operator);

//        operator.getMethods().forEach(method -> {
//            Iterator it = method.getOperatorsOccurencesInMethod().entrySet().iterator();
//            while(it.hasNext()){
//                Map.Entry pair = (Map.Entry)it.next();
//                String value = pair.getValue().toString();
////                hashMapAddTo.put(pair.getKey().toString(),Integer.parseInt(value));
//                System.out.println(pair.getKey() +": "+ Integer.parseInt(value));
//                it.remove();
//            }
//        });
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
//        operator.getMethods().forEach(method -> {
//            System.out.println("Number of Operands in method: " +method.getOperandsOccurencesInMethod().size());
////            totalNoOfOperands += method.getOperandsOccurencesInMethod().size();
//            System.out.println("Number of Unique Operands in method: " + method.getUniqueOperandsInMethod().size());
//
//        });

        getHalsteadComplexity(metrics,noOfUniqueOperators,noOfUniqueOperands,totalNoOfOperators,totalNoOfOperands);
        getCyclomaticComplexity(operator,javaAnalyser,metrics);

        setUpResults(analysedFile,javaAnalyser,comment);
    }

    public void startAnalyserInputText(AnalysedFile analysedFile, String code) {
        JavaAnalyser javaAnalyser = new JavaAnalyser(code);
        Comment comment = new Comment();
        Method methodClass = new Method();
        javaAnalyser.parseFromInputText();
        javaAnalyser.extractCommentsFromTextInput(comment,code);

        analysedFile.setSingleLineComments(comment.getSingleLineComments().size());
        analysedFile.setMultilineComments(comment.getMultiLineComments().size());
        analysedFile.setTotalNoOfComments(comment.getSingleLineComments().size() + comment.getMultiLineComments().size());

//
//        Metrics metrics = new Metrics();
//
//        ArrayList<String> classes = listenerClass.parse(file).stream().map(Object::toString).collect(Collectors.toCollection(ArrayList::new));
//        ArrayList<String> allMethods = new ArrayList<>();
//        //classes.forEach(System.out::println);
//        for(String methods : classes){
//            allMethods.add(methods.substring(methods.indexOf("{")));
//        }
//        String tokenName;
////        for(Token token = lexer.nextToken(); token.getType() != Token.EOF ; token = lexer.nextToken()){
////            tokenName = OperatorsLexer.VOCABULARY.getSymbolicName(token.getType());
////            //System.out.println(tokenName+ " "+ token.getText());
////            if(tokenName.equals("LINE_COMMENT")){
////                comment.setSingleLineComments(token.getText());
////                //noOfDecisionPoint.identifyNoOperatorsForMethod(tokenName);
////            }else if(tokenName.equals("BLOCKCOMMENT")){
////                comment.setMultiLineComments(token.getText());
////            }
////        }
//        comment.getSingleLineComments().forEach(System.out::println);
//        /**
//         * The following nested foreach loops allows the filter of constructors in classes
//         * and adds them to the methods array
//         */
//        //System.out.println(listenerClass.getClassNames().size());
////        listenerClass.getClassNames().forEach(System.out::println);
//        for(String classBodyDeclaration: listenerClass.getClassBodyDeclarations()){
//            for(String className: listenerClass.getClassNames()){
//                if(classBodyDeclaration.startsWith(className)){
////                System.out.println("878789787");
//                    allMethods.add(classBodyDeclaration);
//                }
//            }
//        }
//        //allMethods.forEach(System.out::println);
//
//        noOfDecisionPoint.setNumberOfMethods(allMethods.size());
//        noOfDecisionPoint.setNumberOfClasses(listenerClass.getClassNames().size());
//
//        allMethods.forEach(method->{
//            metrics.setOperatorsAndOperandsForMethods(method);
//        });

//        metrics.getNoOfMethods().forEach(method->{
//            System.out.println("**********************");
//            System.out.println(method.getBodyMethod());
//            System.out.println(method.getOperatorsOccurencesInMethod());
//            System.out.println(method.getUniqueOperatorsInMethod());
//            System.out.println("*********************");
//        });
//        methodClass.setOperatorsAndOperandsForMethods(allMethods.get(1));



//        System.out.println("The number of comments in this file are: " + noOfDecisionPoint.getNumberOfComments());
//        System.out.println("The lines of code (excluding whitespaces & including comments) in this file are: " + noOfDecisionPoint.getLinesOfCode());
//        System.out.println("The number of methods in this file are: "+ noOfDecisionPoint.getNumberOfMethods());
//        System.out.println("The number of classes in this file are: " + noOfDecisionPoint.getNumberOfClasses());
//        Iterator it = methodClass.getOperatorsForMethods().entrySet().iterator();
//        while(it.hasNext()){
//            Map.Entry pair = (Map.Entry)it.next();
//            System.out.println("       " + pair.getKey() + "      " + pair.getValue()+ "       ");
//            it.remove();
//        }
//        listenerClass.getClassNames().forEach(System.out::println);
//        listenerClass.getClassNames().forEach(className->{
//            listenerClass.getClassBodyDeclarations().forEach(declaration->{
//                if(declaration.contains(className)){
//                    System.out.println(declaration);
//                }
//            });
//        });
//        System.out.println(listenerClass.getClassBodyDeclarations().get(1));
//        listenerClass.getClassBodyDeclarations().forEach(declaration->{
//            listenerClass.getClassNames().forEach(name->{
//                if(declaration.contains(name)){
//                    System.out.println(declaration);
//                }
//            });
//        });

//        listenerClass.getClassBodyDeclarations().forEach(System.out::println);


        //allMethods.forEach(System.out::println);

//        allMethods.forEach(method->{
//            noOfDecisionPoint.identifyNoOperatorsForMethod(method);
//            System.out.println("*************************************");
//            Iterator it = noOfDecisionPoint.getOperatorsOccurencesInMethod().entrySet().iterator();
//            while(it.hasNext()){
//                Map.Entry pair = (Map.Entry)it.next();
//                System.out.println(pair.getKey() + " = " + pair.getValue());
//                it.remove();
//            }
//            System.out.println("*************************************");
//        });
        // Iterate through token to find operators in the methods
//        allMethods.forEach(method->{
//            CharStream charStream = CharStreams.fromString(method);
//            OperatorsLexer lexer = new OperatorsLexer(charStream);
//            String tokenName;
//            for(Token token = lexer.nextToken();token.getType() != Token.EOF ; token = lexer.nextToken()){
//                tokenName = OperatorsLexer.VOCABULARY.getSymbolicName(token.getType());
//                //System.out.println(tokenName+ " "+ token.getText());
//                if(!tokenName.equals("WS")){
//                    noOfDecisionPoint.identifyNoOperatorsForMethod(tokenName);
//                }
//            }
//
//        });



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
            Get methods with their respective NoOfOperators and UniqueOperators
         */
//        allMethods.forEach(System.out::println);
        allMethods.forEach(operator::setOperatorsAndOperandsForMethods);

    }

    private void getCyclomaticComplexity(Operator operator, JavaAnalyser javaAnalyser, Metrics metrics){
        operator.getMethods().forEach(method->{

            Iterator it = method.getOperatorsOccurencesInMethod().entrySet().iterator();
            while(it.hasNext()){
                Map.Entry pair = (Map.Entry)it.next();
                String value = pair.getValue().toString();
                String key = pair.getKey().toString();
                //System.out.println(key + " "+ value);
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

//                hashMapAddTo.put(pair.getKey().toString(),Integer.parseInt(value));
                it.remove();


//                noOfLogicalOperators=0;
//                noOfDecisionPoint=0;
            }
            try {
                noOfLogicalOperators += javaAnalyser.getNumberOfTernaryExpressionsFromFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

            cyclometicComplexityMethods.add(new Method(method.getBodyMethod(),metrics.calculateCyclomatic(noOfDecisionPoint,noOfLogicalOperators)));
            noOfDecisionPoint = 0;
            noOfLogicalOperators = 0;
        });
    }

    private void setUpResults(AnalysedFile analysedFile, JavaAnalyser javaAnalyser, Comment comment) throws IOException {
        analysedFile.setCyclometicComplexityMethods(cyclometicComplexityMethods);
        analysedFile.setHalstead_comp(halsteadComplexity);
        analysedFile.setNoOfClasses(javaAnalyser.getClassNames().size());
        analysedFile.setNoOfLines(javaAnalyser.getNumberOfLinesWithoutSpacesAndCommentsFromFile());
        analysedFile.setSingleLineComments(comment.getSingleLineComments().size());
        analysedFile.setMultilineComments(comment.getMultiLineComments().size());
        analysedFile.setTotalNoOfComments(comment.getSingleLineComments().size() + comment.getMultiLineComments().size());
        analysedFile.setNoOfMethods(allMethods.size());
    }

    private void getHalsteadComplexity(Metrics metrics, int uniqueOperators, int uniqueOperands, int totalNoOfOperators, int totalNoOfOperands){
        metrics.calculateHalsteadMetrics(uniqueOperators,uniqueOperands,totalNoOfOperands,totalNoOfOperators);
       this.halsteadComplexity = metrics.getNoOfDeliveredBugs();
    }
}
