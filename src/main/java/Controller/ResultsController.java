package Controller;

import Model.AnalysedFile;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;

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
        this.halstead.setText(String.valueOf(file.getHalstead_comp()));
        // The code below has to be changed to allow multiple methods
        this.cyclomatic.setText(String.valueOf(file.getCyclometicComplexityMethods().get(0)));
        this.lines.setText(String.valueOf(file.getNoOfLines()));
        this.numComments.setText(String.valueOf(file.getTotalNoOfComments()));
        this.methods.setText(String.valueOf(file.getNoOfMethods()));
        this.commentQual.setText(String.valueOf(file.getCommentQuality()) + "%");
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