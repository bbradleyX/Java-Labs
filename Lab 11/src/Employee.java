/**
 * Represents an employee
 * @author sstansfield
 * @date 4/4/18
 */

public abstract class Employee {
    //properties:
    protected String firstName, lastName;
    protected String IDNumber;
    protected String street;
    protected String city;
    protected String state;
    protected String phone;
    protected double weeklyPay;

    /**
     * Constructor
     * @param firstNameIn  first name
     * @param lastNameIn  last name
     * @param IDNumberIn  id number (6 digits)
     * @param streetIn    address
     * @param cityIn      address
     * @param stateIn     address
     * @param phoneIn     phone number

     */
    public Employee(String firstNameIn, String lastNameIn, String IDNumberIn,
                    String streetIn, String cityIn, String stateIn, String phoneIn){
        firstName = firstNameIn;
        lastName=lastNameIn;
        IDNumber = IDNumberIn;
        street = streetIn;
        city=cityIn;
        state = stateIn;
        phone = phoneIn;
        weeklyPay = 0.0;
    }

    /**
     * accessor
     * @return weekly pay
     */
    public double getWeeklyPay() {
        return weeklyPay;
    }
    public abstract void determineWeeklyPay();

    /**
     * accessor
     * @return yearly salary
     */

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