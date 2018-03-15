package Controller;

import Model.Analysis;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class UploadController extends DefaultController implements Initializable {

    @FXML
    private TextField filepath_input;
    @FXML
    private TextArea pasteBox;
    @FXML
    private TitledPane TPane;
    @FXML
    private CheckBox halstead, cyclomatic, commentQual;

    private File uploaded_file;

    private Analysis analysis;

    @FXML
    private void chooseFile() {
        FileChooser fc = new FileChooser();

        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("JAVA files (*.java)", "*.java");
        fc.getExtensionFilters().add(extFilter);
        uploaded_file = fc.showOpenDialog(new Stage());
        if(uploaded_file != null) {
            filepath_input.setText(uploaded_file.getPath());
            this.TPane.disableProperty().setValue(true);
        }
    }

    @FXML
    private void runAnalysis() throws IOException {
        if (uploaded_file == null) {
            if (!pasteBox.getText().isEmpty()) {
                try {
                    uploaded_file = File.createTempFile("tmp", ".java");
                    BufferedWriter bw = new BufferedWriter(new FileWriter(uploaded_file));
                    bw.write(pasteBox.getText());
                    bw.close();
                    if(!analyse()){
                        setCheckBox();
                        goToResults();
                    }
                } catch (IOException e) {
                    showErrorDialog(e.getMessage(), "Please try again.");
                }
            } else {
                showErrorDialog(
                        "No file or code provided",
                        "Please select a file or paste your code in the text area for analysis."
                );
            }
        } else {
            if(!analyse()){
                setCheckBox();
                goToResults();
            }
        }
    }

    private void setCheckBox() {
        if(halstead.isSelected()) {
            this.bHal = true;
        }
        if(cyclomatic.isSelected()) {
            this.bCyc = true;
        }
        if(commentQual.isSelected()) {
            this.bCom = true;
        }
    }

    private Boolean analyse() throws IOException {
//        try {

            analysis = new Analysis();
            this.file.setName(uploaded_file.getName());
            if(analysis.startAnalyserFile(this.file,uploaded_file)){
                return true;
            }else {
                return false;
            }
          
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    @FXML
    private void clear() {
        filepath_input.clear();
        uploaded_file = null;
        this.TPane.disableProperty().setValue(false);
    }

    private void showErrorDialog(String header, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Alpha Analysis - Error");
        alert.setHeaderText(header);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @Override
    public void initialize(URL url, ResourceBundle bundle) {
        this.save.disableProperty().setValue(true);
    }
}
