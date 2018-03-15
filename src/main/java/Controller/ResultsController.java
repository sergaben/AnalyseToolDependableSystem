package Controller;

import Model.AnalysedFile;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;

public class ResultsController extends DefaultController {

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
        int cyclomaticComp = 0;
        for(int i : file.getCyclometicComplexityMethods()) {
            cyclomaticComp += i;
        }
        this.cyclomatic.setText(String.valueOf(cyclomaticComp));
        this.lines.setText(String.valueOf(file.getNoOfLines()));
        this.numComments.setText(String.valueOf(file.getTotalNoOfComments()));
        this.methods.setText(String.valueOf(file.getNoOfMethods()));
        this.commentQual.setText(String.valueOf(file.getCommentQuality()) + "%");
    }

    private AnalysedFile getComparisonFile(){
        FileChooser fc = new FileChooser();
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("ATDS Files", "*.atds");
        fc.getExtensionFilters().add(extFilter);
        File openFile = fc.showOpenDialog(new Stage());

        AnalysedFile file = AnalysedFile.getFromJSON(openFile);
        file.setName(openFile.getName());
        return file;
    }

    @FXML
    protected void comparison() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(ClassLoader.getSystemResource("View/ComparisonResults.fxml"));
        Parent root;
        try {
            AnalysedFile comp = getComparisonFile();

            root = loader.load();
            ComparisonController c = loader.getController();
            c.setFiles(this.file, comp);

            Stage stage = (Stage) this.menuBar.getScene().getWindow();
            stage.setScene(new Scene(root, 500, 550));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}