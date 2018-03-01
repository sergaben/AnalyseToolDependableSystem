package Model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class CounterTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void runSingleLineMethods() throws Exception {
        int expResult = 11;
        File file = new File("../../TestCode/javaSample.java");
        Counter counter = new Counter(file);
        int actResult = counter.countSingleCommentsInFile();
        assertEquals(expResult, actResult);
    }

    @Test
    public void countLinesInFile() throws Exception {
        int expResult = 103;
        File file = new File("../../TestCode/javaSample.java");
        Counter counter = new Counter(file);
        int actResult = counter.countLinesInFile();
        assertEquals(expResult, actResult);
    }

    @Test
    public void countSingleCommentsInFile() {
    }

    @Test
    public void countMultiLineCommentsInFile() {
    }
}