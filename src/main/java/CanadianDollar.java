/**
 * Created by rahmirford on 5/22/17.
 */
public class CanadianDollar {
    private static double rate =1.32;
    private double usDollarConvertedValue;
    private static double canadianDollarValue;

    public static double convertToUSDollar(double amount){
        return 0;
    }

    public double getUsDollarConvertedValue() {
        return usDollarConvertedValue;
    }


    public static double getRate() {
        return rate;
    }

    public static double convertToCanadianDollar(double usDollarValue){
        canadianDollarValue = usDollarValue * CanadianDollar.getRate();
        return canadianDollarValue;
    }
}
