/**
 * Created by rahmirford on 5/22/17.
 */
public class CanadianDollar {
    private static double rate =1.32;
    private static double usDollarConvertedValue;
    private static double canadianDollarValue;

    public static double convertToUSDollar(double amount){
        usDollarConvertedValue = Math.round( amount / CanadianDollar.getRate()*100.0);
        usDollarConvertedValue = usDollarConvertedValue/100;
        return usDollarConvertedValue;
    }

    public double getUsDollarConvertedValue() {
        return usDollarConvertedValue;
    }


    public static double getRate() {
        return rate;
    }

    public static double convertToCanadianDollar(double usDollarValue){
        canadianDollarValue = Math.round((usDollarValue * CanadianDollar.getRate()*100));
        canadianDollarValue = canadianDollarValue/100;
        return canadianDollarValue;
    }
}
