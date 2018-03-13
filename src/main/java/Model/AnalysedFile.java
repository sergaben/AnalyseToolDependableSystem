package Model;

import java.io.*;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;


public class AnalysedFile {

    private String name;
    private int noOfLines;
    private int noOfClasses;
    private int singleLineComments;
    private int multilineComments;
    private int totalNoOfComments;
    private int noOfMethods;
    private double halstead_comp;
    private ArrayList<Integer> cyclometicComplexityMethods = new ArrayList<>();
    private int cyclomatic_comp;
    private int code_quality;

    public AnalysedFile() {

    }

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

    public ArrayList<Integer> getCyclometicComplexityMethods() {
        return cyclometicComplexityMethods;
    }

    public void setCyclometicComplexityMethods(ArrayList<Integer> cyclometicComplexityMethods) {
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
     * Converts AnalysedFile object to JSON and writes to file
     * in the following format:
     *   {
     *     "name" : <string>,
     *     "noOfLines" : <int>,
     *     "noOfClasses" : <int>,
     *     "singleLineComments" : <int>,
     *     "multilineComments" : <int>,
     *     "totalNoOfComments" : <int>,
     *     "noOfMethods" : <int>,
     *     "halstead_comp" : <int>,
     *     "cyclomatic_comp" : <int>,
     *     "code_quality" : <int>
     *   }
     */
    public static void exportToJSON(AnalysedFile af, File file) throws IOException {
        try {
            // convert AnalysedFile object to JSON
            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
            String json = ow.writeValueAsString(af);

            // write JSON string to file
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(json);
            writer.close();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    /*
     * Reads .atds file and converts to AnalysedFile object
     */
    public static AnalysedFile getFromJSON(File file) {
        AnalysedFile af = new AnalysedFile();
        ObjectMapper mapper = new ObjectMapper();


        try {
            // Read JSON from file
            BufferedReader br = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                line = br.readLine();
            }
            String json = sb.toString();

            // Convert JSON to AnalysedFile
            af = mapper.readValue(json, AnalysedFile.class);
            br.close();

        } catch(IOException e) {
            e.printStackTrace();
        }
        return af;
    }
}