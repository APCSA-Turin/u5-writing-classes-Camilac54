package U5T2_Constructors;

public class Squares {
    private int side;
    private String name;
  
    public Squares() {
      side = 10;
      name = "";
    }
    public int getSide() {
      return side;
    }
  
    public String getName() {
      return name;
    }
  
    public String info() {
      return "side: " + side + ", name: " + name;
    }
}      