import java.util .Scanner;
///public means anyone can run the code
///static means it is a function
///ln means a line change
///class names what is being called, maybe a function
///void means there are no returns, Java requires specific identification of what is being returned
public class Lab1 {
    public static void main(String[] args) {
//        System.out.println("Hello Bob");
        Scanner sc=new Scanner(System.in);
        System.out.println("Type in your name:");
        String hello= sc.nextLine();
        System.out.println("Hello, "+hello);
        sc.close();
    }
}

