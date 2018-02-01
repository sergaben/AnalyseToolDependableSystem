import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("TestCode/javaSample.txt");
       Count countObject = new Count(file);

       countObject.countLinesInFile();
       countObject.countSingleCommentsInFile();
       //countObject.countMultiLineCommentsInFile("/*","*/");
       countObject.countMultiLineCommentsInFile("/**","*/");
    }


}