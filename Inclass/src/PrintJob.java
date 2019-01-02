public class PrintJob {
    /*
    Client Request: determine the cost per page and total cost of orders received by a print shop
    Inputs:
        -type of paper (matte or glossy)
        -color(grayscale, P1, P2, P3)
        -1 or doublesided request (single or both)
        -user done question
    Domain Knowledge:
        -Prices per page (.05 matte and .10 glossy)
        -Prices for color (.10 gray, .20 P1, .45 P2, .65 P3)
        -Cost per page = (paper cost + sided)* color cost
        -Total cost = Cost per page * # of pages
        -Double sided means double the color price (color*2)
        -Prices are greater than 0
        -Number of pages is greater than 0
    Outputs:
        -Ongoing price per page
        -Final cost
    UML Diagram:
        -Class: PrintJob
        -Properties: colors (strings), paper types(strings), page costs(double), sided(int), order #(int), double costPerPage, double totalCost
        -Methods: PaperOrder-Constructor(properties),void totalCost, void costPerPage, double getTotalCost, double getCostPerPage

    Examples: To test
    //Change one aspect at a time
    //Make a chart
    a)  "How many copies are you making:" 1
        "What type of paper would you like to use (matte or glossy): "
        "What color paper would you like to use (grayscale, P1, P2, or P3): grayscale "
        "One or Double-sided (1 or 2): 2"
    b)  Color           Paper Type           Sided          # of Pages          Cost per page           Total cost
       grayscale        matte                   1               1                   .15                     .15
       grayscale        matte                   2               2                   .15                     .30
       grayscale        matte                   2               2                   .25                     .50
       grayscale        glossy                  2               2                   .20                     .40
       P1               matte                   1               2                   .35                     .70
       P2               matte                   1               2                   .50                     1.00
       P3               matte                   1               2                   .70                     1.40
     */

    //Properties
    private String color;
    private double greyScaleCost;
    private double P1Cost;
    private double P2Cost;
    private double P3Cost;
    private String paperType;
    private double matteCost;
    private double glossyCost;
    private String sided;
    private int numberOfPages;
    private double costPerPage;
    private double totalCost;

    //Constructor
    public PrintJob(String colorIn,String paperTypeIn,String sidedIn,int numberofPagesIn){
        this.color=colorIn;
        this.paperType=paperTypeIn;
        this.sided=sidedIn;
        this.numberOfPages=numberofPagesIn;
        this.costPerPage=-1;
        this.totalCost=-1;
    }


    //Order method
    public void determineCostPerPage() {
        if (this.color.equals("greyscale")) {
            this.glossyCost = .10;
            this.greyScaleCost = .10;
            this.P1Cost = .20;
            this.P2Cost = .45;
            this.P3Cost = .63;
        } else if (this.sided.equals("double")) {
            this.costPerPage *= 2;
        } else if (this.paperType.equals("matte")) {
            this.costPerPage += .05;
            this.totalCost = this.numberOfPages * this.costPerPage;
        }
    }
    //Calculate cost per page
    public double getCostPerPage() {
        determineCostPerPage();
        return costPerPage;
    }
    public void determineTotalCost(){
        if (this.costPerPage != -1) {
            this.costPerPage = this.costPerPage * this.numberOfPages;
        } else if (this.costPerPage == -1) {
            this.determineCostPerPage();
        }
    }
    public double getTotalCost(){
        return totalCost;
    }
}

