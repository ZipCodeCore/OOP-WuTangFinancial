/**
 * Created by rahmirford on 5/22/17.
 */
public class AustralianDollar {
    private static double rate = 1.35;
    private double usDollarConvertedValue;
    private static double australianDollarValue;

    public static double convertToUSDollar(double amount){
        return 0;
    }

    public double getUsDollarConvertedValue() {
        return usDollarConvertedValue;
    }

    public static double getRate() {
        return rate;
    }

    public static double convertToAustralianDollar(double usDollarValue){
        australianDollarValue = (Math.round((usDollarValue * AustralianDollar.getRate()*100)));
        australianDollarValue = australianDollarValue/100;
        return australianDollarValue;
    }

}
