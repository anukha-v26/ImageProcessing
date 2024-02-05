public class TintedPanel extends Panel {

    //constructor for class TintedPanel (using Panel class' constructor)
    public TintedPanel(int x, int y, int w, int h) {
        super(x, y, w, h);
    }

    // overriding inherited display method and displaying a green tinted strawberry
    public void display() {
        Main.app.tint(0, 255, 0);
        super.display();
        Main.app.noTint();
    }
}