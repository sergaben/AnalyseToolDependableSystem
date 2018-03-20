package Model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;


import java.io.File;
import java.io.IOException;

public class AnalysisTest {

    private AnalysedFile aFile1 = new AnalysedFile();
    private File testFile1 = new File("TestCode1.java");

    @Before
    public void setUp() throws Exception {
        Analysis analysis = new Analysis();

        try {
            analysis.startAnalyserFile(this.aFile1, this.testFile1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCommentQuality() {
        assertEquals(53, this.aFile1.getCommentQuality());
    }
    @Test
    public void testMethodCounter(){
        assertEquals(1, this.aFile1.getNoOfMethods());
    }
    @Test
    public void testNumberOfLines(){
        assertEquals(64, this.aFile1.getNoOfLinesOfCode());
    }
    @Test
    public void testNumberOfComments(){
        assertEquals(4, this.aFile1.getTotalNoOfComments());
    }
    @Test
    public void testNumberOfOperands(){
        assertEquals(138, this.aFile1.getTotalNoOfOperands());
    }
    @Test
    public void testUniqueOperands(){
        assertEquals(30, this.aFile1.getNoOfUniqueOperands());
    }
    @Test
    public void testNumberOfOperators(){
        assertEquals(270, this.aFile1.getTotalNoOfOperators());
    }
    @Test
    public void testUniqueOperators(){
        assertEquals(21, this.aFile1.getNoOfUniqueOperators());
    }
    @Test
    public void testNumberOfMethods(){
        assertEquals(1, this.aFile1.getNoOfMethods());
    }
    @Test
    public void testSingleLineComments(){
        assertEquals(2, this.aFile1.getSingleLineComments());
    }
    @Test
    public void testMultiLineComments(){
        assertEquals(2, this.aFile1.getMultilineComments());
    }
    @Test
    public void testCyclomaticComplexity(){
        assertEquals(0, this.aFile1.getCyclomatic_comp());
    }
//    @Test
//    public void testHalsteadDifficulty(){
//        assertEquals(0, this.aFile1.getHalstead_difficulty());
//    }
//    @Test
//    public void testHalsteadEffort(){
//        assertEquals(0, this.aFile1.getHalstead_effort());
//    }
//    @Test
//    public void testHalsteadVolume(){
//        assertEquals(0.0f, this.aFile1.getHalstead_volume());
//    }
//    @Test
//    public void testHalsteadTime(){
//        int expectedResult = 4512;
//        assertEquals("Time took to code.", expectedResult, 43212 this.aFile1.getHalstead_time());
//    }
//    @Test
//    public void testHalsteadProgramLevel(){
//        assertEquals(0, this.aFile1.getHalstead_programLevel());
//    }
//    @Test
//    public void testHalsteadBugs(){
//        assertEquals(0, this.aFile1.getHalstead_bugs());
//    }

}