package sample;

public class Commuter {

    private  double dist;
    private double mpg;
    private double ticket;
    private double gasCost;
    private double maintenance;
    private double costToDrive;
    private String cheaperTransportation;

    public Commuter(  double dist, double mpg, double gasCost, double maintenance, double ticket){
        this.dist = dist;
        this.mpg = mpg;
        this.gasCost = gasCost;
        this.maintenance=maintenance;
        this.ticket=ticket;
        this.costToDrive=0.0;
        this.cheaperTransportation=null;
    }

    public void calculateCostToDrive(){
        double totalMaint = maintenance * dist;
        double gallonsUsed = dist / mpg;
        this.costToDrive = totalMaint + gasCost*gallonsUsed;
    }

    public void determineCheaperTransportation(){
        if (this.costToDrive > this.ticket){
            this.cheaperTransportation = "Train";
        }
        else {
            this.cheaperTransportation = "Drive";
        }
    }

    public double getCostToDrive() {
        return this.costToDrive;
    }

    public String getCheaperTransportation(){
        return this.cheaperTransportation;
    }
}
