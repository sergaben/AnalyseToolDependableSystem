package Model;

/**
 * @author sergaben on 05/03/2018.
 * @project AnalyseToolDependableSystem
 */
public class Metrics {



    // To calculate Cyclomatic complexity we need to find every decision point
    // and all logical operators within the decision points and add them together and add 1
    // to final sum.

    // decision points example: for, if, else if, while, do while, switch etc.
    // logical operators example: !, &, |, ^, &&, ||
    // These values will be pulled and stored in variables from reading the files

    public void calculateCyclomatic(int decisionPoints, int logicalOperators){
        double cyclomaticCompexity = (decisionPoints + logicalOperators) + 1;

        // idea taken from src:
        // https://www.javaworld.com/article/2074995/dealing-cyclomatic-complexity-in-java-code.html

        System.out.println("Cyclomatic Complexity = "+ cyclomaticCompexity + "%");
        if(decisionPoints <= 10){
            System.out.println("By Cyclomatic Complexity the application is Normal");
        } else if(decisionPoints > 10 && decisionPoints <= 20){
            System.out.println("By Cyclomatic Complexity the application is Moderate");
        } else if(decisionPoints > 20 && decisionPoints <= 50){
            System.out.println("By Cyclomatic Complexity the application is Risky");
        } else {
            System.out.println("By Cyclomatic Complexity the application is Unstable");
        }
    }

    /**
     * Need clarification on what does distinctOperands mean in this context from totalNumberOfOperands
     */
    // operators, operands and total number of operands will be taken from reading the file
    // operands examples: assigned values to Strings, booleans, ints, longs, bytes, doubles etc.
    // operators examples: "==, !=, <, <=, >=, ||, &&, *, /, +, -" etc.
    // just test examples: the numbers will be replaced with variables which these values are
    // stored in from scanning the file and finding the operands and operators.

    public void calculateHalstead(int distinctOperators, int distinctOperands, int totalNumberOfOperands, int totalNumberOfOperators){

        double halsteadComplexity = (distinctOperators / 2) * (totalNumberOfOperands / distinctOperands);

        System.out.println("Halstead Complexity = " + halsteadComplexity + "%");
    }
}
