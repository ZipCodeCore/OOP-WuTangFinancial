/**
 * Created by rahmirford on 5/22/17.
 */
public class AustralianDollar {
    private static double rate = 1.35;
    private double usDollarConvertedValue;
    private double australianDollarValue;

    public double convertToUSDollar(){
        return 0;
    }

    public double getUsDollarConvertedValue() {
        return usDollarConvertedValue;
    }

    public static double getRate() {
        return rate;
    }

    public double convertToAustralianDollar(double usDollaValue){
        australianDollarValue = usDollaValue * AustralianDollar.getRate();
        return australianDollarValue;
    }

}
