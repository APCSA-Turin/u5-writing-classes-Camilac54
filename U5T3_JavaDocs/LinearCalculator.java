package U5T3_JavaDocs;

/**
 * This is a class of a LinearCalculator object
 * 
 * @author Camila Coronel
 */

public class LinearCalculator{
    /** The x value of the first point/coordinate pair. */
    private int x1; 

    //** The x value of the second point/coordinate pair. */
    private int x2;

    /** The y value of the first point/coordinate pair. */
    private int y1;

    /** The y value of the second point/coordinate pair. */
    private int y2; 

    /** 
     * Initiates a LinearCalulator object
     * 
     * @param point1 A String of the first point/coordinate pair
     * @param point2 A String of the second point/coordinate pair
    */
    public LinearCalculator(String point1, String point2){ 
        int breakPt1 = point1.indexOf(","); 
        x1 = Integer.parseInt(point1.substring(1, breakPt1)); 
        y1 = Integer.parseInt(point1.substring(breakPt1 + 1, point1.length() - 1));
        int breakPt2 = point2.indexOf(",");
        x2 = Integer.parseInt(point2.substring(1, breakPt2));
        y2 = Integer.parseInt(point2.substring(breakPt2 + 1, point2.length() - 1));
    }

    /**
     * Returns the value of the x in the first point/coordinate pair
     * 
     * @return
     */
    public int getX1(){
        return x1; 
    }

    /**
     * Returns the vaule of y in the first point/coordinate pair
     * 
     * @return
     */
    public int getY1(){
        return y1;
    }

    /**
     * Returns the x value of the second point/coordinate pair
     * 
     * @return
     */
    public int getX2(){
        return x2; 
    }

    /**
     * Returns the y valeu of the second point/coordinate pair
     * 
     * @return
     */
    public int getY2(){
        return y2; 
    }

    /**
     * Sets the x value of the first point/coordinate pair to a new value
     * 
     * @param newX1 The new value of x1
     */
    public void setX1(int newX1){
        x1 = newX1;
    }

    /**
     * Sets the y value of the first point/coordinate pair to a new value
     * 
     * @param newY1 The new value of y1 
     */
    public void setY1(int newY1){
        y1 = newY1; 
    }

    /**
     * Sets the x value of the second point/coordinate pair to a new value
     * 
     * @param newX2 The new value of x2
     */
    public void setX2(int newX2){
        x2 = newX2; 
    }

    /**
     * Sets the y value of the second point/coordinate pair to a new value
     * 
     * @param newY2 The new value of y2
     */
    public void setY2(int newY2){
        y2 = newY2;
    }

    /**
     * Returns the distance between the two points
     * <p>
     * The distance is calculated by taking the square root of x2 - x1 squared 
     * Then this value is added to the value of the square root of y2 - y1 squared
     * 
     * @return The value of the distance between the two point, rounded to the nearest hundreth
     */
    public double distance(){
        double distance = Math.sqrt((double)Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)); 
        return Math.round(distance * 100.0) / 100.0;
    }

    /**
     * Returns the value of the y intercept
     * <p>
     * The y intercept is calculated by subtracting the value of the slope times the first x value from the first y value
     * If the first x value and the second x value are equal, 
     * then it returns -999.99 because it is undefined 
     * 
     * @return The value of the y intercept, rounded to the nearest hundredth
     */
    public double yInt() {
        if (x2 == x1) {
            return -999.99; 
        }

        double slope = slope();
        double yInt = y1 - (slope * x1); 
        return Math.round(yInt * 100.0) / 100.0; 
    }

    /**
     * Returns the value of the slope of the line from the two points
     * <p>
     * yVal is calculated by subtracting y1 from y2
     * xVal is calculated by subtrating x1 from x2
     * If x2 is equal to x1, then it returns -999.99 becase it is undefined
     * The value of the actual slope is calculated by dividing yVal / xVal
     * 
     * @return The slope of yVal/xVal rounded to the nearest hundredth
     */
    public double slope(){
        double yVal = (double) y2 - y1; 
        double xVal = (double) x2 - x1; 
        if (x2 == x1) {
            return -999.99;
        }
        return Math.round((yVal / xVal) * 100.0) / 100.0;
    }

    /**
     * Returns a String of the equation y = mx + b
     * <p>
     * if the slope is -999.99, then it returns undefined
     * if the y intercept is 0, the it omits yInt from the equation
     * if the slope is 0, then it omits the slope from the equation as well
     * if the y intercept is less than or equal to -1,
     * then the equation will be returned without a + sign
     * 
     * @return String representation of the full equation
     */
    public String equation(){
        double slopeVal = slope();
        if (slopeVal == -999.99) {
            return "undefined";
        }
        
        double yInt = yInt(); 
        if (yInt == 0.0) {
            return "y=" + slopeVal + "x"; 
        } else if (slopeVal == 0.0) { 
            return "y=" + yInt; 
        } else if (yInt <= -1) {
            return "y=" + slopeVal + "x" + yInt;
        }

        return "y=" + slopeVal + "x" + "+" + yInt;
    }

    /**
     * Returns the rounded value of an inputted number 
     * <p>
     * Learned through https://stackoverflow.com/questions/246193/how-do-i-round-a-number-in-javascript
     * 
     * @param x The value that needs to be rounded
     * @return The value of x rounded to the nearest hundredth
     */ 
    public double roundedToHundredth(double x){
        return Math.round(x * 100.0) / 100.0;
    }

    /**
     * Returns a string tha includes the value of 
     * The two points, the slope, y intercept, equation, and the distance
     * 
     * @return String represenation of the object's math information
     */
    public String printInfo(){
        String str = "The two points are: (" + x1 + "," + y1  + ")"; 
        str += " and " + "(" + x2 + "," + y2 + ")";
        str += "\nThe equation of the line between these points is: " + equation(); 
        str += "\nThe slope of this line is: " + slope(); 
        str += "\nThe y-intercept of the line is: " + yInt();
        str += "\nThe distance between the two points is: " + distance();
        return str; 
    }
}