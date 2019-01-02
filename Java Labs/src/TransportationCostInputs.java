import java.util.Scanner;

public class TransportationCostInputs{
    public static void main(String[] args) {
        //sets properties
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance from house to work:");
        double miles = sc.nextDouble();
        System.out.println("Enter cost of gas:");
        double gasPrice = sc.nextDouble();
        System.out.println("Enter miles per gallon:");
        double mpg = sc.nextDouble();
        System.out.println("Enter cost of car maintenance per mile:");
        double repairPrice = sc.nextDouble();
        System.out.println("Enter cost of train ticket:");
        double trainPrice = sc.nextDouble();

        //calculations
        double byTrain = trainPrice;
        System.out.println("Cost to travel by train: $" + byTrain);
        double byCar = gasPrice*(miles/mpg) + (miles*repairPrice);
        System.out.println("Cost to travel by car: $" + byCar);

        //determines travel options
        if(byTrain<byCar){
            System.out.println("Cheaper Option: train");
        }
        else if(byTrain>byCar){
            System.out.println("Cheaper Option: car");
        }
        else if (byTrain==byCar){
            System.out.println("Both ways of travel cost the same");
        }
    }
}
