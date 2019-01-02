
/**
 * represent a commissioned employee
 * @author sstansfield
 * @date 10/30/17
 */
public class CommissionedEmployee extends Employee{
    //properties:
    private double commission;
    private double sales;

    /**
     * constructor
     * @param firstNameIn
     * @param lastNameIn
     * @param IDNumberIn
     * @param streetIn
     * @param cityIn
     * @param stateIn
     * @param phoneIn
     * @param commissionIn
     * @param salesIn
     */
    public CommissionedEmployee(String firstNameIn, String lastNameIn, String IDNumberIn,
                                String streetIn, String cityIn, String stateIn, String phoneIn,
                                double commissionIn, double salesIn){
        super(firstNameIn,lastNameIn, IDNumberIn, streetIn, cityIn, stateIn, phoneIn);
        commission = commissionIn;
        sales = salesIn;
    }

    /**
     * calculate the weekly pay based on total sales
     */
    public void determineWeeklyPay(){
        weeklyPay = commission*sales;
    }

    /**
     * accessor
     * @return commission percent
     */
    public double getCommission() {
        return commission;
    }

    /**
     * accessor
     * @return total sales
     */
    public double getSales() {
        return sales;
    }
}
