public class TintedPanel extends Panel {

    //constructor for class TintedPanel (using Panel class' constructor)
    public TintedPanel(int _x, int _y, int _w, int _h) {
        super(_x, _y, _w, _h);
    }

    // overriding inherited display method and displaying a green tinted strawberry
    public void display() {
        Main.app.tint(0, 255, 0);
        super.display();
        Main.app.noTint();
    }
}