import java.util.Scanner;
public class PennyJarDriver {
    public static void main(String[] args) {
        //Set properties
        Scanner sc = new Scanner(System.in);
        PennyJar example1;
        System.out.println("Enter glass jar size");
        String glassJarSizeIn = sc.nextLine();
        example1 = new PennyJar(glassJarSizeIn);
        System.out.println("add, remove, check, or done");
        String userInput = sc.nextLine();
        while (!userInput.equals("done")) {
            if (userInput.equals("check")) {
                System.out.println("Balance is:"+example1.getBalance());
            }
            else{
                System.out.println("Enter amount of pennies");
                int penniesIn = sc.nextInt();
                sc.nextLine();

                if (userInput.equals("remove")) {
                    if (example1.wCapacity(penniesIn)) {
                        System.out.println("Glass Jar is empty");
                        userInput = "done";
                    }
                    else{
                        example1.withdraw(penniesIn);
                    }
                }
                else if (userInput.equals("add")) {
                    if (example1.dCapacity(penniesIn)) {
                        System.out.println("Glass Jar is full");
                        userInput = "done";
                    }
                    else{
                        example1.deposit(penniesIn);
                    }
                }
            }
            System.out.println("add, remove, check, or done");
            userInput = sc.nextLine();

            if (userInput.equals("done")){
                System.out.println("Glass Jar Size: " + example1.getGlassJarSize());
                System.out.println("Number of pennies in Glass Jar: " + example1.getPennies());
                System.out.println("Glass Jar Balance: " + example1.getBalance());
            }
        }
        System.out.println("Glass Jar Size: " + example1.getGlassJarSize());
        System.out.println("Number of pennies in Glass Jar: " + example1.getPennies());
        System.out.println("Glass Jar Balance: " + example1.getBalance());
    }
}
/*
  while(userInput."done"){
          if(userInput==)
          PennyJar example1= new PennyJar(String glassJarSizeIn,double penniesIn);

          System.out.println("Enter glass jar size, check properties, or done:  ");
          String userInput=sc.nextLine();
          }
          System.out.println("Glass Jar Size: "+ );
          System.out.println("Number of pennies in Glass Jar: "+ penniesIn);
          System.out.println("Glass Jar Balance: "+ balance);*/
