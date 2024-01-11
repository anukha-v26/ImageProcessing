public class TintedPanel extends Panel{
    public TintedPanel(int _x, int _y, int _w, int _h){
        super(_x, _y, _w, _h);
    }
    public void display(){ // overriding inherited display method
        Main.app.tint(0, 255, 0);
        super.display();
        Main.app.noTint();
    }
}