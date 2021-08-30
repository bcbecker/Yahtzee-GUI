package yahtzee;

import java.util.Random;

/**
 *
 * @author becker.bryce
 */
public class Dice {
    
    Random random;
    private int value;
    private boolean isRollable;
    
    public Dice() {
        random = new Random();
        value = random.nextInt(6) + 1;
        
        isRollable = true;
    }
    
    public void setIsRollable(boolean flag) {
        this.isRollable = flag;
    }
    
    public boolean isRollable() {
        return isRollable;
    }
    
    public void setValue(int val) {
        this.value = val;
    }
    
    public int getValue() {
        return value;
    }
    
}
