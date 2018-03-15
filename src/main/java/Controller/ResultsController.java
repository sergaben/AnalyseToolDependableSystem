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

    private static DecimalFormat df = new DecimalFormat("0.00000");

    @FXML
    private Label name, linesNoCommentsNoWhiteSpaces,linesInFile, numComments, methods, halsteadDifficulty, cyclomatic,
            halsteadTime, halsteadVolume, halsteadEffort, halsteadProgramLevel,
            halsteadBugs, commentQual, hald_lbl, halb_lbl, hale_lbl, halv_lbl,
            halt_lbl, halp_lbl, cyc_lbl, com_lbl;

    public void setFile(AnalysedFile file, boolean bHal, boolean bCyc, boolean bCom) {
        this.file = file;
        this.name.setText(this.file.getName());
        this.linesInFile.setText(String.valueOf(this.file.getNoOfLinesInFile()));
        this.linesNoCommentsNoWhiteSpaces.setText(String.valueOf(file.getNoOfLinesOfCode()));
        this.numComments.setText(String.valueOf(file.getTotalNoOfComments()));
        this.methods.setText(String.valueOf(file.getNoOfMethods()));

        if (bHal) {
            this.halsteadDifficulty.setText(String.format("%.3f", file.getHalstead_difficulty()));
            this.halsteadBugs.setText(String.valueOf(df.format(file.getHalstead_bugs())));
            this.halsteadEffort.setText(String.format("%.3f", file.getHalstead_effort()));
            this.halsteadTime.setText(String.format("%.3f", file.getHalstead_time()) + " seconds");
            this.halsteadVolume.setText(String.format("%.3f", file.getHalstead_volume()));
            this.halsteadProgramLevel.setText(String.valueOf(df.format(file.getHalstead_programLevel())));
        } else {
            this.halp_lbl.disableProperty().setValue(true);
            this.hald_lbl.disableProperty().setValue(true);
            this.halb_lbl.disableProperty().setValue(true);
            this.halv_lbl.disableProperty().setValue(true);
            this.halt_lbl.disableProperty().setValue(true);
            this.hale_lbl.disableProperty().setValue(true);
        }

        if(bCyc) {
            int cyclomaticComp = 0;
            for (int i : file.getCyclometicComplexityMethods()) {
                cyclomaticComp += i;
            }
            this.cyclomatic.setText(String.valueOf(cyclomaticComp));
        } else {
            this.cyc_lbl.disableProperty().setValue(true);
        }
        if (bCom) {
            this.commentQual.setText(String.valueOf(file.getCommentQuality()) + "%");
        } else {
            this.com_lbl.disableProperty().setValue(true);
        }
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
            stage.setScene(new Scene(root, 800, 760));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}