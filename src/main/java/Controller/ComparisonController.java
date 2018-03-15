package Controller;

import Model.AnalysedFile;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ComparisonController extends DefaultController {

    private AnalysedFile aFile1, aFile2;
    @FXML
    private Label name, lines, numComments, methods, halstead, cyclomatic, commentQual;
    @FXML
    private Label name2, lines2, numComments2, methods2, halstead2, cyclomatic2, commentQual2;

    public void setFiles(AnalysedFile f1, AnalysedFile f2) {
        this.aFile1 = f1;
        this.aFile2 = f2;

        this.name.setText(aFile1.getName());
        this.lines.setText(String.valueOf(aFile1.getNoOfLines()));
        this.numComments.setText(String.valueOf(aFile1.getTotalNoOfComments()));
        this.methods.setText(String.valueOf(aFile1.getNoOfMethods()));
        this.halstead.setText(String.valueOf(aFile1.getHalstead_difficulty()));
        this.cyclomatic.setText(String.valueOf(aFile1.getCyclomatic_comp()));
        this.commentQual.setText(String.valueOf(aFile1.getCommentQuality()));

        this.name2.setText(aFile2.getName());
        this.lines2.setText(String.valueOf(aFile2.getNoOfLines()));
        this.numComments2.setText(String.valueOf(aFile2.getTotalNoOfComments()));
        this.methods2.setText(String.valueOf(aFile2.getNoOfMethods()));
        this.halstead2.setText(String.valueOf(aFile2.getHalstead_difficulty()));
        this.cyclomatic2.setText(String.valueOf(aFile2.getCyclomatic_comp()));
        this.commentQual2.setText(String.valueOf(aFile2.getCommentQuality()));
    }

    @FXML
    protected void switchScene() {

    }
}
