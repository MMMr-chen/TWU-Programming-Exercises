package generator;

import org.junit.Before;
import org.junit.Test;
import printer.Printer;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DiamondNameGeneratorTest {
    private Printer printer;
    private DiamondNameGenerator generator;

    @Before
    public void setUp() {
        printer = mock(Printer.class);
        generator = new DiamondNameGenerator(printer);
    }

    @Test
    public void should_print_nothing_n_is_0() {
        int n=0;
        generator.generate(n);
        verify(printer).print("");

    }
    @Test
    public void should_print_correct_string_n_is_30() {
        int n=3;
        generator.generate(n);
        verify(printer).print("  *\n ***\nzhChen\n ***\n  *\n");

    }


}