import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DrawComponent extends JComponent {
    public void paintComponent(Graphics g) {
        //Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        //create a rectangle and draw it
        Rectangle2D.Double box= new Rectangle2D.Double (50,100,200,300);

        //create a shape and draw it
        CubicCurve2D.Double fox= new CubicCurve2D.Double(1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0,4.5);

        //create a color
        Color blue=  new Color(255,0,255);
        g2.setColor(blue);
        g2.draw(fox);

        g2.translate(100,100);
        Color red= new Color(255,0,0);
        g2.setColor(red);
        g2.draw(box);

        Ellipse2D.Double circleMe=new Ellipse2D.Double (100,200,50,50);
        for(int x=255;x>=0;x--){
            circleMe.setFrame(200,200-x/2,x,x);
            g2.setColor(new Color(x,0,255-x));
            g2.fill(circleMe);
        }
        g2.draw(circleMe);
    }
}