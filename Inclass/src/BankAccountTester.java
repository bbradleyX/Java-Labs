public class BankAccountTester {
    public static void main(String[] args) {
        boolean getBal=true;
        boolean constr=true;
        boolean withd=true;
        boolean dep=true;
        boolean inter=true;
        BankAccount account1=new BankAccount(1000,.2);
        BankAccount account2=new BankAccount(100,.05);
        account1.withdraw(100);
        account1.deposit(100);
        account1.getBalance();

        /*
        if(account1.getBalance()==1000){
            System.out.println("Constructor called balance set correctly");
        }else{
            System.out.println("Ether constructor failed or balance was incorrect");
        }
        if (account1.calculateInterest() == 10) {
            System.out.println("Interest was set correctly by constructors and interest calculated correctly");
        }else{
            System.out.println("Either interest set incorrectly by constructor or calculations incorrect");
        }
        if(account1.getBalance()==1010){
            System.out.println("Interest calculated and added to balance correctly");
        }else{
            System.out.println("Balance no updated by calculateInterest");
        }*/
        //test deposit
        /*if(account1.getBalance()!=1010.0){
            System.out.println("deposit failed for positive amount");
            getBal=false;*/
        }
    }
