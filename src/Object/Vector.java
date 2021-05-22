package Object;

import java.awt.*;

public class Vector {
    double x,y,z;
    public Vector(double x,double y,double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Point convertTo2D(Vector v){
        return new Point((int)(500+y),(int)(350+z));
    }
}
