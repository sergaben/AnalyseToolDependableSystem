package Model;

import java.io.File;
import java.util.ArrayList;

public class AnalysedFile {

    private String name;
    private int noOfLines;
    private int noOfClasses;
    private int singleLineComments;
    private int multilineComments;
    private int totalNoOfComments;
    private int noOfMethods;
    private double halstead_comp;
    private ArrayList<Method> cyclometicComplexityMethods = new ArrayList<>();
    private int cyclomatic_comp;
    private int code_quality;

    /* Test comment */
    public AnalysedFile() {

    }
    /*fafsafsdf*/
    public AnalysedFile(int noOfLines, int noOfClasses, int singleLineComments, int multilineComments, int totalNoOfComments, int noOfMethods, int halstead_comp, int cyclomatic_comp, int code_quality) {
        this.noOfLines = noOfLines;
        this.noOfClasses = noOfClasses;
        this.singleLineComments = singleLineComments;
        this.multilineComments = multilineComments;
        this.totalNoOfComments = totalNoOfComments;
        this.noOfMethods = noOfMethods;
        this.halstead_comp = halstead_comp;
        this. cyclomatic_comp = cyclomatic_comp;
        this.code_quality = code_quality;
    }

    public ArrayList<Method> getCyclometicComplexityMethods() {
        return cyclometicComplexityMethods;
    }

    public void setCyclometicComplexityMethods(ArrayList<Method> cyclometicComplexityMethods) {
        this.cyclometicComplexityMethods = cyclometicComplexityMethods;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getNoOfLines() {
        return noOfLines;
    }

    public void setNoOfLines(int noOfLines) {
        this.noOfLines = noOfLines;
    }

    public int getNoOfClasses() { return noOfClasses; }

    public void setNoOfClasses(int noOfClasses) { this.noOfClasses = noOfClasses; }

    public int getSingleLineComments() {
        return singleLineComments;
    }

    public void setSingleLineComments(int singleLineComments) {
        this.singleLineComments = singleLineComments;
    }

    public int getMultilineComments() {
        return multilineComments;
    }

    public void setMultilineComments(int multilineComments) {
        this.multilineComments = multilineComments;
    }

    public int getTotalNoOfComments() {
        return totalNoOfComments;
    }

    public void setTotalNoOfComments(int totalNoOfComments) {
        this.totalNoOfComments = totalNoOfComments;
    }

    public int getNoOfMethods() {
        return noOfMethods;
    }

    public void setNoOfMethods(int noOfMethods) {
        this.noOfMethods = noOfMethods;
    }

    public double getHalstead_comp() {
        return halstead_comp;
    }

    public void setHalstead_comp(double halstead_comp) {
        this.halstead_comp = halstead_comp;
    }

    public int getCyclomatic_comp() {
        return cyclomatic_comp;
    }

    public void setCyclomatic_comp(int cyclomatic_comp) {
        this.cyclomatic_comp = cyclomatic_comp;
    }

    public int getCode_quality() {
        return code_quality;
    }

    public void setCode_quality(int code_quality) {
        this.code_quality = code_quality;
    }

    /*
    {
      "name" : "mkyong",
      "noOfLines" : 0,
      "comments" : null,
      "noOfMethods" : "null",
      "halstead_comp" : "null",
      "cyclomatic_comp": "null",
      "code_quality": "null"
    }
     */

    public String exportToJSON(File file) {
        String json = "{\n";

        return json;
    }

    public static AnalysedFile getFromJSON(File file) {



        return new AnalysedFile();
    }
}