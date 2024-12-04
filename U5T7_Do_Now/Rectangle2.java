public class Rectangle2 {
    // instance variables
    private double length;
    private double width;

    // constructor
    public Rectangle2(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // STATIC "utility" method that converts feet to inches
    public static double feetToInches(double feet) {
        return feet * 12;
    }

    // instance method that returns area of Rectangle object
    public double area() {
        return length * width;
    }

    //Perimeter method
    public double perimeter() {
        return length + length + width + width;
    }

    //inchesToFeet method
    public static double inchesToFeet(double inches) {
        return inches / 12;
    }
}