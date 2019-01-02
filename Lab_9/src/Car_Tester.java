public class Car_Tester {
    public static void main(String[] args) {
        Car car2=new Car(2,80);
        //FuelTank fuel1=new FuelTank(80);
        car2.drive(70);
        if (car2.getMiles() != 70){
            System.out.println("drive method failed ");
        } else {
            System.out.println("drive method passed");
        }
        Car car3=new Car(3,90);
        FuelTank fuel2=new FuelTank(80);
        fuel2.addGas(70);
        car3.drive(30);
        car3.drive(30);
        if(fuel2.getGas()!=70){
            System.out.println("addGas method failed");
        }
        else{
            System.out.println("addGas method passed");
        }
        Car car4=new Car(4,100);
        FuelTank fuel3=new FuelTank(80);
        fuel3.addGas(40);
        car4.drive(20);
        car4.drive(30);
        if(car4.getMiles()!=50){
            System.out.println("failed test");
        }
        else{
            System.out.println("passed test");
        }

    }
}

