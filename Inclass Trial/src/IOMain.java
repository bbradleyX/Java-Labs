import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class IOMain {
    public static void main(String[] args) throws FileNotFoundException {
        //File inputFile =new File("src/data.txt");
        //Scanner in=new Scanner(inputFile);

        //PrintWriter out=new PrintWriter("outputFile.txt");
        /*int total=0;
        while(in.hasNext()){
            int value=in.nextInt();
            total+=value;
            System.out.println(value);
            out.println(value);
        }
        System.out.println("total"+total);
        out.printf("Total: %d\n",total);
    }*/
        File inputFile = new File("src/employee.txt");
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter("outputFile.txt");
        while(in.hasNext()){

        }
    }
}
