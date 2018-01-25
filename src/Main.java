import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static final String REGEX = "\\{";
    public static void main(String[] args) {
        countLines("TestCode/javaSample.txt");
    }
    public static void countLines(String filename){

        Scanner scanner = null;
        ArrayList<String> linesOfCode = new ArrayList<>();
        ArrayList<String> linesOfComments = new ArrayList<>();
        try{
            scanner = new Scanner(new FileReader(filename));
            scanner.useDelimiter(REGEX);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine().trim();
                if(!line.isEmpty()){
                    if(!line.startsWith("//")){
                        linesOfCode.add(line);
                    }else{
                        linesOfComments.add(line);
                    }

                }

                //String anotherLine = scanner.nextLine();
                //System.out.println("   "+ line + "     ");
            }
//            if(scanner.hasNextLine()){
//                String oneline = scanner.nextLine();
//
//                //String anotherLine = scanner.nextLine();
//                System.out.println("   "+ oneline + "     ");
//            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(scanner!= null){
                scanner.close();
            }
        }
        //linesOfCode.forEach(line-> System.out.println(line));
        System.out.println("Lines of Code: " + linesOfCode.size());
        System.out.println("Lines of Comments: " + linesOfComments.size());
    }
}
