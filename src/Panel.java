import processing.core.PImage;
    public class Panel {
        private PImage img;
        private int x, y;
        private int w, h;
        public Panel(int _x, int _y, int _w, int _h) {
            x = _x;
            y = _y;
            w = _w;
            h = _h;
        }
        public void setupImage(String imageName) {
            img = Main.app.loadImage(imageName);
        }
        public void display() {
            Main.app.image(img, x, y, w, h);
        }
        public void handleMouseClicked(int mX, int mY) {
        }

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
        public PImage getImageCopy() {
            return img.copy();
        }
    }