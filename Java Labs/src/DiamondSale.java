public class DiamondSale {
//Properties
    private double caratWeight;
    private String clarity;
    private String color;
    private double colorRating;
    private double baseCost;
    private double totalCost;

//Constructor
    public DiamondSale(double caratWeightIn,String clarityIn,String colorIn){
        this.caratWeight=caratWeightIn;
        this.clarity=clarityIn;
        this.color=colorIn;
    }

//Base price calculator method
    public double basePrice(){
        if(this.caratWeight<=1){
            this.baseCost=0;
            return this.baseCost;
        }
        else if(this.clarity.equals("yes")){
            this.baseCost=((this.caratWeight/.25)*8000)*2;
            return this.baseCost;
        }
        else if(this.clarity.equals("no")){
            this.baseCost=((this.caratWeight/.25)*8000);
            return this.baseCost;
        }
        else{
            System.out.println("Invalid clarity");
            return this.baseCost;
        }
    }

//Final Price calculator
    public double finalPrice(){
        if(this.color.equals("D")){
            this.colorRating=0;
            this.totalCost=baseCost+ (baseCost*this.colorRating);
            return this.totalCost;
        }
        else if(this.color.equals("K")){
            this.colorRating= -.20;
            this.totalCost=baseCost+ (baseCost*this.colorRating);
            return this.totalCost;
        }
        else if(this.color.equals("T")){
            this.colorRating= -.45;
            this.totalCost=baseCost+ (baseCost*this.colorRating);
            return this.totalCost;
        }
        else{
            System.out.println("Invalid color");
            return this.totalCost;
        }
    }
}
