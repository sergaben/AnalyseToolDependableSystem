import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("View/Upload.fxml"));

        Parent root = (Parent) loader.load();
        //Controller.UploadController uc = loader.<Controller.UploadController>getController();

        Scene scene = new Scene(root, 500, 550);
        stage.setTitle("Alpha Analysis");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
