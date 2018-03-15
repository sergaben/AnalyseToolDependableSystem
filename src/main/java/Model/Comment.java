package Model;

import java.util.ArrayList;
import java.util.Collections;

public class Comment {

    private int commentQuality;
    private ArrayList<String> singleLineComments = new ArrayList<>();
    private ArrayList<String> multiLineComments = new ArrayList<>();
    private ArrayList<String > conjunctionsList;
    private String[] conjunctions = {
            "And",
            "Or",
            "But",
            "Nor",
            "So",
            "For",
            "Yet",
            "After",
            "Although",
            "As",
            "As If",
            "As Long As",
            "Because",
            "Before",
            "Even If",
            "Even Though",
            "Once",
            "Since",
            "So That",
            "Though",
            "Till",
            "Unless",
            "Until",
            "What",
            "When",
            "Whenever",
            "Wherever",
            "Whether",
            "While"
    };

    public Comment() {
        this.conjunctionsList = new ArrayList<>();
        Collections.addAll(this.conjunctionsList, this.conjunctions);
    }

    public ArrayList<String> getSingleLineComments() {
        return singleLineComments;
    }

    public void setSingleLineComments(String lineComment) {
        singleLineComments.add(lineComment);
    }

    public ArrayList<String> getMultiLineComments() {
        return multiLineComments;
    }

    public void setMultiLineComments(String multiLineComment) {
        multiLineComments.add(multiLineComment);
    }

    private String[] cleanMultiLineComment(String comment) {
        comment = comment.replace("/", "");
        comment = comment.replace("*", "");
        comment = comment.trim();
        String[] commentLines = comment.split("\n");
        System.out.println("COMMENT LINES: " + commentLines.length);
        return commentLines;
    }

    /*
     * Comment Quality is measured out of 100 and determined by 3 factors:
     *  - Comment line lengths (30%)
     *  - Use of conjunctions   (30%)
     *  - Types of comments used (multiline preferred) (40%)
     */
    public int getCommentQuality() {
        int numSingleLine = singleLineComments.size();
        int numMultiLine = multiLineComments.size();
        int total = numMultiLine + numSingleLine;
        System.out.println("NUMBER OF COMMENTS: " + total);

        // calculate comment type quality
        int multiLineQual = (40/total) * numMultiLine;
        System.out.println("Multi qual: " + multiLineQual);

        // calculate line length quality
        int numTooLongLines = 0;

        for (String comment : singleLineComments ) {
            comment.replace("/", "");
            if (comment.length() > 80 ) {
                numTooLongLines++;
            }
        }

        for (String comment : multiLineComments ) {
            comment.replace("/", "");
            comment.replace("*", "");
            if (comment.length() > 80 ) {
                numTooLongLines++;
            }
        }

        int lineLengthQual = (30/total) * (total - numTooLongLines);

        // calculate use of conjunctions
        int numBadComments = 0;
        for(String comment : singleLineComments) {
            comment = comment.replace("/", "");
            System.out.println(comment);
            int numConjunctions = 0;
            for(String con : this.conjunctionsList) {
                if(comment.toLowerCase().contains(con.toLowerCase())) {
                    numConjunctions++;
                }
            }
            if(numConjunctions > 1) {
                numBadComments++;
            }
        }
        for(String comment : multiLineComments) {
            String[] commentLines = cleanMultiLineComment(comment);
            int numConjunctions = 0;
            for(String con : this.conjunctionsList) {
                if(comment.toLowerCase().contains(con.toLowerCase())) {
                    numConjunctions++;
                }
            }
            if(numConjunctions > 1) {
                numBadComments++;
            }
        }

        int conjunctionQual = (30/total) * (total - numBadComments);

        return conjunctionQual + lineLengthQual + multiLineQual;
    }
}

