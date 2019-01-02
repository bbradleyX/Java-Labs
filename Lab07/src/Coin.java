
//Sets values for coins
public class Coin {
    public static double nickel = 0.05;
    public static double dime = 0.10;
    public static double quarter = 0.25;
    public static double unrecognized = 0.0;

    public static double value(String coinType) {
        double coinValue;
        if (coinType.equalsIgnoreCase("nickel")) {
            coinValue = nickel;
        } else if (coinType.equalsIgnoreCase("dime")) {
            coinValue = dime;
        } else if (coinType.equalsIgnoreCase("quarter")) {
            coinValue = quarter;
        } else {
            coinValue = unrecognized;
        }
        return coinValue;
    }
}
