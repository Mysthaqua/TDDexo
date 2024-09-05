package tibo.tdd.exo1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GradingCalculatorTest extends Assertions {
    private GradingCalculator gradingCalculator;

    // La façon "Je test des trucs"

    public void TestGradingCalculatorWhenGetGrade_Score_AttendancePercentage_ThenResult_Expected(int score, int attendancePercentage, char expected) {
        gradingCalculator = new GradingCalculator(score, attendancePercentage);

        char actual = gradingCalculator.getGrade();

        assertEquals(expected, actual);
    }

    @Test
    public void TestGradingCalculatorWhenGetGrade_95_90_ThenResult_A() {
        TestGradingCalculatorWhenGetGrade_Score_AttendancePercentage_ThenResult_Expected(95, 90, 'A');
    }

    @Test
    public void TestGradingCalculatorWhenGetGrade_85_90_ThenResult_B() {
        TestGradingCalculatorWhenGetGrade_Score_AttendancePercentage_ThenResult_Expected(85, 90, 'B');
    }

    @Test
    public void TestGradingCalculatorWhenGetGrade_65_90_ThenResult_C() {
        TestGradingCalculatorWhenGetGrade_Score_AttendancePercentage_ThenResult_Expected(65, 90, 'C');
    }

    @Test
    public void TestGradingCalculatorWhenGetGrade_95_65_ThenResult_B() {
        TestGradingCalculatorWhenGetGrade_Score_AttendancePercentage_ThenResult_Expected(95, 65, 'B');
    }

    @Test
    public void TestGradingCalculatorWhenGetGrade_95_55_ThenResult_F() {
        TestGradingCalculatorWhenGetGrade_Score_AttendancePercentage_ThenResult_Expected(95, 55, 'F');
    }

    @Test
    public void TestGradingCalculatorWhenGetGrade_65_55_ThenResult_F() {
        TestGradingCalculatorWhenGetGrade_Score_AttendancePercentage_ThenResult_Expected(65, 55, 'F');
    }

    @Test
    public void TestGradingCalculatorWhenGetGrade_50_90_ThenResult_F() {
        TestGradingCalculatorWhenGetGrade_Score_AttendancePercentage_ThenResult_Expected(50, 90, 'F');
    }

    // La façon classique

    /*@Test
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
    }*/
}
