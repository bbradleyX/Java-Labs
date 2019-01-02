public class PennyJar {
    private int pennies;
    private String glassJarSize;
    private int glassJar;
    private int glassJarCap;
    private double balance;
//Constructor
    public PennyJar(String glassJarSizeIn){
        this.pennies=0;
        this.glassJarSize=glassJarSizeIn;
        this.balance=0;
        this.glassJar=0;
        if(glassJarSizeIn.equals("G")){
            this.glassJarCap=7000;
        }
        else if(glassJarSizeIn.equals("HG")){
            this.glassJarCap=3500;
        }
        else if(glassJarSizeIn.equals("P")){
            this.glassJarCap=1750;
        }
        else if(glassJarSizeIn.equals("Q")){
            this.glassJarCap=875;
        }
    }
//Deposit method
    public void deposit(int pennies){
        this.glassJar=pennies+this.glassJar;
    }
//Withdraw method
    public void withdraw(int pennies){
        this.glassJar=this.glassJar-pennies;
    }
//Capacity
    public boolean dCapacity(int pennies){
        if(pennies+glassJar>=glassJarCap) {
            return true;
        }
        else{
            return false;
        }
    }
        public boolean wCapacity(int pennies){
            if(glassJar-pennies<=0) {
                return true;
            }
            else{
            return false;
                }
            }
//Get methods
    public int getPennies() {
        return this.glassJar;
    }
    public double getBalance() {
        this.balance=this.glassJar/100.0;
        return this.balance;
    }
    public String getGlassJarSize() {
        return this.glassJarSize;
    }
}
