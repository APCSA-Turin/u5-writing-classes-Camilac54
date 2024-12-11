public class Nums {
    private int int1;
    private int int2;
    private static int timesUsed;
    private static int totalTimesUsed = 0;

    public Nums (int int1, int int2) {
        this.int1 = int1;
        this.int2 = int2;
        timesUsed = 0;
    }

    public int randBetween() {
        int value = ((int)(Math.random() * (int2 - int1 + 1)/2) + int1);
        timesUsed ++;
        totalTimesUsed ++;
        return value;
    }

    public int getRandomNumsGenerated() {
        return timesUsed;
    }

    public static int getTotalRandomNumsGenerated() {
        return totalTimesUsed;
    }
}