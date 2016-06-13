package generator;

import org.junit.Before;
import org.junit.Test;
import printer.Printer;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class HorizontalGeneratorTest {
    private Printer printer;
    private HorizontalGenerator generator;

    @Before
    public void setUp() {
        printer = mock(Printer.class);
        generator = new HorizontalGenerator(printer);
    }

    @Test
    public void should_print_nothing_n_is_0() {
        int n=0;
        generator.generate(n);
        verify(printer).print("");

    }
    @Test
    public void should_print_correct_string_n_is_30() {
        int n=30;
        generator.generate(n);
        verify(printer).print("");

    }
}