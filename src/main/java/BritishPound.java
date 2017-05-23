/**
 * Created by rahmirford on 5/22/17.
 */
public class BritishPound {
    private static double rate = 0.82;
    private static double usDollarConvertedValue;
    private static double britishPoundValue;
    public static double convertToUSDollar(double amount){
        usDollarConvertedValue = Math.round(amount / BritishPound.getRate()*100);
        usDollarConvertedValue = usDollarConvertedValue/100;
        return usDollarConvertedValue;
    }

    public double getUsDollarConvertedValue() {
        return usDollarConvertedValue;
    }


    public static double getRate() {
        return rate;
    }

    public static double convertToBritishPound(double usDollarValue){
        britishPoundValue = Math.round((usDollarValue * BritishPound.getRate()*100.0));
        britishPoundValue = britishPoundValue/100;
        return britishPoundValue;
    }
}
