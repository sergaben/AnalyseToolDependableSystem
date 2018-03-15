package Model;

import java.io.*;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;


public class AnalysedFile {

    private String name;
    private int noOfLinesInFile;
    private int noOfLinesOfCode;
    private int noOfClasses;
    private int singleLineComments;
    private int multilineComments;
    private int totalNoOfComments;
    private int noOfMethods;
    private double halstead_difficulty;
    private double halstead_time;
    private double halstead_effort;
    private double halstead_volume;
    private double halstead_programLevel;
    private double halstead_bugs;
    private ArrayList<Integer> cyclometicComplexityMethods = new ArrayList<>();
    private int cyclomatic_comp;
    private int commentQuality;

    public AnalysedFile() {

    }

    public AnalysedFile(int noOfLinesInFile, int noOfClasses, int singleLineComments, int multilineComments, int totalNoOfComments, int noOfMethods, int halstead_difficulty, int cyclomatic_comp, int code_quality) {
        this.noOfLinesInFile = noOfLinesInFile;
        this.noOfClasses = noOfClasses;
        this.singleLineComments = singleLineComments;
        this.multilineComments = multilineComments;
        this.totalNoOfComments = totalNoOfComments;
        this.noOfMethods = noOfMethods;
        this.halstead_difficulty = halstead_difficulty;
        this.cyclomatic_comp = cyclomatic_comp;
        this.commentQuality = commentQuality;
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

    public int getNoOfLinesInFile() {
        return noOfLinesInFile;
    }

    public void setNoOfLinesInFile(int noOfLinesInFile) {
        this.noOfLinesInFile = noOfLinesInFile;
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

    public double getHalstead_difficulty() {
        return halstead_difficulty;
    }

    public void setHalstead_difficulty(double halstead_difficulty) {
        this.halstead_difficulty = halstead_difficulty;
    }

    public int getCyclomatic_comp() {
        return cyclomatic_comp;
    }

    public void setCyclomatic_comp(int cyclomatic_comp) {
        this.cyclomatic_comp = cyclomatic_comp;
    }

    public int getCommentQuality() {
        return commentQuality;
    }

    public void setCommentQuality(int commentQuality) {
        this.commentQuality = commentQuality;
    }

    public double getHalstead_time() {
        return halstead_time;
    }

    public void setHalstead_time(double halstead_time) {
        this.halstead_time = halstead_time;
    }

    public double getHalstead_effort() {
        return halstead_effort;
    }

    public void setHalstead_effort(double halstead_effort) {
        this.halstead_effort = halstead_effort;
    }

    public double getHalstead_volume() {
        return halstead_volume;
    }

    public void setHalstead_volume(double halstead_volume) {
        this.halstead_volume = halstead_volume;
    }

    public double getHalstead_programLevel() {
        return halstead_programLevel;
    }

    public void setHalstead_programLevel(double halstead_programLevel) {
        this.halstead_programLevel = halstead_programLevel;
    }

    public double getHalstead_bugs() {
        return halstead_bugs;
    }

    public void setHalstead_bugs(double halstead_bugs) {
        this.halstead_bugs = halstead_bugs;
    }

    /*
     * Converts AnalysedFile object to JSON and writes to file
     * in the following format:
     *   {
     *     "name" : <string>,
     *     "noOfLinesInFile" : <int>,
     *     "noOfClasses" : <int>,
     *     "singleLineComments" : <int>,
     *     "multilineComments" : <int>,
     *     "totalNoOfComments" : <int>,
     *     "noOfMethods" : <int>,
     *     "halstead_difficulty" : <int>,
     *     "cyclomatic_comp" : <int>,
     *     "commentQuality" : <int>
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

    public int getNoOfLinesOfCode() {
        return noOfLinesOfCode;
    }

    public void setNoOfLinesOfCode(int noOfLinesOfCode) {
        this.noOfLinesOfCode = noOfLinesOfCode;
    }
}