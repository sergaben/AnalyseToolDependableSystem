package Controller;

import Model.AnalysedFile;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;

public class ResultsController {

    @FXML
    private Label lines;
    @FXML
    private Label numComments;
    @FXML
    private Label methods;
    @FXML
    private Label halstead;
    @FXML
    private Label cyclomatic;
    @FXML
    private Label commentQual;
    private AnalysedFile file;

    @FXML
    private void exit() {
        Platform.exit();
    }

    public void setFile(AnalysedFile file) {
        this.file = file;
        this.lines.setText(String.valueOf(file.getNoOfLines()));
        this.numComments.setText(String.valueOf(file.getTotalNoOfComments()));
        this.methods.setText(String.valueOf(file.getNoOfMethods()));
    }

    @FXML
    private void switchScene() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("View/Upload.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) this.lines.getScene().getWindow();
            stage.setScene(new Scene(root, 500, 550));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     * Save analysis:
     * - choose save location
     * - convert AnalysedFile.java to '<saved_filename>.atds'
     * - save to user destination
     */
    @FXML
    private void save() {
        FileChooser fc = new FileChooser();

        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("ATDS Files", "*.atds");
        fc.getExtensionFilters().add(extFilter);
        File savedFile = fc.showSaveDialog(new Stage());
        if(savedFile != null) {
            try {
                this.file.setName(savedFile.getName());
                AnalysedFile.exportToJSON(this.file, savedFile);
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
