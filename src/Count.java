import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class Count {
    private String filename;
    private String codeToCount;
    private Scanner scanner = null;
    private final String OPENBRACE = "\\{";

    public Count(String filename) throws Exception {
        if(filename.isEmpty()){
            throw new Exception("Please insert a name for the file");
        }else{
            this.filename = filename;
        }


    }

    public void countLinesInTextFile(){

        ArrayList<String> lines = new ArrayList<>();

        try{
            scanner = new Scanner(new FileReader(filename));
            scanner.useDelimiter(OPENBRACE);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine().trim();
                if(!line.isEmpty()){
                        lines.add(line);
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(scanner!= null){
                scanner.close();
            }
        }
        //if(!line.startsWith("//") || !line.startsWith("/*") ||!line.endsWith("*/")){
        //System.out.println("Number of comments are: "+ linesOfComments.size());
        System.out.println("Number of lines without blank lines: "+lines.size());
    }

    public void countCommentsForwardSlashesInTextFile(){
         ArrayList<String> linesOfForwardSlashesComments = new ArrayList<>();

        try {
            scanner = new Scanner(new FileReader(filename));
            while(scanner.hasNextLine()){
                String line = scanner.nextLine().trim();
                if(!line.isEmpty() && line.startsWith("//")){
                    linesOfForwardSlashesComments.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Number of comments with forward slashes: "+linesOfForwardSlashesComments.size());
    }

    public void countCommentsForwardSlashesAndAsteriskInTextFile(){
        ArrayList<String> allLines = new ArrayList<>();
        ArrayList<String> linesOfForwardSlashesCommentsWithAsterisk = new ArrayList<>();
        ArrayList<Integer> startOfComment = new ArrayList<>();
        ArrayList<Integer> endOfComment = new ArrayList<>();
        int setOfcomments = 0;
        try {
            scanner = new Scanner(new FileReader(filename));
            String previousLine = " ";
            while(scanner.hasNextLine()){
                String line = scanner.nextLine().trim();
                if(!line.isEmpty()){
                   allLines.add(line);

                }
                //previousLine = line;
            }
            for(int i = 0;i<allLines.size();i++){
                // find index of starting comment
                // find index of ending comment
                if(allLines.get(i).equals("/*")){
                    startOfComment.add(i);
                    //linesOfForwardSlashesCommentsWithAsterisk.add(allLines.get(i));
                }else if(allLines.get(i).equals("*/")){
                    endOfComment.add(i);
                }
            }
//
            for(int i = 0;i<startOfComment.size();i++){
                for(int y=startOfComment.get(i);y<endOfComment.get(i)+1;y++){
                    linesOfForwardSlashesCommentsWithAsterisk.add(allLines.get(y));
                }
            }
//
            for(String lineOfComment: linesOfForwardSlashesCommentsWithAsterisk){
                if(lineOfComment.startsWith("/*")){
                    setOfcomments++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Lines of comments with asterisks: " + linesOfForwardSlashesCommentsWithAsterisk.size());
        System.out.println("Set of comments in the code sample: " + setOfcomments);
//        allLines.forEach(System.out::println);
        //System.out.println("Number of comments lines with forward slashes: "+linesOfForwardSlashesCommentsWithAsterisk.size());
    }
}
