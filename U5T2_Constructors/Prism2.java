package U5T2_Constructors;

public class Prism2 {
    private int len = 0;
    private int width = 0;
    private int height = 0; 
    private int volume = 0;
    private int surfaceArea = 0;

    public Prism2 (int num) {
        len = num;
        width = num;
        height = num;
    }

    public Prism2 () {
        len = (int) (Math.random() * 91) + 10;
        width = (int) (Math.random() * 91) + 10;
        height = (int) (Math.random() * 91) + 10;
    }

    public void setLen(int newLen) {
        len = newLen;
    }

    public void setWidth (int newWidth) {
        width = newWidth;
    }

    public void setHeight (int newHeight) {
        height = newHeight;
    }

    public int volume() {
        volume = len * width * height;
        return volume;
    }

    public int surfaceArea() {
        surfaceArea = (len * width)*2 + (len * height)*2 + (height * width)*2;
        return surfaceArea;
    }

    public String dimensions() {
        String result = "Length = " + len + "\n" + "Width = " + width + "\n" + "Height = " + height;
        return result;
    }
}
