/**
 * Created by rahmirford on 5/22/17.
 */
public class AustralianDollar {
    private static double rate = 1.35;
    private static double usDollarConvertedValue;
    private static double australianDollarValue;

    public double getUsDollarConvertedValue() {
        return usDollarConvertedValue;
    }

    public static double getRate() {
        return rate;
    }

    public static double convertToUSDollar(double amount) {
        usDollarConvertedValue = Math.round(amount / AustralianDollar.getRate() * 100.0);
        usDollarConvertedValue = usDollarConvertedValue / 100;
        return usDollarConvertedValue;
    }

    public static double convertToAustralianDollar(double usDollarValue){
        australianDollarValue = (Math.round((usDollarValue * AustralianDollar.getRate()*100)));
        australianDollarValue = australianDollarValue/100;
        return australianDollarValue;
    }

}
