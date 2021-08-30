package finalproject;

import finalproject.Roll.scoreType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author becker.bryce
 */
public class RollScoring {
    
    private Map<scoreType,Integer> possibleScoreTypesAndScores;
    
    public RollScoring() {

        possibleScoreTypesAndScores = new HashMap<>();
    }
    
    private ArrayList<Integer> countDiceValueFrequency(Roll roll) {
        
        ArrayList<Integer> diceValueCounter = new ArrayList<>();
        
        int onesCounter = 0;
        int twosCounter = 0;
        int threesCounter = 0;
        int foursCounter = 0;
        int fivesCounter = 0;
        int sixesCounter = 0;
        
        for(Dice die : roll.getDice()) {
            if(die.getValue() == 1) {
                onesCounter++;
            }
            else if(die.getValue() == 2) {
                twosCounter++;
            }
            else if(die.getValue() == 3) {
                threesCounter++;
            }
            else if(die.getValue() == 4) {
                foursCounter++;
            }
            else if(die.getValue() == 5) {
                fivesCounter++;
            }
            else if(die.getValue() == 6) {
                sixesCounter++;
            }
        }
        diceValueCounter.add(onesCounter);
        diceValueCounter.add(twosCounter);
        diceValueCounter.add(threesCounter);
        diceValueCounter.add(foursCounter);
        diceValueCounter.add(fivesCounter);
        diceValueCounter.add(sixesCounter);
        
        return diceValueCounter;
    }
    
    private void scoreUpper(Player player, ArrayList<Integer> diceValueFrequencies, scoreType[] scoreTypeArray) {
        for(int index = 0; index < 6; index++) {
            if(!player.getScoreCard().containsKey(scoreTypeArray[index])) {
                int numberFrequency = diceValueFrequencies.get(index);
                if(numberFrequency >= 1) {
                    possibleScoreTypesAndScores.put(scoreTypeArray[index], (numberFrequency*(index + 1)));
                }
            }
        }
    }
    
    private void scoreThreeOfAKind(ArrayList<Integer> diceValueFrequencies, scoreType[] scoreTypeArray) {
        int diceValue = 1;
        for(int numFrequency : diceValueFrequencies) {
            if(numFrequency >= 3) {
                possibleScoreTypesAndScores.put(scoreTypeArray[6], (3*(diceValue)));
            }
            diceValue++;
        }
    }
    
    private void scoreFourOfAKind(ArrayList<Integer> diceValueFrequencies, scoreType[] scoreTypeArray) {
        int diceValue = 1;
        for(int numFrequency : diceValueFrequencies) {
            if(numFrequency >= 4) {
                possibleScoreTypesAndScores.put(scoreTypeArray[7], (4*(diceValue)));
            }
            diceValue++;
        }
    }
    
    private void scoreFullHouse(ArrayList<Integer> diceValueFrequencies) {
        ArrayList<Integer> checkForFullHouse32 = new ArrayList<>(Arrays.asList(3, 2));
        ArrayList<Integer> checkForFullHouse33 = new ArrayList<>(Arrays.asList(3, 3));
        if(diceValueFrequencies.containsAll(checkForFullHouse32) ||
                diceValueFrequencies.containsAll(checkForFullHouse33)) {
            possibleScoreTypesAndScores.put(scoreType.FULL_HOUSE, 25);
        }
    }
    
    //derived from: https://github.com/GabDug/Yahtzee/blob/master/src/yahtzee/game/ScoreUtils.java#L59
    private void scoreStraight(Roll roll, scoreType[] scoreTypeArray, int index, int counterMax, int points) {
        ArrayList<Integer> sortedDiceValues = new ArrayList<>();
        for(Dice dice : roll.getDice()) {
            sortedDiceValues.add(dice.getValue());
        }
        Collections.sort(sortedDiceValues);

        int counter = 0;

        for (int i = 0; i < sortedDiceValues.size() - 1; i++) {
            if (sortedDiceValues.get(i + 1).equals(sortedDiceValues.get(i) + 1)) {
                counter++;
            } else if (sortedDiceValues.get(i + 1).equals(sortedDiceValues.get(i))) {
                continue;
            } else {
                counter = 0;
            }
            if (counter == counterMax) {
                possibleScoreTypesAndScores.put(scoreTypeArray[index], points);
            }
        }
    }
    
    private int getDiceSumForChance(Roll roll) {
        int sum = 0;
        for(Dice die : roll.getDice()) {
            sum += die.getValue();
        }
        return sum;
    }
    
    private void scoreYahtzee(ArrayList<Integer> diceValueFrequencies, scoreType[] scoreTypeArray) {
        for(int numFrequency : diceValueFrequencies) {
            if(numFrequency == 6) {
                possibleScoreTypesAndScores.put(scoreTypeArray[12], 50);
            }
        }
    }
    
    public void setPossibleScoreTypes(Player player, Roll roll) {
        possibleScoreTypesAndScores.clear();
        ArrayList<Integer> diceValueFrequencies = countDiceValueFrequency(roll);
        scoreType[] scoreTypeArray = scoreType.values().clone();
        
        //upper
        scoreUpper(player, diceValueFrequencies, scoreTypeArray);
        
        //lower
        for(int index = 6; index < 13; index++) {
            //3 of a kind
            if(!player.getScoreCard().containsKey(scoreTypeArray[6])) {
                scoreThreeOfAKind(diceValueFrequencies, scoreTypeArray);
            }
            //4 of a kind
            if(!player.getScoreCard().containsKey(scoreTypeArray[7])) {
                scoreFourOfAKind(diceValueFrequencies, scoreTypeArray);
            }
            //full house
            if(!player.getScoreCard().containsKey(scoreTypeArray[8])) {
                scoreFullHouse(diceValueFrequencies);
            }
            //small straight
            //change to basic int array?
            if(!player.getScoreCard().containsKey(scoreTypeArray[9])) {
                scoreStraight(roll, scoreTypeArray, 9, 3, 30);
            }
            //large straight
            if(!player.getScoreCard().containsKey(scoreTypeArray[10])) {
                scoreStraight(roll, scoreTypeArray, 10, 4, 40);
            }
            //chance
            if(!player.getScoreCard().containsKey(scoreTypeArray[11])) {
                possibleScoreTypesAndScores.put(scoreType.CHANCE, getDiceSumForChance(roll));
            }
            //yahtzee
            if(!player.getScoreCard().containsKey(scoreTypeArray[12])) {
                scoreYahtzee(diceValueFrequencies, scoreTypeArray);
            }
        }
        //score 0 if no other possible
        if(possibleScoreTypesAndScores.isEmpty()) {
            for(scoreType scoreType : scoreTypeArray) {
                if(!player.getScoreCard().containsKey(scoreType)) {
                    possibleScoreTypesAndScores.put(scoreType, 0);
                }
            }
        }
    }
    
    public Map<scoreType,Integer> getPoissibleScoreTypes() {
        return possibleScoreTypesAndScores;
    }
    
    public void scoreRoll(Player player, Roll roll, scoreType scoreType) {
        if(possibleScoreTypesAndScores.containsKey(scoreType)) {
            roll.setScoreType(scoreType);
            roll.setScore(possibleScoreTypesAndScores.get(scoreType));
            player.addRollToScoreCard(scoreType, possibleScoreTypesAndScores.get(scoreType));
        }
        else {
            throw new IllegalArgumentException("Invalid button press.");
        }
    }
 
}
