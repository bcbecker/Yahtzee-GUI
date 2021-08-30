package finalproject;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author becker.bryce
 */
public class Roll {
    
    Random random;
    private int rollCounter;
    private int score;
    private scoreType scoreType;
    private ArrayList<Dice> dice;
    
    public Roll() {
        dice = new ArrayList<>();
        
        for(int i = 0; i < 6; i++) {
            Dice newDice = new Dice();
            dice.add(newDice);
        }
        
        rollCounter = 1;
        score = 0;
        scoreType = null;
    }
    
    public enum scoreType{
                            ONES, TWOS, THREES, FOURS, FIVES, SIXES,
                            THREE_OF_A_KIND, FOUR_OF_A_KIND, FULL_HOUSE,
                            SMALL_STRAIGHT, LARGE_STRAIGHT, CHANCE, YAHTZEE };
    
    public void setScore(int score) {
        this.score = score;
    }
    
    public int getScore() {
        return score;
    }
    
    public void setScoreType(scoreType type) {
        this.scoreType = type;
    }
    
    public scoreType getScoreType() {
        return scoreType;
    }
    
    public ArrayList<Dice> getDice() {
        return dice;
    }
    
    public int getRollCounter() {
        return rollCounter;
    }
    
    public void rerollCurrentDice() {
        random = new Random();
        
        if(rollCounter < 3) {
            for(Dice die : dice) {
                if(die.isRollable()) {
                    die.setValue(random.nextInt(6) + 1);
                }
            }
            rollCounter++;
        }
        //do we want to throw an exception here? (throw new IllegalArgumentException("Invalid button press.");)
    }
    
}
