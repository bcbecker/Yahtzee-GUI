package finalproject;

import finalproject.Roll.scoreType;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author becker.bryce
 */
public class Player {
    
    private String name;
    private Map<scoreType,Integer> scoreCard;
    //don't really need this attribute
    private Roll currentRoll;
    
    public Player(String name) {
        
        this.name = name;
        scoreCard = new HashMap<>();
        currentRoll = null;
    }
    
    public Map<scoreType,Integer> getScoreCard() {
        return scoreCard;
    }
    
    public void addRollToScoreCard(scoreType scoreType, int score) {
        scoreCard.put(scoreType, score);
    }

    public Roll getCurrentRoll() {
        return currentRoll;
    }

    public void setCurrentRoll(Roll currentRoll) {
        this.currentRoll = currentRoll;
    }
    
    private int upperScoringBonus() {
        int addedBonus = 0;
        
        if((scoreCard.get(scoreType.ONES) + scoreCard.get(scoreType.TWOS) +
            scoreCard.get(scoreType.THREES) + scoreCard.get(scoreType.FOURS) + 
                scoreCard.get(scoreType.FIVES) + scoreCard.get(scoreType.SIXES)) >= 63) {
            addedBonus = 35;
        }
        return addedBonus;
    }
    
    public int sumUpScoreCard() {
        int totalScore = 0;
        
        scoreType[] scoreTypeArray = scoreType.values().clone();
        for(int index = 0; index < scoreTypeArray.length; index++) {
            totalScore += scoreCard.get(scoreTypeArray[index]);          
        }
        int addedBonus = upperScoringBonus();
        totalScore += addedBonus;
        
        return totalScore;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
    
}
