import WindowMannaging.Window;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class Main {
    /////////////////////////////////
    private static final int WIDTH = 1000;
    private static final int HEIGHT = 700;
    Window window;
    Graphics g;
    BufferStrategy bs;
    ////////////////////////////////// Class attributes
    public Main (){
        window = new Window(WIDTH,HEIGHT,"3D-Game");
        init();
    }

    private void init(){
        bs = window.getCanvas().getBufferStrategy();
        if(window.getCanvas().getBufferStrategy() == null){
            window.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();
        g.clearRect(0,0, window.getWidth(), window.getHeight());
            render(g);
    }

    public void tick(){}

    public void render(Graphics g){


    }
}
