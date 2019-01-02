package sample;
import java.lang.Math;

public class PrintJob {
    private String color;
    private String paperType;
    private String sided;
    private int numPages;
    private double costPerPage;
    private double totalCost;

    public PrintJob(String colorIn,String paperTypeIn,String sidedIn, int numPagesIn){
        this.color=colorIn;
        this.paperType=paperTypeIn;
        this.sided=sidedIn;
        this.numPages=numPagesIn;
        this.costPerPage=0;
        this.totalCost=0;
    }
    public void determineCostPerPage(){
        if (this.color.equals("Greyscale")){
            this.costPerPage=.1;
        } else if (this.color.equals("P1")){
            this.costPerPage=.3;
        } else if (this.color.equals("P2")){
            this.costPerPage=.45;
        } else if (this.color.equals("P3")){
            this.costPerPage=.65;
        }

        if (this.sided.equals("Double")){
            this.costPerPage*=2;
        }

        if (this.paperType.equals("Matte")){
            this.costPerPage+=.05;
        } else if (this.paperType.equals("Glossy")){
            this.costPerPage+=.1;
        }

        this.costPerPage=Math.round(this.costPerPage*100.0)/100.0;
    }

    public void determineTotalCost(){
        if (this.costPerPage==0) {
            this.determineCostPerPage();
        }
        this.totalCost=this.numPages*this.costPerPage;

    }
    public double getCostPerPage(){
        return this.costPerPage;
    }
    public double getTotalCost(){
        return this.totalCost;
    }
}
