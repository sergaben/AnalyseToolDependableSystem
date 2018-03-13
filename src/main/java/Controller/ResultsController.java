package Controller;

import Model.AnalysedFile;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
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
    @FXML
    private MenuItem open;

    public void setFile(AnalysedFile af) {
        this.file = af;
        this.lines.setText(String.valueOf(af.getNoOfLines()));
        this.numComments.setText(String.valueOf(af.getTotalNoOfComments()));
        this.methods.setText(String.valueOf(af.getNoOfMethods()));
    }

    @FXML
    protected void switchScene(ActionEvent event) {
        if(event.getSource().equals(open)) {
            setFile(this.file);
        } else {
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
}
