package Controller;

import Model.AnalysedFile;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;
import java.text.DecimalFormat;

public class ResultsController extends DefaultController {

    private static DecimalFormat df2 = new DecimalFormat(".##");
    @FXML
    private Label lines;
    @FXML
    private Label numComments;
    @FXML
    private Label methods;
    @FXML
    private Label halsteadDifficulty;
    @FXML
    private Label cyclomatic;
    @FXML
    private Label halsteadTime;
    @FXML
    private Label halsteadVolume;
    @FXML
    private Label halsteadEffort;
    @FXML
    private Label halsteadProgramLevel;
    @FXML
    private Label halsteadBugs;
    @FXML
    private Label commentQual;

    public void setFile(AnalysedFile file) {
        this.file = file;
        this.halsteadDifficulty.setText(String.format("%.3f",file.getHalstead_difficulty()));
        this.halsteadBugs.setText(String.format("%.3f",file.getHalstead_bugs()));
        this.halsteadEffort.setText(String.format("%.3f",file.getHalstead_effort()));
        this.halsteadTime.setText(String.format("%.3f",file.getHalstead_time()) + " seconds");
        this.halsteadVolume.setText(String.format("%.3f", file.getHalstead_volume()));
        this.halsteadProgramLevel.setText(String.format("%.3f",file.getHalstead_programLevel()));
        // The code below has to be changed to allow multiple methods
        this.cyclomatic.setText(String.valueOf(file.getCyclometicComplexityMethods().get(0)));
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
