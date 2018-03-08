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
public class InitializeAnalysis {

    private ArrayList<String> methodsWithDeclaration = new ArrayList<>();
    private ArrayList<String> allMethods = new ArrayList<>();
    private ArrayList<Metrics> cyclometicComplexityMethods = new ArrayList<>();

    public InitializeAnalysis(){
    }

    public void startAnalyserFile(AnalysedFile analysedFile, File code) throws IOException {
        JavaAnalyser javaAnalyser = new JavaAnalyser(code);
        Comment comment = new Comment();
        Operator operator = new Operator();

        javaAnalyser.parseFromFile();
        javaAnalyser.extractCommentsFromFile(comment,code);

        /*
            The for loop below get rid of the declaration of the methods
         */

        methodsWithDeclaration.addAll(javaAnalyser.getMethods());
        for(String methodWithDeclaration : methodsWithDeclaration){
            allMethods.add(methodWithDeclaration.substring(methodWithDeclaration.indexOf("{")));
        }
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

        /*
            Get methods with their respective NoOfOperators and UniqueOperators
         */
        allMethods.forEach(operator::setOperatorsForMethods);

        operator.getMethods().forEach(method->{
            Iterator it = method.getOperatorsOccurencesInMethod().entrySet().iterator();
            while(it.hasNext()){
                Map.Entry pair = (Map.Entry)it.next();
                String value = pair.getValue().toString();
                String key = pair.getKey().toString();

//                hashMapAddTo.put(pair.getKey().toString(),Integer.parseInt(value));
                it.remove();
            }
            System.out.println("************************");
            System.out.println(method.getBodyMethod());
            System.out.println(method.getOperatorsOccurencesInMethod());
            System.out.println(method.getUniqueOperatorsInMethod());
            System.out.println("*************************");
        });
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
////                //counter.identifyNoOperatorsForMethod(tokenName);
////            }else if(tokenName.equals("BLOCKCOMMENT")){
////                comment.setMultiLineComments(token.getText());
////            }
////        }
//        comment.getSingleLineComments().forEach(System.out::println);
//
//        //allMethods.forEach(System.out::println);
//
//        counter.setNumberOfMethods(allMethods.size());
//        counter.setNumberOfClasses(listenerClass.getClassNames().size());
//
//        allMethods.forEach(method->{
//            metrics.setOperatorsForMethods(method);
//        });

//        metrics.getMethods().forEach(method->{
//            System.out.println("**********************");
//            System.out.println(method.getBodyMethod());
//            System.out.println(method.getOperatorsOccurencesInMethod());
//            System.out.println(method.getUniqueOperatorsInMethod());
//            System.out.println("*********************");
//        });
//        methodClass.setOperatorsForMethods(allMethods.get(1));



//        System.out.println("The number of comments in this file are: " + counter.getNumberOfComments());
//        System.out.println("The lines of code (excluding whitespaces & including comments) in this file are: " + counter.getLinesOfCode());
//        System.out.println("The number of methods in this file are: "+ counter.getNumberOfMethods());
//        System.out.println("The number of classes in this file are: " + counter.getNumberOfClasses());
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
//            counter.identifyNoOperatorsForMethod(method);
//            System.out.println("*************************************");
//            Iterator it = counter.getOperatorsOccurencesInMethod().entrySet().iterator();
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
//                    counter.identifyNoOperatorsForMethod(tokenName);
//                }
//            }
//
//        });
//        allMethods.forEach(System.out::println);
        analysedFile.setNoOfClasses(javaAnalyser.getClassNames().size());
        analysedFile.setLines(javaAnalyser.getNumberOfLinesWithoutSpacesAndCommentsFromFile());
        analysedFile.setSingleLineComments(comment.getSingleLineComments().size());
        analysedFile.setMultilineComments(comment.getMultiLineComments().size());
        analysedFile.setTotalNoOfComments(comment.getSingleLineComments().size() + comment.getMultiLineComments().size());
        analysedFile.setMethods(allMethods.size());


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
////                //counter.identifyNoOperatorsForMethod(tokenName);
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
//        counter.setNumberOfMethods(allMethods.size());
//        counter.setNumberOfClasses(listenerClass.getClassNames().size());
//
//        allMethods.forEach(method->{
//            metrics.setOperatorsForMethods(method);
//        });

//        metrics.getMethods().forEach(method->{
//            System.out.println("**********************");
//            System.out.println(method.getBodyMethod());
//            System.out.println(method.getOperatorsOccurencesInMethod());
//            System.out.println(method.getUniqueOperatorsInMethod());
//            System.out.println("*********************");
//        });
//        methodClass.setOperatorsForMethods(allMethods.get(1));



//        System.out.println("The number of comments in this file are: " + counter.getNumberOfComments());
//        System.out.println("The lines of code (excluding whitespaces & including comments) in this file are: " + counter.getLinesOfCode());
//        System.out.println("The number of methods in this file are: "+ counter.getNumberOfMethods());
//        System.out.println("The number of classes in this file are: " + counter.getNumberOfClasses());
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
//            counter.identifyNoOperatorsForMethod(method);
//            System.out.println("*************************************");
//            Iterator it = counter.getOperatorsOccurencesInMethod().entrySet().iterator();
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
//                    counter.identifyNoOperatorsForMethod(tokenName);
//                }
//            }
//
//        });



    }
}
