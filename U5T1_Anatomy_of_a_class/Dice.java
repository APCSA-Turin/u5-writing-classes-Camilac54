package U5T1_Anatomy_of_a_class;

public class Dice {
    private int rollCount;
    private int recentRollVal;
    private int numSides;

    public Dice (int numSides) {
        this.numSides = numSides;
        rollCount = 0;
        recentRollVal = 0;
    }

    public int getRollCount () {
        return rollCount;
    }

    public int getRecentRollVal () {
        return recentRollVal;
    }

    public int getNumSides () {
        return numSides;
    }

    public void setNumSides (int newSides) {
        numSides = newSides;
    }

    public void runDice () {
        int roll = (int) Math.random() * numSides + 1;
        recentRollVal = roll;
        rollCount ++;
    }   
}