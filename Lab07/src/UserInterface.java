/**
 * User interface for a console-based vending machine simulation
 * @Author Stansfield
 * @Date 10/2017
 */

import java.util.Scanner;

public class UserInterface {
    /**
     * The main methods loops to allow the user to take actions
     * @param args  not used
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        VendingMachine vendingMachine = new VendingMachine();
        int request = 0; //the choices for the user input
        double balance; //the price of the drink

        while (request > -1 && request <= 4) {

            System.out.println("\nWelcome to Soda Machine 2.0");
            System.out.println(" 1) Deposit Coins");
            System.out.println(" 2) Buy Drink");
            System.out.println(" 3) Get Change");
            System.out.println(" 4) Print Inventory");
            balance = vendingMachine.getBalance(); //returns balance
            System.out.println("Your balance is " + balance);
            System.out.println("\nwhat would you like to do? ");
            request = scan.nextInt();

            if (request == 1) {
                String coinInserted = "";
                do {
                    System.out.println("Please enter coin type 'nickel' or 'dime' or 'quarter' or 'next' when ready: ");
                    coinInserted = scan.next();
                    vendingMachine.insertCoin(coinInserted); //collection of coin method
                    balance = vendingMachine.getBalance(); //returns balance
                    System.out.println("\nYour balance is " + balance);
                } while (!coinInserted.equalsIgnoreCase("next")); //keeps adding coins until user enter next

            } else if (request == 2) {
                int selection;
                do {
                    System.out.println("Please make a selection: ");
                    System.out.println("1: Dr. Pepper: $1.25");
                    System.out.println("2: Snapple: $1.00");
                    System.out.println("3: Water: $0.80");
                    selection = scan.nextInt();
                } while (selection < 1 || selection > 3);

                if (vendingMachine.buy(selection)) { //determines drink chosen
                    System.out.println("Enjoy your drink!");
                }
                else {
                    System.out.println("Insufficient funds or selection out of stock");
                }
            }
            else if (request == 3  ) {
                if(vendingMachine.getBalance() > 0){ //returns balance
                    System.out.println("Please find " + vendingMachine.makeChange() + " in the coin return"); //calculates change: insertCoin-balance
                }
                else {
                    System.out.println("No change");
                }
            }

            else if (request == 4){
                String inventory = vendingMachine.getInventory(); //returns inventory
                System.out.print(inventory);
            }
        }//while request
    }//main
}//class