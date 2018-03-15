package Model;

import Util.HelperMethods;
import Util.gen.Util.OperatorsBaseListener;
import Util.gen.Util.OperatorsParser;
import Util.gen.Util.OperatorsLexer;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author sergaben on 07/03/2018.
 * @project AnalyseToolDependableSystem
 */
public class JavaAnalyser implements HelperMethods{

    private ArrayList<String> methods = new ArrayList<>();
    private ArrayList<String> classNames = new ArrayList<>();
    private ArrayList<String> classBodyDeclarations = new ArrayList<>();
    private int numberOfTernaryExpressions =0;
    private OperatorsParser parser;
    private CharStream charStream;
    private File code;
    private int numberOfLinesWithoutAndComments = 0;

    public JavaAnalyser(File code){
        this.code= code;
    }

    public ArrayList<String> getClassNames() {
        return classNames;
    }

    public ArrayList<String> getClassBodyDeclarations() {
        return classBodyDeclarations;
    }

    public ArrayList<String> getMethods() {
        return methods;
    }

    public void parseFromFile() throws IOException {
        charStream = CharStreams.fromFileName(code.getPath());
        OperatorsLexer lexer = new OperatorsLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        parser = new OperatorsParser(tokens);

        Listener listener = new Listener(charStream,lexer);
        parser.compilationUnit().enterRule(listener);


    }

    public int getNumberOfLinesWithoutSpacesAndCommentsFromFile() throws IOException {
        charStream = CharStreams.fromFileName(code.getPath());
        OperatorsLexer lexer = new OperatorsLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
         parser = new OperatorsParser(tokens);
        numberOfLinesWithoutAndComments = getLinesOfCode(parser).get(0);

        return numberOfLinesWithoutAndComments;
    }

    public int getNumberOfTernaryExpressionsFromFile() throws IOException {
        charStream = CharStreams.fromFileName(code.getPath());
        OperatorsLexer lexer = new OperatorsLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        parser = new OperatorsParser(tokens);
        numberOfTernaryExpressions = getLinesOfCode(parser).get(1);
        return numberOfTernaryExpressions;
    }

    public void extractCommentsFromFile(Comment comment, File code) throws IOException {
        CharStream charStream = CharStreams.fromPath(code.toPath());
        OperatorsLexer lexer = new OperatorsLexer(charStream);
        iterateThroughLexerFindComments(comment,lexer);

    }

    class Listener extends OperatorsBaseListener{
        private ArrayList<String> classes;
        private CharStream input;
        private OperatorsLexer lexer;
        public Listener(CharStream input, OperatorsLexer lexer) {
            classes = new ArrayList<>();
            this.input = input;
            this.lexer = lexer;
        }
        public Listener(){}

        public ArrayList<String> getClasses() {

            return classes;
        }

        @Override
        public void enterCompilationUnit(OperatorsParser.CompilationUnitContext ctx){
            //System.out.println(ctx.getText());
            //System.out.println("It runs!!!");
            //System.out.println(parser.LoC);
            //System.out.println(lexer.getText());
//            System.out.println("");
//            if(ctx.getText().contains(".")){
//                System.out.println(lexer.getText());
//            }
            //System.out.println(lexer.getLine());
            TypeClassListener typeClassListener= new TypeClassListener();
            ctx.typeDeclaration().forEach(declaration->declaration.enterRule(typeClassListener));
//            System.out.println(ctx.getText());
        }

    }

    class TypeClassListener extends OperatorsBaseListener{
        @Override
        public void enterTypeDeclaration(OperatorsParser.TypeDeclarationContext ctx){
            //System.out.println("It runs!!!!");
            ClassDeclarationListener classDeclarationListener = new ClassDeclarationListener();
//            ctx.classDeclaration().enterRule(classDeclarationListener);
            ctx.classDeclaration().enterRule(classDeclarationListener);
        }
    }

    class ClassDeclarationListener extends OperatorsBaseListener{
        @Override
        public void enterClassDeclaration(OperatorsParser.ClassDeclarationContext ctx){
            //System.out.println("It runs!!!");
            ClassBodyListener classBodyListener = new ClassBodyListener();
            String[] classConstructor = ctx.getText().split("class");
            String[] nameclassesimplements = {};
            String[] nameClasses = {};

            if(classConstructor[1].contains("extends")||classConstructor[1].contains("implements")){
                nameclassesimplements = classConstructor[1].split("extends|implements");
                classNames.add(nameclassesimplements[0]);


            }else{
                nameClasses = classConstructor[1].split("\\{");

                classNames.add(nameClasses[0]);


            }


            ctx.classBody().enterRule(classBodyListener);
        }
    }

    class ClassBodyListener extends OperatorsBaseListener{

        @Override
        public void enterClassBody(OperatorsParser.ClassBodyContext ctx){

            MemberDeclarationListener memberDeclarationListener = new MemberDeclarationListener();
            ClassDeclarationListener classDeclarationListener = new ClassDeclarationListener();
            TypeClassListener typeClassListener = new TypeClassListener();
//

            ctx.classBodyDeclaration().forEach(element-> {
                //System.out.println(element.memberDeclaration().getText());

                try{
                    if(!element.memberDeclaration().getText().startsWith("class")){
                        //System.out.println("It runs no class inside 1!!!");
                        // System.out.println(element.memberDeclaration().getText());

                        element.memberDeclaration().enterRule(memberDeclarationListener);
                    }else{
                        //System.out.println("It runs class inside 1!!!");
//                    System.out.println(element.memberDeclaration().getText());

                        element.memberDeclaration().classDeclaration().enterRule(classDeclarationListener);
                    }
                }catch (NullPointerException e){
                    e.getMessage();
                }

            });
//            System.out.println("It runs!!!");
        }
    }

    class MemberDeclarationListener extends OperatorsBaseListener{

        @Override
        public void enterMemberDeclaration(OperatorsParser.MemberDeclarationContext ctx){
            MethodDeclarationListener methodDeclarationListener = new MethodDeclarationListener(charStream);

            int a = ctx.start.getStartIndex();
            int b = ctx.stop.getStopIndex();
            Interval interval = new Interval(a,b);

            classBodyDeclarations.add(charStream.getText(interval));

            ctx.methodDeclaration().enterRule(methodDeclarationListener);
//

        }


    }

    class MethodDeclarationListener extends OperatorsBaseListener{
        private CharStream input;
        public MethodDeclarationListener(CharStream input){
            this.input = input;
        }

        @Override
        public void enterMethodDeclaration(OperatorsParser.MethodDeclarationContext ctx) throws NullPointerException{
            //System.out.println("/*/*/*/*/*/*/*/*");
            int a = ctx.start.getStartIndex();
            int b = ctx.stop.getStopIndex();
            Interval interval = new Interval(a,b);
            //System.out.println(ctx.getText());
            methods.add(input.getText(interval));

        }
    }
}
