package U5T7_StaticMethods1;

public class Temperature {
    private double high;
    private double low;
    private String scale;

    public Temperature (double high, double low, String scale) {
        if (!scale.equals("F") && !scale.equals("C")) {
            scale = "F";
        } else {
            this.scale = scale;
        }

        this.high = high;
        this.low = low;
    }

    public static double convertCtoF (double temp) {
        return (temp * 1.8) + 32;
    }

    public static double convertFtoC (double temp) {
        return (5*(temp - 32))/9;
    }

    public void changeToC() {
        if (scale.equals("F")) {
            high = Temperature.convertFtoC(high);
            low = Temperature.convertFtoC(low);
            scale = "C";
        }
    }

    public void changeToF() {
        if (scale.equals("C")){
            high = Temperature.convertCtoF(high);
            low = Temperature.convertCtoF(low);
            scale = "F";
        }
    }

    public String tempInfo() {
        String str = "High Temperature: " + high + " " + scale;
        str += "\nLow Temperature: " + low + " " + scale;
        return str;
    }
}