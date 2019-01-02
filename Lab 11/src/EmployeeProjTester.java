
/**
 * Tester to test the various employee classes
 * @author sstansfield
 * @date 10/30/17
 */
public class EmployeeProjTester {


    public static void main(String[] args) {

        SalariedEmployee AliceWhite= new SalariedEmployee("Alice", "White", "s1234",
                "345_Albany", "Ithaca", "NY", "6072228978", 52000.0);
        AliceWhite.determineWeeklyPay();
        System.out.println(AliceWhite.getFirstName() + " " + AliceWhite.getLastName()
                + " earned $" + AliceWhite.getWeeklyPay());

        WagedEmployee JoeDaniels= new WagedEmployee("Joe", "Daniels", "w1234",
                "9090_First", "Ithaca", "NY", "6072248989", 20.0, 50.0);
        JoeDaniels.determineWeeklyPay();
        System.out.println(JoeDaniels.getFirstName() + " " + JoeDaniels.getLastName()
                + " earned $" + JoeDaniels.getWeeklyPay());

        CommissionedEmployee BobSmith= new CommissionedEmployee("Bob", "Smith", "c1234",
                "12_State", "Ithaca", "NY", "6072228893", .10, 30000.0);
        BobSmith.determineWeeklyPay();
        System.out.println(BobSmith.getFirstName() + " " + BobSmith.getLastName()
                + " earned $" + BobSmith.getWeeklyPay());
    }
}


