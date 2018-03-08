
import Iteration1.Counter3;
import Model.AnalysedFile;
import Model.InitializeAnalysis;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main extends Application {
    private AnalysedFile analysedFile = new AnalysedFile();
    public void start(Stage stage) throws IOException {


        //System.out.println(analysedFile.getNoOfClasses());

        FXMLLoader loader = new FXMLLoader();
        // this works because the Upload and Results were moved to resources
        loader.setLocation(ClassLoader.getSystemResource("View/Upload.fxml"));
        Parent root = loader.load();

//        Controller.UploadController uc = loader.<Controller.UploadController>getController();

        Scene scene = new Scene(root, 500, 575);
        stage.setTitle("Alpha Analysis");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
