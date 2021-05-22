package WindowMannaging;
import javax.swing.*;
import java.awt.*;
public class Window extends JFrame {
    Canvas canvas;
    /**
     *
     * @param length the Length of the Window
     * @param height The Height of the Window
     * @param WindowLable the Name of the Window
     */
    public Window(int length , int height,String WindowLable){
        super(WindowLable);
        this.setSize(length,height);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        canvas.setSize(length,height);
        this.add(canvas);
    }
    /**
     *
     * @param comp an 
     */
    public void addPane(Component comp){
        this.add(comp);
    }

    public Canvas getCanvas(){
        return canvas;
    }
}
