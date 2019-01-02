
/**
 * Represents a salaried employee (annual pay)
 * @author sstansfield
 * @date 10/30/17
 */
public class SalariedEmployee {
    //properties:
    private String firstName, lastName;
    private String IDNumber;
    private String street;
    private String city;
    private String state;
    private String phone;
    private double weeklyPay;
    private double salary;


    /**
     * Constructor
     * @param firstNameIn  first name
     * @param lastNameIn  last name
     * @param IDNumberIn  id number (6 digits)
     * @param streetIn    address
     * @param cityIn      address
     * @param stateIn     address
     * @param phoneIn     address
     * @param salaryIn    annual salary
     */
    public SalariedEmployee(String firstNameIn, String lastNameIn, String IDNumberIn, 
            String streetIn, String cityIn, String stateIn, String phoneIn, double salaryIn){
        firstName = firstNameIn;
        lastName=lastNameIn;
        IDNumber = IDNumberIn;
        street = streetIn;
        city=cityIn;
        state = stateIn;
        phone = phoneIn;
        salary = salaryIn;
        weeklyPay = 0.0;   
    }

    /**
     * calculate pay for a single week
     */
    public void determineWeeklyPay(){
        weeklyPay = salary/52.00;
    }

    /**
     * accessor
     * @return weekly pay
     */
    public double getWeeklyPay() {
        return weeklyPay;
    }

    /**
     * accessor
     * @return yearly salary
     */
    public double getSalary() {
        return salary;
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
    * Purpose:  accessor
    * @return street
    */
    public String getStreet() {
        return street;
    }

    /**
     * accessor
     * @return city
     */
    public String getCity() {
        return city;
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
     * @return phone number
     */
    public String getPhone() {
        return phone;
    }
}


