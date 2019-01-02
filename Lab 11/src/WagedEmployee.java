/**
 * represents a waged (hourly) employee
 * @author sstansfield
 * @date 10/30/17
 */
public class WagedEmployee extends Employee{
    //properties:
    private double wage;
    private double hoursWorked;

    /**
     * constructor
     * @param firstNameIn first name
     * @param lastNameIn last name
     * @param IDNumberIn id number (6 digits)
     * @param streetIn street address
     * @param cityIn city
     * @param stateIn state
     * @param phoneIn phone number
     * @param wageIn hourly wage
     * @param hoursWorkedIn  hours worked this week
     */
    public WagedEmployee(String firstNameIn, String lastNameIn, String IDNumberIn,
                         String streetIn, String cityIn, String stateIn, String phoneIn,
                         double wageIn, double hoursWorkedIn){
        super(firstNameIn,lastNameIn, IDNumberIn, streetIn, cityIn, stateIn, phoneIn);
        wage=wageIn;
        hoursWorked=hoursWorkedIn;
    }

    /**
     * calculate the weekly pay including overtime pay
     */
    public void determineWeeklyPay(){
        if(hoursWorked > 40.0) {
            weeklyPay = wage * 40.0 + wage * 1.5 * (hoursWorked - 40.0);
        }
        else {
            weeklyPay = wage*hoursWorked;
        }
    }


    /**
     * accessor
     * @return weeklyPay
     */
    public double getWeeklyPay() {
        return weeklyPay;
    }

    /**
     * accessor
     * @return hourly wage
     */
    public double getWage() {
        return wage;
    }

    /**
     * accessor
     * @return total hours worked this week
     */
    public double getHoursWorked() {
        return hoursWorked;
    }

    /**
     * accessor
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }


    /**
     * accessor
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * accessor
     * @return IDNumber
     */
    public String getIDNumber() {
        return IDNumber;
    }

    /**
     * accessor
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

