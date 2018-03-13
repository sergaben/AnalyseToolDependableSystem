package Controller;

import Model.AnalysedFile;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ResultsController implements Initializable {

    @FXML
    private Label noOfLines;
    @FXML
    private Label comments;
    private AnalysedFile file;
    @FXML
    private Label noOfMethods;
    @FXML
    private Label cyclomaticComplexity;

    @FXML
    private void exit() {
        Platform.exit();
    }

    public void setFile(AnalysedFile file) {
        this.file = file;
        System.out.println(file.getNoOfLines());
        this.noOfLines.setText(String.valueOf(file.getNoOfLines()));
        this.comments.setText(String.valueOf(file.getTotalNoOfComments()));
        this.noOfMethods.setText(String.valueOf(file.getNoOfMethods()));
        // The code below has to be changed to allow multiple methods
        this.cyclomaticComplexity.setText(String.valueOf(file.getCyclometicComplexityMethods().get(0).getCyclomaticComplexity()) + "%");
    }

    public void switchScene()
    {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(ClassLoader.getSystemResource("View/Results.fxml"));
        Parent root;
        try
        {
            root = (Parent)loader.load();
            UploadController controller = (UploadController) loader.getController();

            Stage stage = (Stage) this.noOfLines.getScene().getWindow();
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
