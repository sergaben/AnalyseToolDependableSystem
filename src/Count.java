import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class Count {
    private File filename;
    private Scanner scanner = null;
    private final String OPENBRACE = "\\{";

    public Count(File filename) throws Exception {
        if(!filename.isFile()){
            throw new Exception("Please insert a name for the file");
        }else{
            this.filename = filename;
        }


    }

    public void countLinesInFile(){

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

        System.out.println("Number of lines without spaces between lines: "+lines.size());
    }

    public void countSingleCommentsInFile(){
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
        }finally{
            if(scanner!=null){
                scanner.close();
            }
        }
        System.out.println("Number of single line comments: "+linesOfForwardSlashesComments.size());
    }

    public ArrayList<String> addLinesToArray(){
        ArrayList<String> allLines = new ArrayList<>();
        try {
            scanner = new Scanner(new FileReader(filename));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (!line.isEmpty()) {
                    allLines.add(line);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            if(scanner!=null){
                scanner.close();
            }
        }
        return allLines;
    }

    public void countMultiLineCommentsInFile(String commentDelimiterStart, String commentDelimiterEnd){
        ArrayList<String> lines = addLinesToArray();
        ArrayList<String> linesOfForwardSlashesCommentsWithAsterisk = new ArrayList<>();
        ArrayList<Integer> startOfComment = new ArrayList<>();
        ArrayList<Integer> endOfComment = new ArrayList<>();
        int setOfcomments = 0;
        try {
            int a = 0;
            do{
                if(lines.get(a).startsWith(commentDelimiterStart)){
                    linesOfForwardSlashesCommentsWithAsterisk.add(lines.get(a));
//                    if(a>0) {
//                        if (lines.get(a - 1).startsWith(commentDelimiterStart)) {
//                            linesOfForwardSlashesCommentsWithAsterisk.add(lines.get(a));
//                        }
//                    }
                }else{
                   // linesOfForwardSlashesCommentsWithAsterisk.add(lines.get(a));
                    a++;
                }
            }while(!lines.get(a).startsWith(commentDelimiterEnd));

            linesOfForwardSlashesCommentsWithAsterisk.forEach(System.out::println);
//            for(int i = 0;i<lines.size();i++){
//                // find index of starting comment
//                // find index of ending comment
//                if(lines.get(i).startsWith(commentDelimiterStart)){
//
//                    startOfComment.add(i);
//                }else if(lines.get(i).startsWith(commentDelimiterEnd)){
//                    endOfComment.add(i);
//                }
//            }
//            startOfComment.forEach(System.out::println);
//            System.out.println("------------------------------------------");
//            endOfComment.forEach(System.out::println);
//            for(int i = 0;i<startOfComment.size();i++){
//                for(int y=startOfComment.get(i);y<endOfComment.get(i)+1;y++){
//                    linesOfForwardSlashesCommentsWithAsterisk.add(lines.get(y));
//                }
//            }
//            for(String lineOfComment: linesOfForwardSlashesCommentsWithAsterisk){
//                if(lineOfComment.startsWith(commentDelimiterStart)){
//                    setOfcomments++;
//                }
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(scanner!=null) {
                scanner.close();
            }
        }
        if(commentDelimiterStart.equals("/**")){
//            System.out.println("Number of lines within a JavaDoc comment: " + linesOfForwardSlashesCommentsWithAsterisk.size());
//            System.out.println("Set of multi-line comments in the code sample: " + setOfcomments);
        }else{
//            System.out.println("Number of lines within a multi-line comment: " + linesOfForwardSlashesCommentsWithAsterisk.size());
//            System.out.println("Set of multi-line comments in the code sample: " + setOfcomments);
        }


    }
}
