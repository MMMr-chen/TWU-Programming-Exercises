package generator;

import org.junit.Before;
import org.junit.Test;
import printer.Printer;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class FizzBuzzGeneratorTest {
    private Printer printer;
    private FizzBuzzGenerator generator;

    @Before
    public void setUp() {
        printer = mock(Printer.class);
        generator = new FizzBuzzGenerator(printer);
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
        verify(printer).print("1\n2\nFizz\n");

    }
    @Test
    public void should_print_correct_string_n_is_15() {
        int n=15;
        generator.generate(n);
        verify(printer).print("1\n2\nFizz\n4\n" +
                "Buzz\n" +
                "Fizz\n" +
                "7\n" +
                "8\n" +
                "Fizz\n" +
                "Buzz\n" +
                "11\n" +
                "Fizz\n" +
                "13\n" +
                "14\n" +
                "FizzBuzz\n");

    }


}