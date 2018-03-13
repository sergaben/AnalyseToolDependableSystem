package Controller;

import Model.AnalysedFile;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;

public class DefaultController {

    protected AnalysedFile file = new AnalysedFile();

    protected void switchScene() {

    }

    /* Open saved (.atds) file,
     * pass to results page
     */
    @FXML
    private void open(){
        FileChooser fc = new FileChooser();
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("ATDS Files", "*.atds");
        fc.getExtensionFilters().add(extFilter);
        File openFile = fc.showOpenDialog(new Stage());

        file = AnalysedFile.getFromJSON(openFile);
        switchScene();
    }

    /*
     * Save analysis:
     * - choose save location
     * - convert AnalysedFile.java to '<saved_filename>.atds'
     * - save to user destination
     */
    @FXML
    protected void save() {
        FileChooser fc = new FileChooser();

        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("ATDS Files", "*.atds");
        fc.getExtensionFilters().add(extFilter);
        File savedFile = fc.showSaveDialog(new Stage());
        if(savedFile != null) {
            try {
                this.file.setName(savedFile.getName());
                AnalysedFile.exportToJSON(this.file, savedFile);
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    protected void exit() {
        Platform.exit();
    }
}
