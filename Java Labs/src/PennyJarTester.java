import java.sql.SQLOutput;

public class PennyJarTester {
    public static void main(String[] args) {
        PennyJar test1=new PennyJar("Q");
        test1.deposit(4);
        test1.getBalance();
        test1.getGlassJarSize();
        test1.getPennies();
        System.out.println("Test for get balance for deposit");
        if(test1.getBalance()==0.04){
            System.out.println("passed test");
        } else {
            System.out.println("failed test");
        }
        test1.withdraw(4);
        System.out.println("Test for get balance for withdrawl");
        if(test1.getBalance()==0){
            System.out.println("passed test");
        } else {
            System.out.println("failed test");
        }

    }
}
