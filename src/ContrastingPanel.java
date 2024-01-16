import processing.core.PImage;
public class ContrastingPanel extends Panel {

    //constructor for class ContrastingPanel (using Panel class' constructor)
    public ContrastingPanel(int _x, int _y, int _w, int _h) {
        super(_x, _y, _w, _h);
    }

    //method that displays the image but it converts the color of the pixels to be black or white depending on brightness
    public void display() {
        PImage img = getImageCopy();
        img.loadPixels();
        for (int y = 0; y < img.height; y++) {
            for (int x = 0; x < img.width; x++) {
                int index = x + (y * img.width);
                if (Main.app.brightness(img.pixels[index]) > 190) {
                    img.pixels[index] = Main.app.color(255);
                } else {
                    img.pixels[index] = Main.app.color(0, 0);
                }
            }
        }
        img.updatePixels();
        Main.app.image(img, getX(), getY(), getWidth(), getHeight());
    }
}