package generator;

import org.junit.Before;
import org.junit.Test;
import printer.Printer;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class RightTriangleGeneratorTest {
    private Printer printer;
    private RightTriangleGenerator generator;

    @Before
    public void setUp() {
        printer = mock(Printer.class);
        generator = new RightTriangleGenerator(printer);
    }

    @Test
    public void should_print_nothing_n_is_0() {
        int n=0;
        generator.generate(n);
        verify(printer).print("");

    }
    @Test
    public void should_print_correct_string_n_is_3() {
        int n=3;
        generator.generate(n);
        verify(printer).print("*\n**\n***\n");

    }

}