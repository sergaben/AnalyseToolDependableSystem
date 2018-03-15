package Model;

import java.util.ArrayList;
import java.util.Collections;

public class Comment {

    private ArrayList<String> singleLineComments = new ArrayList<>();
    private ArrayList<String> multiLineComments = new ArrayList<>();
    private ArrayList<String > conjunctionsList;
    private String[] conjunctions = {
            "a",
            "the",
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

    private void cleanMultiLineComments() {
        ArrayList<String> newComments = new ArrayList<>();
        for(int i = 0; i < this.multiLineComments.size(); i++) {
            String comment = this.multiLineComments.get(i);
            comment = comment.replace("/", "");
            comment = comment.replace("*", "");
            comment = comment.trim();
            String[] commentLines = comment.split("\n");
            this.multiLineComments.remove(i);
            for(int j = 0; j < commentLines.length; j++) {
                newComments.add(commentLines[j]);
            }
        }
        this.multiLineComments.addAll(newComments);
    }
    private void cleanSingleLineComments() {
        for(int i = 0; i < this.singleLineComments.size(); i++) {
            this.singleLineComments.set(i, this.singleLineComments.get(i).replace("/", ""));
        }
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

        // calculate comment type quality
        int multiLineQual = (40/total) * numMultiLine;

        // calculate use of conjunctions (any more than 1 is bad)
        int numBadComments = 0;
        for(String comment : singleLineComments) {
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

        // clean comments
        cleanMultiLineComments();
        cleanSingleLineComments();

        // calculate line length quality
        int numTooLongLines = 0;

        for (String comment : singleLineComments ) {
            if (comment.length() > 80 ) {
                numTooLongLines++;
            }
        }

        for (String comment : multiLineComments ) {
            if (comment.length() > 80 ) {
                numTooLongLines++;
            }
        }

        int lineLengthQual = (30/total) * (total - numTooLongLines);

        return conjunctionQual + lineLengthQual + multiLineQual;
    }
}

