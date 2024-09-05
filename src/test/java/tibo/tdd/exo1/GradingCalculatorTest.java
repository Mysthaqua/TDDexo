package tibo.tdd.exo1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GradingCalculatorTest extends Assertions {
    private GradingCalculator gradingCalculator;

    @Test
    public void TestGradingCalculatorWhenGetGrade_95_90_ThenResult_A() {
        int score = 95;
        int attendancePercentage = 90;
        gradingCalculator = new GradingCalculator(score, attendancePercentage);
        char expected = 'A';

        char actual = gradingCalculator.getGrade();

        assertEquals(expected, actual);
    }

    @Test
    public void TestGradingCalculatorWhenGetGrade_85_90_ThenResult_B() {
        int score = 85;
        int attendancePercentage = 90;
        gradingCalculator = new GradingCalculator(score, attendancePercentage);
        char expected = 'B';

        char actual = gradingCalculator.getGrade();

        assertEquals(expected, actual);
    }

    @Test
    public void TestGradingCalculatorWhenGetGrade_65_90_ThenResult_C() {
        int score = 65;
        int attendancePercentage = 90;
        gradingCalculator = new GradingCalculator(score, attendancePercentage);
        char expected = 'C';

        char actual = gradingCalculator.getGrade();

        assertEquals(expected, actual);
    }

    @Test
    public void TestGradingCalculatorWhenGetGrade_95_65_ThenResult_B() {
        int score = 95;
        int attendancePercentage = 65;
        gradingCalculator = new GradingCalculator(score, attendancePercentage);
        char expected = 'B';

        char actual = gradingCalculator.getGrade();

        assertEquals(expected, actual);
    }

    @Test
    public void TestGradingCalculatorWhenGetGrade_95_55_ThenResult_F() {
        int score = 95;
        int attendancePercentage = 55;
        gradingCalculator = new GradingCalculator(score, attendancePercentage);
        char expected = 'F';

        char actual = gradingCalculator.getGrade();

        assertEquals(expected, actual);
    }

    @Test
    public void TestGradingCalculatorWhenGetGrade_65_55_ThenResult_F() {
        int score = 65;
        int attendancePercentage = 55;
        gradingCalculator = new GradingCalculator(score, attendancePercentage);
        char expected = 'F';

        char actual = gradingCalculator.getGrade();

        assertEquals(expected, actual);
    }

    @Test
    public void TestGradingCalculatorWhenGetGrade_50_90_ThenResult_F() {
        int score = 50;
        int attendancePercentage = 90;
        gradingCalculator = new GradingCalculator(score, attendancePercentage);
        char expected = 'F';

        char actual = gradingCalculator.getGrade();

        assertEquals(expected, actual);
    }
}
