import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class UploadController implements Initializable {

    @FXML
    private Label upload_lbl;
    @FXML
    private Label text_lbl;
    @FXML
    private Button browse_btn;
    @FXML
    private TextField filepath_input;
    @FXML
    private MenuBar menuBar;
    private File uploaded_file;

    @FXML
    private void chooseFile(ActionEvent event) {
        FileChooser fc = new FileChooser();
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("JAVA files (*.java)", "*.java");
        fc.getExtensionFilters().add(extFilter);
        uploaded_file = fc.showOpenDialog(new Stage());
        text_lbl.setText("You uploaded: " + uploaded_file.getName());
    }

    @FXML
    private void exit() {
        Platform.exit();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //menuBar.prefWidthProperty().bind(upload_lbl.getScene().widthProperty());
    }

}
