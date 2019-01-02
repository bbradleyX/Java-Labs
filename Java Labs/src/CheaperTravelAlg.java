import java.util.Scanner;

public class CheaperTravelAlg{
    public static void main(String[] args){
            //sets properties
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter distance from house to work:");
           double  distanceIn= sc.nextDouble();
            System.out.println("Enter miles per gallon:");
           double mpgIn= sc.nextDouble();
            System.out.println("Enter cost of gas:");
           double gasPriceIn= sc.nextDouble();
            System.out.println("Enter cost of car maintenance per mile:");
            double repairPriceIn= sc.nextDouble();
            System.out.println("Enter cost of train ticket:");
            double trainPriceIn= sc.nextDouble();
            CheaperTravel example1=new CheaperTravel(distanceIn,mpgIn,gasPriceIn,repairPriceIn,trainPriceIn);

            //calculations
            example1.carCost();
        System.out.println("Cost to travel by car:" +  example1.carCost());

            //determines travel options
            example1.travelOption(example1.carCost());
        if( example1.carCost()>trainPriceIn){
            System.out.println("Cheaper Travel is by train");
        }else if ( example1.carCost()<trainPriceIn){
            System.out.println("Cheaper Travel is by car");
        }else if( example1.carCost()==trainPriceIn){
            System.out.println("Both travel options are the same price");
        }
    }
}