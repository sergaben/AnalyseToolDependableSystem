package Controller;

import Model.AnalysedFile;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import java.net.URL;
import java.util.ResourceBundle;
import java.text.DecimalFormat;
public class ComparisonController extends DefaultController implements Initializable {

    private static DecimalFormat df = new DecimalFormat("0.00000");
    private AnalysedFile aFile1, aFile2;
    @FXML
    private Label name, linesNoCommentsNoWhiteSpaces, linesInFile,numComments, methods, halsteadDifficulty,
            halsteadEffort, halsteadVolume, halsteadTime, halsteadBugs,
            halsteadProgramLevel, cyclomatic, commentQual;
    @FXML
    private Label name2, linesNoCommentsNoWhiteSpaces2, linesInFile2,numComments2, methods2, halsteadDifficulty2,
            halsteadEffort2, halsteadVolume2, halsteadTime2, halsteadBugs2,
            halsteadProgramLevel2, cyclomatic2, commentQual2;

    public void setFiles(AnalysedFile f1, AnalysedFile f2) {
        this.aFile1 = f1;
        this.aFile2 = f2;

        // set aFile1 values
        this.name.setText(aFile1.getName());
        this.linesNoCommentsNoWhiteSpaces.setText(String.valueOf(aFile1.getNoOfLinesOfCode()));
        this.linesInFile.setText(String.valueOf(aFile1.getNoOfLinesInFile()));
        this.numComments.setText(String.valueOf(aFile1.getTotalNoOfComments()));
        this.methods.setText(String.valueOf(aFile1.getNoOfMethods()));
        this.halsteadDifficulty.setText(String.format("%.3f",aFile1.getHalstead_difficulty()));
        this.halsteadEffort.setText(String.format("%.3f",aFile1.getHalstead_effort()));
        this.halsteadVolume.setText(String.format("%.3f",aFile1.getHalstead_volume()));
        this.halsteadTime.setText(String.format("%.3f",aFile1.getHalstead_time()));
        this.halsteadBugs.setText(String.valueOf(df.format(aFile1.getHalstead_bugs())));
        this.halsteadProgramLevel.setText(String.valueOf(df.format(aFile1.getHalstead_programLevel())));
        int cyclomaticComp = 0;
        for(int i : aFile1.getCyclometicComplexityMethods()) {
            cyclomaticComp += i;
        }
        cyclomaticComp = cyclomaticComp/aFile1.getCyclometicComplexityMethods().size();
        this.cyclomatic.setText(String.valueOf(cyclomaticComp));
        this.commentQual.setText(String.valueOf(aFile1.getCommentQuality()) + "%");

        // set aFile2 values
        this.name2.setText(aFile2.getName());
        this.linesNoCommentsNoWhiteSpaces2.setText(String.valueOf(aFile2.getNoOfLinesOfCode()));
        this.linesInFile2.setText(String.valueOf(aFile2.getNoOfLinesInFile()));
        this.numComments2.setText(String.valueOf(aFile2.getTotalNoOfComments()));
        this.methods2.setText(String.valueOf(aFile2.getNoOfMethods()));
        this.halsteadDifficulty2.setText(String.format("%.3f",aFile2.getHalstead_difficulty()));
        this.halsteadEffort2.setText(String.format("%.3f",aFile2.getHalstead_effort()));
        this.halsteadVolume2.setText(String.format("%.3f",aFile2.getHalstead_volume()));
        this.halsteadTime2.setText(String.format("%.3f",aFile2.getHalstead_time()));
        this.halsteadBugs2.setText(String.valueOf(df.format(aFile2.getHalstead_bugs())));
        this.halsteadProgramLevel2.setText(String.valueOf(df.format(aFile2.getHalstead_programLevel())));
        cyclomaticComp = 0;
        for(int i : aFile2.getCyclometicComplexityMethods()) {
            cyclomaticComp += i;
        }
        cyclomaticComp = cyclomaticComp/aFile2.getCyclometicComplexityMethods().size();
        this.cyclomatic2.setText(String.valueOf(cyclomaticComp));
        this.commentQual2.setText(String.valueOf(aFile2.getCommentQuality()) + "%");

        highlightComparison();
    }

    private boolean checkLess(double a, double b) {
        if (a < b) {
            return true;
        }
        return false;
    }

    private void setColour(Label a, Label b) {
        if (checkLess(Double.parseDouble(a.getText()), Double.parseDouble(b.getText()))) {
            a.setTextFill(Color.GREEN);
            b.setTextFill(Color.RED);
        } else {
            a.setTextFill(Color.RED);
            b.setTextFill(Color.GREEN);
        }
    }
    private void highlightComparison() {
        setColour(halsteadDifficulty, halsteadDifficulty2);
        setColour(halsteadEffort, halsteadEffort2);
        setColour(halsteadVolume, halsteadVolume2);
        setColour(halsteadTime, halsteadTime2);
        setColour(halsteadProgramLevel, halsteadProgramLevel2);
        setColour(halsteadBugs, halsteadBugs2);
        setColour(cyclomatic, cyclomatic2);
        if(Integer.parseInt(commentQual.getText().replace("%", "")) > Integer.parseInt(commentQual2.getText().replace("%", ""))) {
            commentQual.setTextFill(Color.GREEN);
            commentQual2.setTextFill(Color.RED);
        } else {
            commentQual.setTextFill(Color.RED);
            commentQual2.setTextFill(Color.GREEN);
        }
    }

    public void initialize(URL url, ResourceBundle rb) {
        this.save.disableProperty().setValue(true);
    }
}
