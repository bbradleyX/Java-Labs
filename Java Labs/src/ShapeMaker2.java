import javax.swing.*;

public class ShapeMaker2 {
    public static void main(String[] args) {
        //create a JFrame object
        JFrame frame=new JFrame();

        //set size
        frame.setSize(600,800);

        //set it title
        frame.setTitle("Lab 3 Drawing");

        //set it up to be able to close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create an object of what to draw
        ShapeMaker component=new ShapeMaker();

        //add what to draw to the frame
        frame.add(component);

        //make it show up
        frame.setVisible(true);
    }
}
