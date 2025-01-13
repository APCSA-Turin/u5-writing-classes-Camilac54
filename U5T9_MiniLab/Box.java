public class Box {
    private double length;
    private double width;
    private double height;
    
    public Box(double length, double width, double height) {
        // implement me as described in part (a)
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    // creates a cube: a box with all dimensions equal to side
    public Box(double side) {
        // implement me as described in part (b)
        this(side, side, side);
    }
    
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    
    public double volume() {
        // implement me as described in part (c)
        return this.length * this.width * this.height;
    }
    
    public Box greaterVolume(Box otherBox) {
        // implement me as described in part (d)
        if (this.volume() > otherBox.volume()) {
            return this;
        } else if (otherBox.volume() > this.volume()) {
            return otherBox;
        } else {
            return null;
        }
        
    }

    public String boxInfo() {
        // implement me as described in part (e)
        String str = "Length: " + this.length + "\n";
        str += "Width: " + this.width + "\n";
        str += "Height: " + this.height;
        return str;

    }

    public void addToShape(Shape s) {
       // implement me as described in part (f)
       s.attachBox(this);
    }
}