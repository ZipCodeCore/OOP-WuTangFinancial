/**
 * Created by rahmirford on 5/22/17.
 */
public class BritishPound {
    private static double rate = 0.82;
    private double usDollarConvertedValue;
    private double britishPoundValue;
    public static double convertToUSDollar(double amount){
        return 0;
    }

    public double getUsDollarConvertedValue() {
        return usDollarConvertedValue;
    }


    public static double getRate() {
        return rate;
    }

    public double convertToBritishPound(double usDollarValue){
        britishPoundValue = usDollarValue * BritishPound.getRate();
        return britishPoundValue;
    }
}
