
/**
 * represent a commissioned employee
 * @author sstansfield
 * @date 10/30/17
 */
public class CommissionedEmployee {
    //properties:
    private String firstName, lastName;
    private String IDNumber;
    private String street;
    private String city;
    private String state;
    private String phone;
    private double weeklyPay;
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
        firstName = firstNameIn;
        lastName=lastNameIn;
        IDNumber = IDNumberIn;
        street = streetIn;
        city = cityIn;
        state = stateIn;
        phone = phoneIn;
        commission = commissionIn;
        sales = salesIn;
        weeklyPay = 0.0;   
    }

    /**
     * calculate the weekly pay based on total sales
     */
    public void determineWeeklyPay(){
        weeklyPay = commission*sales;
    }


    /**
     * accessor
     * @return weekly Pay
     */
    public double getWeeklyPay() {
        return weeklyPay;
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

    /**
     * accessor
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * accessor
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * accessor
     * @return id number
     */
    public String getIDNumber() {
        return IDNumber;
    }

    /**
     * accessor
     * @return street address
     */
    public String getStreet() {
        return street;
    }

    /**
     * accessor
     * @return city
     */
    public String getCity() {
        return firstName;
    }

    /**
     * accessor
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * accessor
     * @return phone
     */
    public String getPhone() {
        return phone;
    }
}
