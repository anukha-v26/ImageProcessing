public class DisappearingPanel extends Panel {
    private boolean clicked = true;
    public DisappearingPanel(int _x, int _y, int _w, int _h) {
        super(_x, _y, _w, _h);
    }


    public void display() {
        if (clicked == true){
            super.display();
        }
    }

    public void handleMouseClicked(int mX, int mY) {
        int x = getX();
        int y = getY();
        int h = getHeight();
        int w = getWidth();
        if (mX > x && mX < x + w && mY > y - h && mY < y + h) {
            clicked = !clicked;
        }
    }
}