import processing.core.PApplet;
public class Main extends PApplet {
    public static Main app;
    public static void main(String[]args){
        PApplet.main("Main");
    }
    public Main(){app = this;}
    private Panel[] panels;
    private final int NUM_PANELS_HORIZONTAL = 4;
    private final int NUM_PANELS_VERTICAL = 5;

    public void settings(){size(600,600);}

    public void setup(){
        imageMode(CENTER);
        //size(600, 600);
        panels = new Panel[NUM_PANELS_HORIZONTAL * NUM_PANELS_VERTICAL];
        int index = 0;
        int w = width/NUM_PANELS_HORIZONTAL;
        int h = height/NUM_PANELS_VERTICAL;
        Panel p;
        for(int i = 0; i < NUM_PANELS_VERTICAL; i++){
            for(int j = 0; j < NUM_PANELS_HORIZONTAL; j++){
                int x = (j * w)+ w/2;
                int y = (i * h) + h/2;
                if (i % 5 == 0){
                    p = new Panel(x, y, w, h);
                }else if (i % 5 == 3){
                    p = new TintedPanel(x, y, w, h);
                }else if (i % 5 == 2){
                    p = new ContrastingPanel(x,y,w,h);
                }else if (i % 5 == 1){
                    p = new RotatingPanel(x,y,w,h);
                }else{
                    p = new DisappearingPanel(x, y, w, h);
                }
                p.setupImage("data/strawberry.png");
                panels[index] = p;
                index++;
            }
        }
    }

    public void draw(){
        fancyBackground();
        for (int row = 0; row < panels.length; row++){
            Panel p = panels[row];
            p.display();
        }
    }

    public void mouseClicked(){
        for (int i = 0; i < panels.length; i++){
            Panel p = panels[i];
            p.handleMouseClicked(mouseX, mouseY);
        }
    }

    private void fancyBackground(){
        loadPixels();
        for(int y = 0; y < height; y++){
            for (int x = 0; x < width; x++){
                int index = x + (y * width);
                if (x % 30 == 0){
                    pixels[index] = color(108, 163, 115);
                } else {
                    pixels[index] = color(200, 230, 203);
                }
            }
        }
        updatePixels();
    }
}