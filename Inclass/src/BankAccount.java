//void= not returning something
//static= the variable or function is shared between all instances of that class
public class BankAccount {
    //properties
    private double balance;
    private double interestRate;
    private String history;
    //private String example;

    //constructor
    public BankAccount(double balanceIn,double interestRate){
        this.interestRate=interestRate;
        this.balance=balanceIn;
        this.history="";
        }
    //withdraw method: take money from balance
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Attempt to withdraw a negative or zero amount failed");
        } else if (amount > this.balance) {
            System.out.println("Cannot withdraw more money than is in the account");
        } else {
            this.balance -= amount;
        }
    }
    //getBalance method: check the value of balance
    public void getBalance(){
        if(balance<=0){
            System.out.println("Attempt to withdraw a negative or zero amount failed");
        }else{
            System.out.println("Current balance"+this.balance);
        }
    }
    //Methods updates the history of your account
    //private to secure that only user has access to see what the history of their account
    private void updateHistory(String transaction, double amount){
        String date="2/14/18";
        date+=" "+transaction+'$'+amount+"\n";
        this.history+=date;
    }
    //deposit method: add money to balance
    public void deposit(double amount){
        if(amount<=0) {
            System.out.println("Attempt to add a negative or zero amount failed");
        }else{
            this.balance+=amount;
        }
    }
}
