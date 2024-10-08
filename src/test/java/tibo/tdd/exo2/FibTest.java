package tibo.tdd.exo2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FibTest extends Assertions {
    private Fib fib;

    @Test
    @DisplayName("Test de la méthode getFibSeries de la classe Fib avec range = 1 avec un résultat non vide")
    public void testGetFibSeries_WhenRange_1_ThenResult_NotEmpty() {
        fib = new Fib(1);

        List<Integer> list = fib.getFibSeries();
        boolean condition = list.isEmpty();

        assertFalse(condition);
    }

    @Test
    @DisplayName("Test de la méthode getFibSeries de la classe Fib avec range = 1 avec un résultat contenant la valeur 0")
    public void testGetFibSeries_WhenRange_1_ThenResultContainsValue_0() {
        fib = new Fib(1);

        List<Integer> list = fib.getFibSeries();
        boolean condition = list.contains(0);

        assertTrue(condition);
    }

    @Test
    @DisplayName("Test de la méthode getFibSeries de la classe Fib avec range = 6 avec un résultat contenant la valeur 3")
    public void testGetFibSeries_WhenRange_6_ThenResultContainsValue_3() {
        fib = new Fib(6);

        List<Integer> list = fib.getFibSeries();
        boolean condition = list.contains(3);

        assertTrue(condition);
    }

    @Test
    @DisplayName("Test de la méthode getFibSeries de la classe Fib avec range = 6 avec un résultat contenant 6 éléments")
    public void testGetFibSeries_WhenRange_6_ThenResultContains_6_Elements() {
        fib = new Fib(6);
        int expected = 6;

        List<Integer> list = fib.getFibSeries();
        int actual = list.size();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test de la méthode getFibSeries de la classe Fib avec range = 6 avec un résultat ne contenant pas la valeur 4")
    public void testGetFibSeries_WhenRange_6_ThenResultDoesNotContainValue_4() {
        fib = new Fib(6);

        List<Integer> list = fib.getFibSeries();
        boolean condition = list.contains(4);

        assertFalse(condition);
    }

    @Test
    @DisplayName("Test de la méthode getFibSeries de la classe Fib avec range = 6 avec un résultat contenant les valeurs 0, 1, 1, 2, 3, 5")
    public void testGetFibSeries_WhenRange_6_ThenResult_0_1_1_2_3_5() {
        fib = new Fib(6);
        List<Integer> expected = List.of(0, 1, 1, 2, 3, 5);

        List<Integer> actual = fib.getFibSeries();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test de la méthode getFibSeries de la classe Fib avec range = 6 avec un résultat ordonné ascendant")
    public void testGetFibSeries_WhenRange_6_ThenResultSortedASC() {
        fib = new Fib(6);

        List<Integer> actual = fib.getFibSeries();
        List<Integer> expected = actual.stream().sorted().toList();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test non implémenté")
    @Disabled("Test non implémenté")
    public void testNotImpl() {
        fail();
    }
}