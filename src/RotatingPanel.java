public class RotatingPanel extends Panel {
    private float degrees;
    private boolean rotate = true;
    public RotatingPanel(int _x, int _y, int _w, int _h) {
        super(_x, _y, _w, _h);
        degrees = 10;
    }
    public void display() {
        int x = getX();
        int y = getY();
        Main.app.push();
        Main.app.translate(x, y);
        Main.app.rotate(degrees);
        if (rotate){
            degrees -= 50;
        }
        setX(0);
        setY(0);
        super.display();
        setX(x);
        setY(y);
        Main.app.pop();
    }
    public void handleMouseClicked(int mX, int mY) {
        int x = getX();
        int y = getY();
        int h = getHeight();
        int w = getWidth();
        if (mX > (x-w/2) && mX < (x + w/2) && mY > y - h/2 && mY < y + h/2) {
            rotate = !rotate;
        }
    }
}