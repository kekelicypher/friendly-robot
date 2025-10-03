package factorial;

import static org.junit.Assert.*;
import org.junit.*;
import java.io.*;


public class factorialTest {

    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;
    private ByteArrayOutputStream outContent;

    @Before
    public void setUpStreams() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    public void testMainWithInput5() {
        String input = "5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        factorial.main(new String[]{});
        String output = outContent.toString();
        assertTrue(output.contains("Enter a number:"));
        assertTrue(output.trim().endsWith("120"));
    }

    @Test
    public void testMainWithInput0() {
        String input = "0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        factorial.main(new String[]{});
        String output = outContent.toString();
        assertTrue(output.contains("Enter a number:"));
        assertTrue(output.trim().endsWith("1"));
    }

    @Test
    public void testMainWithInput1() {
        String input = "1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        factorial.main(new String[]{});
        String output = outContent.toString();
        assertTrue(output.contains("Enter a number:"));
        assertTrue(output.trim().endsWith("1"));
    }

    @Test
    public void testMainWithInput3() {
        String input = "3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        factorial.main(new String[]{});
        String output = outContent.toString();
        assertTrue(output.contains("Enter a number:"));
        assertTrue(output.trim().endsWith("6"));
    }
}