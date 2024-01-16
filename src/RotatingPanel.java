public class RotatingPanel extends Panel {

    //private variables
    private float degrees;
    private boolean rotate;

    //constructor for class RotatingPanel that uses Panel class' constructor and sets degrees to be 10 initially
    public RotatingPanel(int _x, int _y, int _w, int _h) {
        super(_x, _y, _w, _h);
        degrees = 10;
        rotate = true;
    }

    //method to display the strawberry and rotate it by -50 degrees if rotate = true
    public void display() {
        int x = getX();
        int y = getY();
        Main.app.push();
        Main.app.translate(x, y);
        Main.app.rotate(degrees);
        if (rotate) {
            degrees -= 50;
        }
        setX(0);
        setY(0);
        super.display();
        setX(x);
        setY(y);
        Main.app.pop();
    }

    //method that gets coordinates and dimensions and uses them to see if strawberry is clicked, in which case, it will start/stop rotating
    public void handleMouseClicked(int mX, int mY) {
        int x = getX();
        int y = getY();
        int h = getHeight();
        int w = getWidth();
        if (mX > (x - w / 2) && mX < (x + w / 2) && mY > y - h / 2 && mY < y + h / 2) {
            rotate = !rotate;
        }
    }
}