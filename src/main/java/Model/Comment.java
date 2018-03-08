package Model;

import java.util.ArrayList;

public class Comment {
    private ArrayList<String> singleLineComments = new ArrayList<>();
    private ArrayList<String> multiLineComments = new ArrayList<>();

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
}

