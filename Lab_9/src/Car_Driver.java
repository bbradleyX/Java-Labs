import java.util.Scanner;
// should be able to find out how much gas you currently have,
//to refuel the car by adding gas and to determine how far you have driven at any given tim
public class Car_Driver {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter car miles per gallons");
        double mpg=sc.nextDouble();
        System.out.println("Enter car fuel capacity");
        double fuelCap=sc.nextDouble();
        System.out.println("Enter current car fuel");
        double numGas=sc.nextDouble();
        Car car1=new Car(mpg,numGas);
        FuelTank fuel=new FuelTank(fuelCap);
        System.out.println("What would you like to do: 1. Drive\n 2.Add gas\n3.Determine Travel");
        int option=sc.nextInt();
        if(option==1){
            System.out.println("Enter amount of miles you want to drive:");
            double distance=sc.nextDouble();
            car1.drive(distance);
            System.out.println("You have driven "+ car1.getMiles()+" miles"+" You have "+ fuel.getGas()+" gallons left");
        }
        else if(option==2){
            System.out.println("Enter amount you want to add:");
            double add=sc.nextDouble();
            fuel.addGas(add);
        }
        else if(option==4){
            System.out.println("You have driven "+ car1.getMiles()+" miles"+" You have "+ fuel.getGas()+" gallons left");
        }


    }
}