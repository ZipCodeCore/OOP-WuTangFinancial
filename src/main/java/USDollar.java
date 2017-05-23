/**
 * Created by rahmirford on 5/22/17.
 */
public class USDollar {
    private static double rate = 1.00;
    private static double usDollars;

    public static double convertToUSDollar(double amount) {
        usDollars = amount;
        return amount;
    }

    public static double getRate() {
        return rate;
    }


}

