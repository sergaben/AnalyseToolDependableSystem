package Model;

/**
 * @author sergaben on 07/03/2018.
 * @project AnalyseToolDependableSystem
 */
public class Metrics {

    private double volume;
    private double difficultyLevel;
    private double programLevel;
    private double effort;
    private double time;
    private double noOfDeliveredBugs;

    // idea taken from src:
    // https://www.javaworld.com/article/2074995/dealing-cyclomatic-complexity-in-java-code.html

    public int calculateCyclomatic(int decisionPoints, int logicalOperators){
        return decisionPoints + logicalOperators + 1;
    }

    /**
     * Need clarification on what does distinctOperands mean in this context from totalNumberOfOperands
     */
    // operators, operands and total number of operands will be taken from reading the file
    // operands examples: assigned values to Strings, booleans, ints, longs, bytes, doubles etc.
    // operators examples: "==, !=, <, <=, >=, ||, &&, *, /, +, -" etc.
    // just test examples: the numbers will be replaced with variables which these values are
    // stored in from scanning the file and finding the operands and operators.

    public void calculateHalsteadMetrics(int distinctOperators /* n1 */, int distinctOperands /* n2 */, int totalNumberOfOperands /* N2 */, int totalNumberOfOperators /* N1 */){

        int vocabularySize = distinctOperands + distinctOperators;
        int programLength = totalNumberOfOperands + totalNumberOfOperators;
        this.volume = volume(programLength,vocabularySize);
        this.difficultyLevel = difficultyLevel(distinctOperators,totalNumberOfOperands,distinctOperands);
        this.programLevel = programLevel(distinctOperators,totalNumberOfOperands,distinctOperands);
        this.effort = effort(programLength,vocabularySize,distinctOperators,totalNumberOfOperands,distinctOperands);
        this.time = time(programLength,vocabularySize,distinctOperators,totalNumberOfOperands,distinctOperands);
        this.noOfDeliveredBugs = numberOfDeliveredBugs(programLength,vocabularySize,distinctOperators,totalNumberOfOperands,distinctOperands);
    }

    private double volume(int programLength, int vocabularySize){
        return programLength * (Math.log(vocabularySize)/Math.log(2));
    }
    private double difficultyLevel(int distinctOperators /*n1*/, int totalNumberOfOperands /* N2*/, int distinctOperands /*n2*/){
        return (distinctOperators/2) * (totalNumberOfOperands/distinctOperands);
    }
    private double programLevel(int distinctOperators /*n1*/, int totalNumberOfOperands /* N2*/, int distinctOperands /*n2*/){
        return 1/ difficultyLevel(distinctOperators,totalNumberOfOperands,distinctOperands);
    }
    private double effort(int programLength, int vocabularySize, int distinctOperators /*n1*/, int totalNumberOfOperands /* N2*/, int distinctOperands /*n2*/){
        return volume(programLength,vocabularySize) * difficultyLevel(distinctOperators,totalNumberOfOperands,distinctOperands);
    }
    private double time(int programLength, int vocabularySize, int distinctOperators /*n1*/, int totalNumberOfOperands /* N2*/, int distinctOperands /*n2*/){
        return effort(programLength,vocabularySize,distinctOperators,totalNumberOfOperands,distinctOperands) / 18;
    }
    private double numberOfDeliveredBugs(int programLength, int vocabularySize, int distinctOperators /*n1*/, int totalNumberOfOperands /* N2*/, int distinctOperands /*n2*/){
        return (Math.pow(effort(programLength,vocabularySize,distinctOperators,totalNumberOfOperands,distinctOperands),(2/3)))/3000;
    }

    public double getVolume() {
        return volume;
    }

    public double getDifficultyLevel() {
        return difficultyLevel;
    }

    public double getProgramLevel() {
        return programLevel;
    }

    public double getEffort() {
        return effort;
    }

    public double getTime() {
        return time;
    }

    public double getNoOfDeliveredBugs() {
        return noOfDeliveredBugs;
    }
}
