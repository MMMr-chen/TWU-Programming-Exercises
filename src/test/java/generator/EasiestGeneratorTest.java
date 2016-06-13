package generator;

import generator.EasiestGenerator;
import org.junit.Before;
import org.junit.Test;
import printer.Printer;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class EasiestGeneratorTest {
    private Printer printer;
    private EasiestGenerator generator;

    @Before
    public void setUp() {
        printer = mock(Printer.class);
        generator = new EasiestGenerator(printer);
    }

    @Test
    public void should_print_correct_string() {
        generator.generate();
        verify(printer).print("*");

    }
}
