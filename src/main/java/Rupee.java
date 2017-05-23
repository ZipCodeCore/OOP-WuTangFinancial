/**
 * Created by rahmirford on 5/22/17.
 */
public class Rupee {
    private static double rate = 68.32;
    private static double usDollarConvertedValue;
    private static double rupeeValue;

    public static double convertToUSDollar(double amount) {
        usDollarConvertedValue = Math.round(amount / Rupee.getRate() * 100.0);
        usDollarConvertedValue = usDollarConvertedValue / 100;
        return usDollarConvertedValue;
    }

    public static double getRate() {
        return rate;
    }

    public static double convertToIndianRupee(double usDollarValue){
        rupeeValue = usDollarValue * Rupee.getRate();
        return rupeeValue;
    }

}
