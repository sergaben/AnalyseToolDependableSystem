package Model;

import Util.HelperMethods;
import Util.gen.Util.OperatorsLexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * @author sergaben on 05/03/2018.
 * @project AnalyseToolDependableSystem
 */
public class Operator implements HelperMethods {

    private LinkedHashMap<String,Integer> operatorsOccurrencesInMethod = new LinkedHashMap<>();
    private LinkedHashMap<String,Integer> uniqueOperators = new LinkedHashMap<>();
    private ArrayList<Method> methods = new ArrayList<>();
    private LinkedHashMap<String,Integer> tempOperatorsOccurrencesHash = new LinkedHashMap<>();
    private LinkedHashMap<String,Integer> tempUniqueOperators = new LinkedHashMap<>();

    public void setOperatorsForMethods(String method){

        CharStream charStream = CharStreams.fromString(method);
        OperatorsLexer lexer = new OperatorsLexer(charStream);
        String tokenName;
        for(Token token = lexer.nextToken(); token.getType() != Token.EOF ; token = lexer.nextToken()){

            tokenName = OperatorsLexer.VOCABULARY.getSymbolicName(token.getType());

            /*  1. identify the token name to put it into a hashmap
                2. add integer of 1 to a hashmap
                3. check if the token name is in the hashmap
                4. if the token is in the hashmap add one to the integer related to that token
                5. if the token is not in the hashmap add it
                6. after that add a integer of 1 to the related token
             */
            int nOfOccurences = 1;

            if (operatorsOccurrencesInMethod.containsKey(tokenName)) {
                nOfOccurences += operatorsOccurrencesInMethod.get(tokenName);
                operatorsOccurrencesInMethod.remove(tokenName);
                operatorsOccurrencesInMethod.put(tokenName, nOfOccurences);
            } else{
                operatorsOccurrencesInMethod.put(tokenName, 1);
                uniqueOperators.put(tokenName, 1);
            }
        }
        iterateThroughCollectionAndAddTo(operatorsOccurrencesInMethod,tempOperatorsOccurrencesHash);
        iterateThroughCollectionAndAddTo(uniqueOperators,tempUniqueOperators);

        //Generates an array list of methods with their respective operators
        methods.add(new Method(method, tempOperatorsOccurrencesHash,tempUniqueOperators));
        // Clears all the hashmaps
        operatorsOccurrencesInMethod.clear();
        uniqueOperators.clear();


    }

    public ArrayList<Method> getMethods() {
        return methods;
    }
}
