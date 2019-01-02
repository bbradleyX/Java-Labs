public class Car{
    private double mpg;
    private FuelTank fuel;
    private double numGas;
    private double odometer;
    public Car(double mpg,double numGas){
        //FuelTank fuel=new FuelTank(fuelCap);
        this.mpg=mpg;
        this.numGas=numGas;
        this.odometer=0;
    }

    public void drive(double distance){
        this.odometer=distance+this.odometer;
        fuel.useGas(mpg,odometer);
    }
    public double getMiles(){
        return odometer;
    }
}
