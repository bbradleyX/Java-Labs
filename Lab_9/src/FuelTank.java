public class FuelTank {
    private double numGas;
    private double fuelCap;

    public FuelTank(double fuelCap) {
        this.numGas=0;
        this.fuelCap=fuelCap;
    }

    public double useGas(double mpg,double odometer){
        double usedGas = odometer / mpg;
        if (usedGas > numGas) {
            double gasLeft= usedGas -numGas;
            gasLeft = gasLeft * mpg;
            numGas = 0;
            return gasLeft;
        } else if (usedGas < numGas) {
            numGas -= usedGas;
        }
        return 0;
    }
    public void addGas(double gasAdd){
        if(gasAdd+numGas<fuelCap){
            this.numGas = this.numGas + gasAdd;
        }
        else if(numGas>fuelCap){
            System.out.println("Tank full");
        }
        else if(numGas==fuelCap){
            System.out.println("Tank full");
        }
    }
    public double getGas() {
        return numGas;
    }

   /* public boolean gasCheck() {
        if(numGas<fuelCap){
            return true;
        }
        else if(numGas==0){
            return false;
        }
        else if(numGas==fuelCap){
            return true;
        }
        else if(numGas>fuelCap){
            return false;
        }
        else {
            return false;
        }
        }*/
}
