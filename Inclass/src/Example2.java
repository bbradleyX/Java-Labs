///++ -> incrementer, -- -> decrementer
/* &&, ||, !*/
public class Example2 {
    public static void main (String[] args){
        int num1=1;
        double num2=2.3;
        String str1=new String( "wow");
        boolean bool=true;
        double interestRate=2.3;
        num1=3+4;//this is an inline comment
        num1-=3;
    /*this is a
    multi line comment
     */
        System.out.println(num1);
        num1++;
        double balance=1000;
        interestRate=.05;
        if(balance>0 && interestRate>0){
            double goal=balance*2;
            int counter=0;
            while (balance<goal) {
                counter++;
            }
        }
        else if(balance<0){
            System.out.println("bogus");
        }
    }
}

