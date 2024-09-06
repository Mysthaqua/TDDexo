package tibo.tdd.exo3;

public class DiceScore {
    private Idice dice;

    public DiceScore(Idice de) {
        this.dice = de;
    }

    public int getScore() {
        int scoreFirst = dice.roll();
        int scoreSecond = dice.roll();

        if (scoreFirst == scoreSecond) {
            if (scoreFirst == 6) {
                return 30;
            }
            return scoreFirst * 2 + 10;
        } else {
            return Math.max(scoreFirst, scoreSecond);
        }
    }
}
