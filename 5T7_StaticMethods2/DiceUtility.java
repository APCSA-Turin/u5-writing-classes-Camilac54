public class DiceUtility {

    private DiceUtility () {}

    public static int randomNum (int min, int max) { // A
        int value = (int)(Math.random() * max - min + 1) + min;
        if (isZero(value)) {
            return value += 1;
        }
        return value;
    }

    public static int randomEvenNum (int min, int max) { // A
        int value = ((int)(Math.random() * (max - min + 1)/2) + min) * 2;
        if (isZero(value)) {
            return value += 1;
        }
        return value;
    }

    private static boolean isZero (int val) {
        if (val == 0) {
            return true;
        }
        return false;
    }
}
