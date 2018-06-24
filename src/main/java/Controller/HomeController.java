package Controller;

import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeController extends DefaultController implements Initializable {
    public void initialize(URL url, ResourceBundle rb) {
        this.save.disableProperty().setValue(true);
    }
}
