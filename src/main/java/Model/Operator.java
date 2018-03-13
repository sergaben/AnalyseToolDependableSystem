package Model;

import Util.HelperMethods;
import Util.gen.Util.OperatorsLexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.util.*;

/**
 * @author sergaben on 05/03/2018.
 * @project AnalyseToolDependableSystem
 */
public class Operator implements HelperMethods {

    private LinkedHashMap<String,Integer> operatorsOccurrencesInMethod = new LinkedHashMap<>();
    private ArrayList<String> operandsOccurrencesInMethod = new ArrayList<>();
    private Set<String> uniqueOperandsIdentifiers = new HashSet<>();
    private Set<String> tempUniqueOperandsIdentifiers = new HashSet<>();
    private ArrayList<String> tempOperands = new ArrayList<>();
    private LinkedHashMap<String,Integer> uniqueOperators = new LinkedHashMap<>();
    private ArrayList<Method> methods = new ArrayList<>();
    private LinkedHashMap<String,Integer> tempOperatorsOccurrencesHash = new LinkedHashMap<>();
    private LinkedHashMap<String,Integer> tempUniqueOperators = new LinkedHashMap<>();

    public void setOperatorsAndOperandsForMethods(String method){

        CharStream charStream = CharStreams.fromString(method);
        OperatorsLexer lexer = new OperatorsLexer(charStream);
        String tokenName;
        for(Token token = lexer.nextToken(); token.getType() != Token.EOF ; token = lexer.nextToken()){

            tokenName = OperatorsLexer.VOCABULARY.getSymbolicName(token.getType());
            int nOfOccurrences = 1;


            if(tokenName.equals("IDENTIFIER") ||
                    tokenName.equals("BOOLEAN") || tokenName.equals("BYTE") ||
                    tokenName.equals("CHAR") || tokenName.equals("DOUBLE") ||
                    tokenName.equals("FLOAT") || tokenName.equals("INT") ||
                    tokenName.equals("LONG") || tokenName.equals("SHORT") ||
                    tokenName.equals("DECIMAL_LITERAL") || tokenName.equals("HEX_LITERAL") ||
                    tokenName.equals("OCT_LITERAL") || tokenName.equals("BINARY_LITERAL") ||
                    tokenName.equals("FLOAT_LITERAL") || tokenName.equals("BOOL_LITERAL") ||
                    tokenName.equals("CHAR_LITERAL") || tokenName.equals("STRING_LITERAL")){
                operandsOccurrencesInMethod.add(token.getText());
                uniqueOperandsIdentifiers.add(token.getText());
//                System.out.println(token.getText());
            }else{
                    /*  1. identify the token name to put it into a hashmap
                        2. add integer of 1 to a hashmap
                        3. check if the token name is in the hashmap
                        4. if the token is in the hashmap add one to the integer related to that token
                        5. if the token is not in the hashmap add it
                        6. after that add a integer of 1 to the related token
                    */
                if (operatorsOccurrencesInMethod.containsKey(tokenName)) {
                    nOfOccurrences += operatorsOccurrencesInMethod.get(tokenName);
                    operatorsOccurrencesInMethod.remove(tokenName);
                    operatorsOccurrencesInMethod.put(tokenName, nOfOccurrences);
                } else {
                    operatorsOccurrencesInMethod.put(tokenName, 1);
                    uniqueOperators.put(tokenName, 1);
                }
            }


        }
        iterateThroughCollectionAndAddTo(operatorsOccurrencesInMethod,tempOperatorsOccurrencesHash);
        iterateThroughCollectionAndAddTo(uniqueOperators,tempUniqueOperators);
        tempOperands.addAll(operandsOccurrencesInMethod);
        tempUniqueOperandsIdentifiers.addAll(uniqueOperandsIdentifiers);
        //Generates an array list of methods with their respective operators and operands
        methods.add(new Method(method, tempOperatorsOccurrencesHash,tempUniqueOperators,tempOperands, tempUniqueOperandsIdentifiers));
        // Clears all the hashmaps
        operatorsOccurrencesInMethod.clear();
        uniqueOperators.clear();
        operandsOccurrencesInMethod.clear();
        uniqueOperandsIdentifiers.clear();


    }

    public ArrayList<Method> getMethods() {
        return methods;
    }


}
