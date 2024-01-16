import processing.core.PImage;
public class Panel {

    //private variables
    private int x, y;
    private int w, h;
    private PImage img;

    //constructor for class Panel with 4 arguments of coordinates and dimensions of image
    public Panel(int _x, int _y, int _w, int _h) {
        x = _x;
        y = _y;
        w = _w;
        h = _h;
    }

    //method that is setting up the image
    public void setupImage(String imageName) {
        img = Main.app.loadImage(imageName);
    }

    //method that displays the image with the correct coordinates and dimensions
    public void display() {
        Main.app.image(img, x, y, w, h);
    }

    //method that takes in mouseX and mouseY and is overridden in subclasses that use it
    public void handleMouseClicked(int mX, int mY) {}

    //getter and setter methods for coordinates x and y & dimensions w and h
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int _x) {
        x = _x;
    }

    public void setY(int _y) {
        y = _y;
    }

    public int getWidth() {
        return w;
    }

    public int getHeight() {
        return h;
    }

    //getting a copy of the original image
    public PImage getImageCopy() {
        return img.copy();
    }
}