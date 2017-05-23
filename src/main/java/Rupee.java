/**
 * Created by rahmirford on 5/22/17.
 */
public class Rupee {
    private static double rate = 68.32;
    private double usDollarConvertedValue;
    private static double rupeeValue;

    public static double convertToUSDollar(double amount){
        return 0;
    }

    public static double getRate() {
        return rate;
    }

    public static double convertToIndianRupee(double usDollarValue){
        rupeeValue = usDollarValue * Rupee.getRate();
        return rupeeValue;
    }

}
