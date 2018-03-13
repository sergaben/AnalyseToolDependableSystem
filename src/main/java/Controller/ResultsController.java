package Controller;

import Model.AnalysedFile;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ResultsController extends DefaultController {

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

    public void setFile(AnalysedFile file) {
        this.file = file;
        this.lines.setText(String.valueOf(file.getNoOfLines()));
        this.numComments.setText(String.valueOf(file.getTotalNoOfComments()));
        this.methods.setText(String.valueOf(file.getNoOfMethods()));
    }

    @FXML
    protected void switchScene() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(ClassLoader.getSystemResource("View/Upload.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) this.lines.getScene().getWindow();
            stage.setScene(new Scene(root, 500, 550));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
