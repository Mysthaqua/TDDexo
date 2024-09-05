package tibo.tdd.exo2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FibTest extends Assertions {
    private Fib fib;

    @Test
    public void testGetFibSeries_WhenRange_1_ThenResult_NotEmpty() {
        fib = new Fib(1);
        int unexpected = 0;

        List<Integer> list = fib.getFibSeries();
        int actual = list.size();

        assertNotEquals(unexpected, actual);
    }

    @Test
    public void testGetFibSeries_WhenRange_1_ThenResult_0() {
        fib = new Fib(1);
        List<Integer> expected = List.of(0);

        List<Integer> actual = fib.getFibSeries();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetFibSeries_WhenRange_6_ThenResultContainsValue_3() {
        fib = new Fib(6);

        List<Integer> list = fib.getFibSeries();
        boolean condition = list.contains(3);

        assertTrue(condition);
    }

    @Test
    public void testGetFibSeries_WhenRange_6_ThenResultContains_6_Elements() {
        fib = new Fib(6);
        int expected = 6;

        List<Integer> list = fib.getFibSeries();
        int actual = list.size();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetFibSeries_WhenRange_6_ThenResultDoesNotContainValue_4() {
        fib = new Fib(6);

        List<Integer> list = fib.getFibSeries();
        boolean condition = list.contains(4);

        assertFalse(condition);
    }

    @Test
    public void testGetFibSeries_WhenRange_6_ThenResult_0_1_1_2_3_5() {
        fib = new Fib(6);
        List<Integer> expected = List.of(0, 1, 1, 2, 3, 5);

        List<Integer> actual = fib.getFibSeries();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetFibSeries_WhenRange_6_ThenResultSortedASC() {
        fib = new Fib(6);

        List<Integer> actual = fib.getFibSeries();
        List<Integer> expected = actual.stream().sorted().toList();

        assertEquals(expected, actual);
    }
}