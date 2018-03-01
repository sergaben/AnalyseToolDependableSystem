package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class Counter {
    private File filename;
    private Scanner scanner = null;
    private final String OPENBRACE = "\\{";

    public Counter(File filename) throws Exception {
        if(!filename.isFile()){
            throw new Exception("Please insert a valid file path");
        }else{
            this.filename = filename;
        }


    }

    public void runSingleLineMethods(){
        countLinesInFile();
        countSingleCommentsInFile();
    }

    public int countLinesInFile(){

        ArrayList<String> lines = new ArrayList<>();

        try{
            scanner = new Scanner(new FileReader(filename));
            scanner.useDelimiter(OPENBRACE);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine().trim();
                lines.add(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(scanner!= null){
                scanner.close();
            }
        }
        return lines.size();
    }

    public int countSingleCommentsInFile(){
         ArrayList<String> linesOfForwardSlashesComments = new ArrayList<>();

        try {
            scanner = new Scanner(new FileReader(filename));
            while(scanner.hasNextLine()){
                String line = scanner.nextLine().trim();
                if(!line.isEmpty() && line.contains("//")){
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
        if(linesOfForwardSlashesComments.size()==0){
            System.out.println("There are no single line comments in this file");
        }else{
            System.out.println("Number of single line comments: "+linesOfForwardSlashesComments.size());
        }
        return linesOfForwardSlashesComments.size();
    }

    private ArrayList<String> addLinesToArray(){
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

    public int countMultiLineCommentsInFile(String commentDelimiterStart, String commentDelimiterEnd){
        ArrayList<String> lines = addLinesToArray();
        ArrayList<String> linesOfForwardSlashesCommentsWithAsterisk = new ArrayList<>();

        boolean previousLineComment = false;
        String commentDelimiterStartOfComment = " ";
        for (String line : lines) {
            if (checkWhetherStringStartWithJavaDocOrMultiLineComments(line, commentDelimiterStart)) {

                previousLineComment = true;
                commentDelimiterStartOfComment = commentDelimiterStart;
                linesOfForwardSlashesCommentsWithAsterisk.add(line);
            } else if (!line.contains(commentDelimiterEnd) && previousLineComment) {
                linesOfForwardSlashesCommentsWithAsterisk.add(line);
            } else if (line.contains(commentDelimiterEnd) && commentDelimiterStartOfComment.equals(commentDelimiterStart)) {
                linesOfForwardSlashesCommentsWithAsterisk.add(line);
                previousLineComment = false;
                commentDelimiterStartOfComment = " ";
            }
        }
        if(linesOfForwardSlashesCommentsWithAsterisk.size() == 0){
            System.out.println("There are not multi-line or JavaDoc comments in this file");
        }else{
            //linesOfForwardSlashesCommentsWithAsterisk.forEach(System.out::println);
            System.out.println("Number of multi-line or JavaDoc comments:" + linesOfForwardSlashesCommentsWithAsterisk.size());
        }

//        if(lines.get(i).contentEquals(commentDelimiterStart)){
//                previousLineComment = true;
//                commentDelimiterStartOfComment = commentDelimiterStart;
//                linesOfForwardSlashesCommentsWithAsterisk.add(lines.get(i));
//            }
        /* fsdafsda
        fasdfsdaf
        fasdfsda
        fasdfasd
        fasdfsd
         */

//        try {
//            int a = 0;
//            do{
//                if(lines.get(a).startsWith(commentDelimiterStart)){
//                    linesOfForwardSlashesCommentsWithAsterisk.add(lines.get(a));
////                    if(a>0) {
////                        if (lines.get(a - 1).startsWith(commentDelimiterStart)) {
////                            linesOfForwardSlashesCommentsWithAsterisk.add(lines.get(a));
////                        }
////                    }
//                }else{
//                   // linesOfForwardSlashesCommentsWithAsterisk.add(lines.get(a));
//                    a++;
//                }
//            }while(!lines.get(a).startsWith(commentDelimiterEnd));

            //linesOfForwardSlashesCommentsWithAsterisk.forEach(System.out::println);
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
////            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }finally{
//            if(scanner!=null) {
//                scanner.close();
//            }
//        }
        if(commentDelimiterStart.equals("/**")){
//            System.out.println("Number of lines within a JavaDoc comment: " + linesOfForwardSlashesCommentsWithAsterisk.size());
//            System.out.println("Set of multi-line comments in the code sample: " + setOfcomments);
        }else{
//            System.out.println("Number of lines within a multi-line comment: " + linesOfForwardSlashesCommentsWithAsterisk.size());
//            System.out.println("Set of multi-line comments in the code sample: " + setOfcomments);
        }
        return linesOfForwardSlashesCommentsWithAsterisk.size();
    }
    //TODO - solve problem with multi-line comments and JavaDoc comments
    private boolean checkWhetherStringStartWithJavaDocOrMultiLineComments(String lineToCheck, String delimiterStart){
        ArrayList<Boolean> charactersInCommentLine = new ArrayList<>();
        String beginningOfLine ;
        if(lineToCheck.length()>2){

            beginningOfLine = lineToCheck.substring(0,3);
            if(beginningOfLine.startsWith(delimiterStart)){
                return true;
            }
        }
        return false;
//        char[] array = lineToCheck.toCharArray();
//        char[] delimiterStartCharArray = delimiterStart.toCharArray();
//        for(int i=0;i<array.length;i++){
//            for(int e=0;e<delimiterStartCharArray.length;e++){
//
//                if(array[i] == delimiterStartCharArray[e]){
//
//                    charactersInCommentLine.add(true);
//                }
//            }
//        }
//        for(Boolean value: charactersInCommentLine){
//            if(value){
//                return true;
//            }
//        }
//        return false;
    }
}
