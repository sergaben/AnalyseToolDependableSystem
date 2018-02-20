package Controller;

import Model.AnalysedFile;
import Model.Counter;
import Model.Regex;
import Model.TokenizerSecond;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import jdk.nashorn.internal.runtime.ParserException;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class UploadController implements Initializable {


    @FXML
    private TextField filepath_input;
    @FXML
    private TextArea pasteBox;
    @FXML
    private MenuBar menuBar;

    private File uploaded_file;

    private Scanner scanner;

    @FXML
    private void chooseFile(ActionEvent event) throws Exception {
        FileChooser fc = new FileChooser();

        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("JAVA files (*.java)", "*.java");
        fc.getExtensionFilters().add(extFilter);
        uploaded_file = fc.showOpenDialog(new Stage());
        if(uploaded_file != null) {
            filepath_input.setText(uploaded_file.getPath());
        }
    }

    @FXML
    private void runAnalysis() throws Exception {
        if (uploaded_file == null) {
            if (!pasteBox.getText().isEmpty()) {
                try {
                    uploaded_file = File.createTempFile("tmp", ".java");
                    BufferedWriter bw = new BufferedWriter(new FileWriter(uploaded_file));
                    bw.write(pasteBox.getText());
                    bw.close();
                    // count lines and comments
                    Counter counterClass = new Counter(uploaded_file);
                    counterClass.runSingleLineMethods();
                    counterClass.countMultiLineCommentsInFile("/*","*/");
                    counterClass.countMultiLineCommentsInFile("/**","*/");
                    // count methods

                    // halstead complexity

                    // cyclomatic complexity
                    // comment quality

                    switchScene(analyse());
                } catch (IOException e) {
                    showErrorDialog(e.getMessage(), "Please try again.");
                }
            } else {
                showErrorDialog(
                        "No file or code provided",
                        "Please select a file or paste your code in the text area for analysis."
                );
            }
        } else {
            switchScene(analyse());
        }
    }

    private AnalysedFile analyse() {
        AnalysedFile aFile = new AnalysedFile();
        try {

            Counter counterClass = new Counter(uploaded_file);
            int comments = counterClass.countMultiLineCommentsInFile("/*", "*/");
            comments += counterClass.countMultiLineCommentsInFile("/**", "*/");
            aFile.setLines(counterClass.countLinesInFile());
            aFile.setComments(comments);

            // count methods
            TokenizerSecond tokenizer = new TokenizerSecond();
            for (int i = 0; i< Regex.regularExpressions.length; i++){
                tokenizer.add(Regex.regularExpressions[i],i);
            }
//            tokenizer.getTokenInfos().forEach(element->{
//                System.out.println(element.regex.toString());
//            });
            try{
                scanner = new Scanner(new FileReader(uploaded_file));
                while(scanner.hasNextLine()){
                    String line = scanner.nextLine().trim();
                    String testLine = "public static void main(String[] args){";
//                    if(!line.startsWith("/")){
//                        System.out.println(true);
//                    }else{
//                        Sys/tem.out.println(false);
//                    }
                    if(line.startsWith("/") || line.startsWith("*")) {
                        //do nothing
                        System.out.println("comment line");
                    }else{
                        tokenizer.tokenize(line);
                    }
                }
//                System.out.println(tokenizer.getTokens().size());
                for(TokenizerSecond.Token tok: tokenizer.getTokens()){
                    System.out.println("" + tok.token + " " + tok.sequence);
                }
            }catch(ParserException | IOException e){
                System.out.println(e.getMessage());
            } finally {
                if(scanner!= null){
                    scanner.close();
                }
            }

            // halstead complexity
            // cyclomatic complexity
            // comment quality
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aFile;
    }

    @FXML
    private void clear() {
        filepath_input.clear();
        uploaded_file = null;
    }

    @FXML
    private void exit() {
        Platform.exit();
    }

    private void showErrorDialog(String header, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Alpha Analysis - Error");
        alert.setHeaderText(header);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public void switchScene(AnalysedFile aFile)
    {

        FXMLLoader loader = new FXMLLoader(getClass()
                .getResource("../View/Results.fxml"));
        Parent root;
        try
        {
            root = (Parent)loader.load();
            ResultsController controller = (ResultsController) loader.getController();

            controller.setFile(aFile);

            Stage stage = (Stage) this.menuBar.getScene().getWindow();
            stage.setScene(new Scene(root, 500, 550));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}
