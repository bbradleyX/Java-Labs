import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
public class IOMain2 {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        Scanner in=null;
        File fileIn=null;
        int total=0;

        try {
            fileIn = new File("src/data.txt");
            in = new Scanner(fileIn);
            while (in.hasNext()) {
                int value = in.nextInt();
                total += value;
                System.out.println(value);
            }
            System.out.println("Total: " + total);
            in.close();
        }catch (FileNotFoundException e){
            System.out.println(e);
            in.close();
        }

    }
}
