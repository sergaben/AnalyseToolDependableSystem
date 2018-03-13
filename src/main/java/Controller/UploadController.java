package Controller;

import Iteration1.Counter3;
import Model.AnalysedFile;
import Model.InitializeAnalysis;
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

import java.io.*;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ResourceBundle;
import java.util.Scanner;

public class UploadController implements Initializable {

    @FXML
    private TextField filepath_input;
    @FXML
    private TextArea pasteBox;
    @FXML
    private MenuBar menuBar;
    @FXML
    private TitledPane TPane;
    @FXML
    private CheckBox halstead;
    @FXML
    private CheckBox cyclomatic;
    @FXML
    private CheckBox commentQual;

    private File uploaded_file;

    private Scanner scanner;

    private InitializeAnalysis initializeAnalysis;

    private AnalysedFile analysedFile = new AnalysedFile();

    @FXML
    private void chooseFile(ActionEvent event) throws Exception {
        FileChooser fc = new FileChooser();

        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("JAVA files (*.java)", "*.java");
        fc.getExtensionFilters().add(extFilter);
        uploaded_file = fc.showOpenDialog(new Stage());
        if(uploaded_file != null) {
            filepath_input.setText(uploaded_file.getPath());

            //TPane.disableProperty().setValue(true);
            //TPane.expandedProperty().setValue(false);
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

//                    String runSingleLineMethods = "something";
//                    Counter3 counter3 = new Counter3(uploaded_file);
//                    counter3.runSingleLineMethods();
                    // count methods

                    // halstead complexity

                    // cyclomatic complexity
                    // comment quality

                    //switchScene(analyse());
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
//        AnalysedFile aFile = new AnalysedFile();
        try {
//          Path path = Paths.get("testFileForANTLR.java");
//          File file = new File(path.toAbsolutePath().toString());
            initializeAnalysis = new InitializeAnalysis();
//          System.out.println("fasfadsfasfsafsdafsadfs");
            initializeAnalysis.startAnalyserFile(analysedFile,uploaded_file);
//          System.out.println(analysedFile.getSingleLineComments());
//          System.out.println(analysedFile.getMultilineComments());
//          System.out.println(analysedFile.getTotalNoOfComments());
//          System.out.println(analysedFile.getNoOfLines());
//          System.out.println(analysedFile.getNoOfClasses());
//          System.out.println(analysedFile.getNoOfMethods());
            analysedFile.getCyclometicComplexityMethods().forEach(cyclomaticComplexity->{
//          System.out.println("//////////////////");
//          System.out.println(cyclomaticComplexity.getBodyMethod());
//          System.out.println("Cyclomatic complexity for the above method: "+ cyclomaticComplexity.getCyclomaticComplexity());
//          System.out.println("Cyclomatic complexity = "+ cyclomaticComplexity.getCyclomaticComplexity() + "%");
//
//          System.out.println("//////////////////");
            });



//            Counter counterClass = new Counter(uploaded_file);
//            int comments = counterClass.countMultiLineCommentsInFile("/*", "*/");
//            comments += counterClass.countMultiLineCommentsInFile("/**", "*/");
//            aFile.setNoOfLines(counterClass.countLinesInFile());
//            aFile.setComments(comments );

            // count methods
            // halstead complexity
            // cyclomatic complexity
            // comment quality
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
        return analysedFile;
    }

    @FXML
    private void clear() {
        filepath_input.clear();
        uploaded_file = null;
        TPane.disableProperty().setValue(false);
        TPane.expandedProperty().setValue(true);
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


    private void switchScene(AnalysedFile aFile)
    {


        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(ClassLoader.getSystemResource("View/Results.fxml"));
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

    @FXML
    private void newMenu() {
            System.out.println();
    }

//     open saved (.atds) file
//     rename to .java file
//     pass to results page

    @FXML
    private void open(){
        FileChooser fc = new FileChooser();
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("ATDS Files", "*.atds");
        fc.getExtensionFilters().add(extFilter);
        File openFile = fc.showOpenDialog(new Stage());

        AnalysedFile a = AnalysedFile.getFromJSON(openFile);
        switchScene(a);
    }

}
