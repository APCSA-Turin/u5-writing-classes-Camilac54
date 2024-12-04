package U5T7_StaticMethods1;

public class RaceUtility {
    public static double milesToKm (double distance) {
        return distance * 1.609344;
    }

    public static double kmToMiles (double distance) {
        return distance / 1.609344;
    }

    public static String makeProper (String str) {
        String lowerStr = str.toLowerCase();
        String properStr = "";

        for (int i = 0; i < lowerStr.length(); i ++) {
            String character = lowerStr.substring (i, i + 1);
            if (i == 0) {
                properStr += character.toUpperCase();
            } else {
                String before = lowerStr.substring(i - 1, i);
                if (before.equals(" ")){
                    properStr += character.toUpperCase();
                } else {
                    properStr += character;
                }
            }
        }
        return properStr;
    }
}