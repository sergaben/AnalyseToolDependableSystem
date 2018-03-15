package Model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.io.File;
import java.io.IOException;

public class AnalysisTest {

    private AnalysedFile file = new AnalysedFile();
    private File testFile1 = new File("/users/shanicealexis/Documents/Uni/Dependable Systems/AnalyseToolDependableSystem/TestingFiles/TestCode1.java");

    @Before
    public void setUp() throws Exception {
        Analysis analysis = new Analysis();
        try {
            analysis.startAnalyserFile(this.file, this.testFile1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testCommentQuality() {
        assertEquals(this.file.getCommentQuality(), 53);
    }
}