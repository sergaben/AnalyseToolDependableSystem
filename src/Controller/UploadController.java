package Controller;

import Model.Count;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class UploadController implements Initializable {

    @FXML
    private Label upload_lbl;
    @FXML
    private Label text_lbl;
    @FXML
    private Button browse_btn;
    @FXML
    private TextField filepath_input;
    @FXML
    private TextArea pasteBox;
    @FXML
    private MenuBar menuBar;

    private File uploaded_file;

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
                    Count countClass = new Count(uploaded_file);
                    countClass.countLinesInFile();
                    countClass.countSingleCommentsInFile();
                    countClass.countMultiLineCommentsInFile("/*","*/");
                    countClass.countMultiLineCommentsInFile("/**","*/");
                    // count methods
                    // halstead complexity
                    // cyclomatic complexity
                    // comment quality

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
            // count lines and comments
            Count countClass = new Count(uploaded_file);
            countClass.countLinesInFile();
            countClass.countSingleCommentsInFile();
            countClass.countMultiLineCommentsInFile("/*","*/");
            countClass.countMultiLineCommentsInFile("/**","*/");

            // count methods
            // halstead complexity
            // cyclomatic complexity
            // comment quality
        }
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}
