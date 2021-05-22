package Object;

import java.awt.*;

/**
 * Ein Quader object
 */
public class Polygone {
    //////////////////////////
    Dimension startpoint;
    int length;
    int height;
    int depth;
    ////////////////////////// Class attributes

    /**
     *
     * @param startpoint der Obere linke punkt des Quaders
     * @param length die Länge des Quaders
     * @param height die Höhe des Quaders
     * @param depth die Tiefe des Quaders
     */
    public Polygone(Dimension startpoint , int length, int height, int depth){
        this.startpoint = startpoint;
        this.length = length;
        this.height = height;
        this.depth = depth;
    }
    public void render(Graphics g){

    }
}
