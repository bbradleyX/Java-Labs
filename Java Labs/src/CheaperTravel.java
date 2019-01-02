public class CheaperTravel {
    //Properties
    private double distance;
    private double mpg;
    private double gasPrice;
    private double repairPrice;
    private double trainPrice;

    //Constructor
    public CheaperTravel(double distanceIn, double mpgIn, double gasPriceIn, double repairPriceIn, double trainPriceIn){
        this.distance=distanceIn;
        this.mpg=mpgIn;
        this.gasPrice=gasPriceIn;
        this.repairPrice=repairPriceIn;
        this.trainPrice=trainPriceIn;
    }

    //Calculation to travel by Car
    public double carCost(){
        double carPrice= (gasPrice*(distance/mpg))+(distance*repairPrice);
        return carPrice;
        /*if(this.distance<=0 || this.mpg<=0 || this.gasPrice<=0 || this.repairPrice<=0){
            System.out.println("A propety is less than 0, therefore cost to travel by car can't be calculated");
            return 0;
        }else{
            double carPrice= (gasPrice*(distance/mpg))+(distance*repairPrice);
            return carPrice;
        }*/
    }

    //Comparison travel options
    public boolean travelOption(double carPrice){
        if(carPrice>this.trainPrice){
            //System.out.println("Cheaper Travel is by train");
            return true;
        }else if (carPrice<this.trainPrice){
            //System.out.println("Cheaper Travel is by car");
            return true;
        }else if(carPrice==this.trainPrice){
            //System.out.println("Both travel options are the same price");
            return true;
        }
        return false;
    }
}
