import java.util.ArrayList;
public class VendingMachine {
    private ArrayList<Product> inventory;
    private double balance;
    private Product desiredProduct;

    public VendingMachine(){
        this.balance=0;
        Product drink1=new Product("Dr. Pepper",5,1.25);
        Product drink2=new Product("Snapple",5,1);
        Product drink3=new Product("Water",5,.80);
        this.inventory =new ArrayList<>();
        this.inventory.add(drink1);
        this.inventory.add(drink2);
        this.inventory.add(drink3);
        this.desiredProduct=null;
    }
    public double getBalance(){
        return this.balance;
    }
    public double makeChange(){
        double change=this.balance-desiredProduct.getPrice();
        return change;


    }
    public String getInventory() {
       return desiredProduct.toString();
    }
    public void insertCoin(String cointype){
        this.balance+=Coin.value(cointype);
    }
    public boolean buy(int selection){
        this.desiredProduct=inventory.get(selection-1);
        if(desiredProduct.getQuantity()>0 && desiredProduct.getPrice()<=this.balance ) {
            this.balance=this.balance-desiredProduct.getPrice();
            makeChange();
            desiredProduct.decrementQuantity();
            return true;
        }
        else{
            return false;
        }
    }
}
