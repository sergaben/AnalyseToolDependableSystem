/**
 * Created by Dave-Mac on 17/01/2018.
 */
public class HalsteadComplexity {

    public static void main(String[] args) {

        /**
         * Need clarification on what does distinctOperands mean in this context from totalNumberOfOperands
         */
        // operators, operands and total number of operands will be taken from reading the file
        // operands examples: assigned values to Strings, booleans, ints, longs, bytes, doubles etc.
        // operators examples: "==, !=, <, <=, >=, ||, &&, *, /, +, -" etc.
        // just test examples: the numbers will be replaced with variables which these values are
        // stored in from scanning the file and finding the operands and operators.
        calculate(54, 67, 91);
        calculate(124, 91, 158);
        calculate(190, 105, 250);
        calculate(89, 100, 143);

    }

    public static void calculate(int distinctOperators, int distinctOperands, int totalNumberOfOperands){

        double halsteadComplexity = (distinctOperators / 2) * (totalNumberOfOperands / distinctOperands);

        System.out.println("Halstead Complexity = " + halsteadComplexity + "%");
    }

}
