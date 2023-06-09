/*
 * This file contains JUnit test cases for IntroLab.java
 *
 * Complete the TODO in this file!
 */

import org.junit.*;

import static org.junit.Assert.*;

public class IntroLabTest {
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test(timeout = 10)
    public void testExampleStudent() {
        String expected = "Hello! My name is Stu Dent! " +
                "I like cats more than dogs! Welcome to CSC207!";
        String actual = IntroLab.exampleStudent();
        assertEquals(expected, actual);
    }

    /* TODO: Write a test case for the method you wrote in IntroLab.
     *       If done properly, you should be able to run IntroLabTest and see
     *       the test results.
     * As a reference, we've included testExampleStudent above.
     */


    @Test(timeout = 30)
    public void testbalenth1(){
        String expected = "Hi! My name is T B! I like dogs more than cats! I'm excited for CSC207!";
        String actual = IntroLab.balenth1();
        assertEquals(expected, actual);
    }

    @Test()
    public void testchowd723() {
        String expected = "Guten targ! My name is Shaswata Chowdhury! " + "I like cats more than dogs! " +
                "They are the objectively superior species. If you disagree, reconsider or else.";
        String actual = IntroLab.chowd723();
        assertEquals(expected, actual);
    }
}
