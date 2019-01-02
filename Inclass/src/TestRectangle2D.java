import java.awt.geom.*;

public class TestRectangle2D {
    public static void main(String[] args){
        int num=5;
        boolean bool=true;

        Rectangle2D.Double myRect=new Rectangle2D.Double(5.0,10.0,20.0,30.0);
        //test the accessor methods;
        double xPos=myRect.getX();
        System.out.println("expected 5.0 got"+xPos);
        Rectangle2D.Double rect0= new Rectangle2D.Double();
        Rectangle2D.Double rect1= new Rectangle2D.Double();
    }
}
