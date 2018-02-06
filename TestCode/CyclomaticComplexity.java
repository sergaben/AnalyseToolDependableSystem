/**
 * Created by Dave-Mac on 05/02/2018.
 */
public class CyclomaticComplexity {
    public static void main(String[] args) {
        // To calculate Cyclomatic complexity we need to find every decision point
        // and all logical operators within the decision points and add them together and add 1
        // to final sum.

        // decision points example: for, if, else if, while, do while, switch etc.
        // logical operators example: !, &, |, ^, &&, ||
        // These values will be pulled and stored in variables from reading the files

        calculate(10, 15);
        calculate(20, 23);
        calculate(50, 58);
        calculate(70, 80);

    }
    private static void calculate(int decisionPoints, int logicalOperators){
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
}
