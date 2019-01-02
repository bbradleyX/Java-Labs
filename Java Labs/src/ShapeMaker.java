import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.JFrame;
import java.awt.Graphics2D;
import java.awt.Color;
import java.util.Random;

public class ShapeMaker extends JComponent {
    public void paintComponent(Graphics g) {
        //Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        //Create colored background (night)
        Rectangle2D.Double night=new Rectangle2D.Double(0,0,800,600);
        //nightSky.setFrame(600,800,600,800);
        //g2.translate(100,100);
        g2.setColor(new Color(10,15,45));
        g2.fill(night);
        g2.draw(night);

        //Create, color, and draw circle shapes (stars)
        Ellipse2D.Double star = new Ellipse2D.Double(250,100,25,25);
        g2.setColor(new Color(255, 255, 255));
        g2.fill(star);
        g2.draw(star);
        Ellipse2D.Double star1 = new Ellipse2D.Double(350,100,25,25);
        g2.setColor(new Color(255, 255, 255));
        g2.fill(star1);
        g2.draw(star1);
        Ellipse2D.Double star2 = new Ellipse2D.Double(450,100,25,25);
        g2.setColor(new Color(255, 255, 255));
        g2.fill(star2);
        g2.draw(star2);
        Ellipse2D.Double star3 = new Ellipse2D.Double(300,200,25,25);
        g2.setColor(new Color(255, 255, 255));
        g2.fill(star3);
        g2.draw(star3);
        Ellipse2D.Double star4 = new Ellipse2D.Double(400,200,25,25);
        g2.setColor(new Color(255, 255, 255));
        g2.fill(star4);
        g2.draw(star4);
        /*for(int x=200;x<=300;){
            Ellipse2D.Double star2 = new Ellipse2D.Double(x+10,x/2,50,50);
            g2.setColor(new Color(255, 255, 255));
            g2.fill(star2);
            g2.draw(star2);
            x--;
        }*/

        //Create, color, and draw rectangle shape (grass)
        Rectangle2D.Double grass = new Rectangle2D.Double(0,500,800,200);
        //grass.setFrame(200, 200 - x / 2, x, x);
        g2.setColor(new Color(10, 100, 17));
        g2.fill(grass);
        g2.draw(grass);

        //Create, color, and draw arc shape (moon)
        Ellipse2D moon = new Ellipse2D.Double(0,0,150,150);
        g2.setColor(new Color(255, 255, 255));
        g2.fill(moon);
        g2.draw(moon);
        Ellipse2D moon2 = new Ellipse2D.Double(50,0,150,150);
        g2.setColor(new Color(10,15,45));
        g2.fill(moon2);
        g2.draw(moon2);

    }
}




