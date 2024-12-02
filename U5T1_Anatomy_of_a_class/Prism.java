package U5T1_Anatomy_of_a_class;

public class Prism {
    private int len = 0;
    private int width = 0;
    private int height = 0; 
    private int volume = 0;
    private int surfaceArea = 0;

    public Prism (int len, int width, int height) {
        this.len = len;
        this.width = width;
        this.height = height; 
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