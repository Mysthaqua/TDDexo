package tibo.tdd.exo4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import tibo.tdd.exo4.exception.NotFoundException;

import java.util.List;

public class SearchCityTest extends Assertions {
    private static SearchCity searchCity;

    @BeforeAll
    public static void init() {
        searchCity = new SearchCity(List.of("Paris", "Budapest", "Skopje", "Rotterdam", "Valence", "Vancouver", "Amsterdam", "Vienne", "Sydney", "New York", "Londres", "Bangkok", "Hong Kong", "Dubaï", "Rome", "Istanbul"));
    }

    @Test
    @DisplayName("Test de la méthode search de la classe SearchCity, avec city = \"P\", lance une NotFoundException")
    public void testSearchCity_WhenSearch_IfCity_P_ThrowsNotFoundException() {
        String city = "P";
        Class<NotFoundException> expectedType = NotFoundException.class;

        Executable executable = () -> searchCity.search(city);

        assertThrows(expectedType, executable);
    }

    @Test
    @DisplayName("Test de la méthode search de la classe SearchCity, avec city = \"Va\", renvoie une liste contenant Valence et Vancouver")
    public void testSearchCity_WhenSearch_IfCity_Va_ReturnsList_Valence_Vancouver() {
        String city = "Va";
        List<String> expected = List.of("Valence", "Vancouver");

        List<String> actual = searchCity.search(city);

        assertEquals(expected, actual);
    }
}