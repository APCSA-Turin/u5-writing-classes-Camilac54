public class Dice {
    // Useful site: https://codingnomads.com/how-to-call-static-nonstatic-methods-in-java
    
    private int rollTimes;
    private int rollMin;
    private int rollMax;
    private int target;
    private int current;
    private int sumNums;
    private String allNums;
    
    public Dice(int rollTimes, int rollMax, int target) {
        this.rollTimes = rollTimes;
        rollMin = 0;
        this.rollMax = rollMax;
        this.target = target;
        current = 0;
        allNums = "";
        sumNums = 0;
    }

    public String rollOnce () { // E
        int value = DiceUtility.randomNum(rollMin, rollMax);
        current = value;
        allNums += current + " ";
        sumNums += current;
        return "One roll: " + value;
    } 

    public String rollOnceEven () { // E
        int value = DiceUtility.randomEvenNum(rollMin, rollMax);
        current = value;
        allNums += current + " ";
        sumNums += current;
        return "One even roll: " + value;
    }

    public String rollTimes () {
        String rollTimesString = "";
        for (int i = 0; i < rollTimes; i ++) {
            int value = DiceUtility.randomNum(rollMin, rollMax);
            rollTimesString += value + " ";
            allNums += value + " ";
        }
        return rollTimesString;
    }

    public boolean targetChecker () { // B
        if (sumNums >= target) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isHighest (int value) {
        if (value == rollMax) {
            return true;
        } else {
            return false;
        }
    }

    public static String introduction() {
        String welcome = "Welcome! This is my dice-rolling game!\n";
        welcome += "Here, you are able to:\nRoll a dice one time\nRoll a dice for even numbers only\nRoll for a set number of times (of your choosing!)";
        welcome += "\nA sub-goal of this program is to reach the target number of your choosing with the values of your rolls!";
        return welcome;
    }

    public static String ending() {
        String ending = "We finished! Now, let's take a look at your statistics to see if you reached your goal!";
        return ending;
    }
    public String info() { //C //D
        System.out.println(Dice.ending());
        String str = "\nYour dice has " + rollMax + " sides!\n";
        str += "Your target is " + target + "\n";
        str = "Is the last number of your list the highest possible number? Let's find out!";
        str += "\nCalculating...\n";
        str += isHighest(current) + "!\n";
        str += "\nLet's see your roll outcomes!" + allNums;
        return str;
    }
}