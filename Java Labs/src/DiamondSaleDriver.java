import java.util.Scanner;

public class DiamondSaleDriver {
    public static void main(String[] args) {
        //sets properties
        Scanner sc = new Scanner(System.in);
        System.out.println("Is the diamond clarity flawless?: ");
        String clarityIn = sc.nextLine();
        System.out.println("Enter diamond color: ");
        String colorIn = sc.nextLine();
        System.out.println("Enter diamond weight in carats: ");
        double caratWeightIn = sc.nextDouble();
        DiamondSale sale1= new DiamondSale(caratWeightIn,clarityIn,colorIn);
        //calculate base price
        double baseCost=sale1.basePrice();
        System.out.println("Base cost of diamond is: $" + baseCost);

        //calculate final price
        double totalCost=sale1.finalPrice();
        System.out.println("Total cost of diamond is: $" + totalCost);
    }
}
