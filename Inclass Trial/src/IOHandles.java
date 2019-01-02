//Try catch for "just in case" purposes
//Use to fix user input errors
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class IOHandles {
        public static void main(String[] args) {
            Scanner console=new Scanner(System.in);
            Scanner in=null;
            File fileIn=null;
            int total=0;
            boolean keeprunning=true;
            System.out.println("Please enter a filename: ");
            String name=console.next();
            while(keeprunning) {
                try {
                    fileIn = new File("src/data.txt");
                    in = new Scanner(fileIn);
                    keeprunning=false;
                } catch (FileNotFoundException e) {
                    System.out.println(e);
                    in.close();
                    keeprunning=true;
                }
            }
        }
    }
