package Controller;

import Model.AnalysedFile;
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
    private Label lines;
    @FXML
    private Label comments;
    private AnalysedFile file;

    public void setFile(AnalysedFile file) {
        this.file = file;
        this.lines.setText(String.valueOf(file.getLines()));
        this.comments.setText(String.valueOf(file.getComments()));
    }

    public void switchScene()
    {

        FXMLLoader loader = new FXMLLoader(getClass()
                .getResource("../../resources/View/Upload.fxml"));
        Parent root;
        try
        {
            root = (Parent)loader.load();
            UploadController controller = (UploadController) loader.getController();

            Stage stage = (Stage) this.lines.getScene().getWindow();
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
