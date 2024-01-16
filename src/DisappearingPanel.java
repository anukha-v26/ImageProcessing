public class DisappearingPanel extends Panel {
    private boolean clicked = true;

    //constructor for class DisappearingPanel (using Panel class' constructor)
    public DisappearingPanel(int _x, int _y, int _w, int _h) {
        super(_x, _y, _w, _h);
    }

    //sets it up for image to be displayed initially and whenever else clicked is true (clicked = true initially)
    public void display() {
        if (clicked) {
            super.display();
        }
    }

    //toggle to set clicked true or false depending on if the mouse was clicked on the image to cause the image to disappear/reappear
    public void handleMouseClicked(int mX, int mY) {
        int x = getX();
        int y = getY();
        int h = getHeight();
        int w = getWidth();
        if (mX > (x - w / 2) && mX < (x + w / 2) && mY > y - h / 2 && mY < y + h / 2) {
            clicked = !clicked;
        }
    }
}