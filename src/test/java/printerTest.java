import org.junit.Before;
import org.junit.Test;
import printer.Printer;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class printerTest {

    private Printer printer;
    private ByteArrayOutputStream outputStream=new ByteArrayOutputStream();

    @Before
    public void setUp() {
        printer = new Printer();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void should_print_correct_string() {
        String inputStr = "* **";
        printer.print(inputStr);
        assertThat(outputStream.toString(),is("* **\n"));
    }
    
}
