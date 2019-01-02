public class Product {
    private String name;
    private int quantity;
    private double price;

    public Product(String name, int quantity,double  price){
        this.name=name;
        this.quantity= quantity;
        this.price=price;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public void incrementQuantity(int number){
         quantity+=number;
    }
    public boolean decrementQuantity(){
        if(quantity>0){
            quantity=quantity-1;
            return true;
        }
        else{
            return false;
        }
    }
    public void changePrice(double newPrice){
        this.price=newPrice;
    }
    public double getPrice(){
        return this.price;
    }
    public String toString(){
        String productDetails= "Product name: "+this.name+" Quantity: "+this.quantity+" Price: "+this.price;
        if(name.equals("Dr. Pepper")){
            return productDetails;
        }
        else if(name.equals("Snapple")) {
            return productDetails;
        }
        else if(name.equals("Water")){
            return productDetails;
        }
        else{
            return "not a drink option";
        }
    }
}