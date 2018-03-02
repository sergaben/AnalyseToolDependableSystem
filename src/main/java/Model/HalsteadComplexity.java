package Model;
/**
 * Created by Dave-Mac on 17/01/2018.
 */
public class HalsteadComplexity {

        /**
         * Need clarification on what does distinctOperands mean in this context from totalNumberOfOperands
         */
        // operators, operands and total number of operands will be taken from reading the file
        // operands examples: assigned values to Strings, booleans, ints, longs, bytes, doubles etc.
        // operators examples: "==, !=, <, <=, >=, ||, &&, *, /, +, -" etc.
        // just test examples: the numbers will be replaced with variables which these values are
        // stored in from scanning the file and finding the operands and operators.

    public static void calculate(int distinctOperators, int distinctOperands, int totalNumberOfOperands){

        double halsteadComplexity = (distinctOperators / 2) * (totalNumberOfOperands / distinctOperands);

        System.out.println("Halstead Complexity = " + halsteadComplexity + "%");
    }

}
