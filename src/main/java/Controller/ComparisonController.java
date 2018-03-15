package Controller;

import Model.AnalysedFile;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.text.DecimalFormat;

public class ComparisonController extends DefaultController {
    private static DecimalFormat df = new DecimalFormat("0.00000");
    private AnalysedFile aFile1, aFile2;
    @FXML
    private Label name, lines, numComments, methods, halsteadDifficulty,
            halsteadEffort, halsteadVolume, halsteadTime, halsteadBugs,
            halsteadProgramLevel, cyclomatic, commentQual;
    @FXML
    private Label name2, lines2, numComments2, methods2, halsteadDifficulty2,
            halsteadEffort2, halsteadVolume2, halsteadTime2, halsteadBugs2,
            halsteadProgramLevel2, cyclomatic2, commentQual2;

    public void setFiles(AnalysedFile f1, AnalysedFile f2) {
        this.aFile1 = f1;
        this.aFile2 = f2;

        this.name.setText(aFile1.getName());
        this.lines.setText(String.valueOf(aFile1.getNoOfLines()));
        this.numComments.setText(String.valueOf(aFile1.getTotalNoOfComments()));
        this.methods.setText(String.valueOf(aFile1.getNoOfMethods()));
        this.halsteadDifficulty.setText(String.format("%.3f",aFile1.getHalstead_difficulty()));
        this.halsteadEffort.setText(String.format("%.3f",aFile1.getHalstead_effort()));
        this.halsteadVolume.setText(String.format("%.3f",aFile1.getHalstead_volume()));
        this.halsteadTime.setText(String.format("%.3f",aFile1.getHalstead_time()));
        this.halsteadBugs.setText(String.valueOf(df.format(file.getHalstead_bugs())));
        this.halsteadProgramLevel.setText(String.valueOf(df.format(file.getHalstead_programLevel())));
        int cyclomaticComp = 0;
        for(int i : aFile1.getCyclometicComplexityMethods()) {
            cyclomaticComp += i;
        }
        this.cyclomatic.setText(String.valueOf(cyclomaticComp));
        this.commentQual.setText(String.valueOf(aFile1.getCommentQuality()));

        this.name2.setText(aFile2.getName());
        this.lines2.setText(String.valueOf(aFile2.getNoOfLines()));
        this.numComments2.setText(String.valueOf(aFile2.getTotalNoOfComments()));
        this.methods2.setText(String.valueOf(aFile2.getNoOfMethods()));
        this.halsteadDifficulty2.setText(String.format("%.3f",aFile2.getHalstead_difficulty()));
        this.halsteadEffort2.setText(String.format("%.3f",aFile2.getHalstead_effort()));
        this.halsteadVolume2.setText(String.format("%.3f",aFile2.getHalstead_volume()));
        this.halsteadTime2.setText(String.format("%.3f",aFile2.getHalstead_time()));
        this.halsteadBugs2.setText(String.valueOf(df.format(file.getHalstead_bugs())));
        this.halsteadProgramLevel2.setText(String.valueOf(df.format(file.getHalstead_programLevel())));
        cyclomaticComp = 0;
        for(int i : aFile2.getCyclometicComplexityMethods()) {
            cyclomaticComp += i;
        }
        this.cyclomatic2.setText(String.valueOf(cyclomaticComp));
        this.commentQual2.setText(String.valueOf(aFile2.getCommentQuality()));
    }
}
