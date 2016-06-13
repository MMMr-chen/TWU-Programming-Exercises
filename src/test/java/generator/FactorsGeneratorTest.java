package generator;

import org.junit.Before;
import org.junit.Test;
import printer.Printer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class FactorsGeneratorTest {
    private List<Integer> expectResult;
    private FactorsGenerator generator;

    @Before
    public void setUp() {
        generator = new FactorsGenerator();
    }

    @Test
    public void should_return_nothing_n_is_1() {
        int n=1;
        expectResult = new ArrayList<>(Arrays.asList());
        List<Integer> actualResult = generator.generate(n);
        assertThat(actualResult,equalTo(expectResult));

    }
    @Test
    public void should_return_correct_n_is_30() {
        int n=30;
        expectResult = new ArrayList<>(Arrays.asList(2,3,5));
        List<Integer> actualResult = generator.generate(n);
        assertThat(actualResult,equalTo(expectResult));

    }
    @Test
    public void should_return_correct_n_is_7() {
        int n=7;
        expectResult = new ArrayList<>(Arrays.asList());
        List<Integer> actualResult = generator.generate(n);
        assertThat(actualResult,equalTo(expectResult));

    }


}