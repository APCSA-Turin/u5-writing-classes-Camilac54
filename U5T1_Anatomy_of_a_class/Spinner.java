package U5T1_Anatomy_of_a_class;

public class Spinner {
    private int spinVal;
    private int numOfSpins;
    private int spinSum;
    private int sections;
    
    public Spinner (int sections) {
        this.sections = sections;
        spinVal = 0;
        numOfSpins = 0;
        spinSum = 0;
    }

    public int getSpinVal () {
        return spinVal;
    }

    public int getNumOfSpins () {
        return numOfSpins;
    }

    public int getSpinSum () {
        return spinSum;
    }

    public void spin() {
        int currentSpin = (int) (Math.random() * sections) + 1;
        spinVal = currentSpin;
        numOfSpins ++;
        spinSum += spinVal;
    }

    public double averageSpin () {
        double average = (double) spinSum / numOfSpins;
        return average;
    }
}