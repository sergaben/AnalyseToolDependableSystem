public class Main {
    public static void main(String[] args) throws Exception {

       Count countObject = new Count("TestCode/javaSample.txt");

       countObject.countLinesInTextFile();
       countObject.countCommentsForwardSlashesInTextFile();
       countObject.countCommentsForwardSlashesAndAsteriskInTextFile();
    }


}