package tibo.tdd.exo3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class DiceTest extends Assertions {
    private static Idice dice;
    private static DiceScore diceScore;

    @BeforeAll
    public static void init() {
        dice = Mockito.mock(Idice.class);
        diceScore = new DiceScore(dice);
    }

    @Test
    @DisplayName("Test de la méthode getScore de la classe DiceScore, si scoreFirst et scoreSecond sont égaux à 5, avec un résultat égal à 5 * 2 + 10 = 20")
    public void testDiceScore_WhenGetScore_IfDiceRollsBothReturn_5_ThenResult_5Mult2Plus10_20() {
        int roll = 5;
        int expected = 20;

        Mockito.when(dice.roll()).thenReturn(roll);
        int actual = diceScore.getScore();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test de la méthode getScore de la classe DiceScore, si scoreFirst et scoreSecond sont égaux à 6, avec un résultat égal à 30")
    public void testDiceScore_WhenGetScore_IfDiceRollsBothReturn_6_ThenResult_30() {
        int roll = 6;
        int expected = 30;

        Mockito.when(dice.roll()).thenReturn(roll);
        int actual = diceScore.getScore();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test de la méthode getScore de la classe DiceScore, si scoreFirst est égal à 4 et scoreSecond est égal à 5, avec un résultat égal à 5, le max des deux scores")
    public void testDiceScore_WhenGetScore_IfDiceRollsReturn_4_5_ThenResult_5() {
        int firstRoll = 4;
        int secondRoll = 5;
        int expected = 5;

        Mockito.when(dice.roll()).thenReturn(firstRoll, secondRoll);
        int actual = diceScore.getScore();

        assertEquals(expected, actual);
    }
}