import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Upload.fxml"));
        File file = new File("TestCode/javaSample.txt");
        Count countObject = new Count(file);

       countObject.countLinesInFile();
       countObject.countSingleCommentsInFile();
       //countObject.countMultiLineCommentsInFile("/*","*/");
       countObject.countMultiLineCommentsInFile("/*","*/");

        Parent root = (Parent) loader.load();
        //UploadController uc = loader.<UploadController>getController();

        Scene scene = new Scene(root, 500, 500);

        stage.setTitle("Alpha Analysis");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}