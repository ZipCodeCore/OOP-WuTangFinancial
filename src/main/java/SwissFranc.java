/**
 * Created by rahmirford on 5/22/17.
 */
public class SwissFranc {
    private static double rate = 1.01;
    private static double usDollarConvertedValue;
    private static double swissFrancValue;

    public static double convertToUSDollar(double amount){
        usDollarConvertedValue = Math.round( amount / SwissFranc.getRate()*100.0);
        usDollarConvertedValue = usDollarConvertedValue/100;
        return usDollarConvertedValue;
    }

    public double getUsDollarConvertedValue() {
        return usDollarConvertedValue;
    }

    public static double getRate() {
        return rate;
    }
    public static double convertToSwissFranc(double usDollarValue){
        swissFrancValue = Math.round((usDollarValue * SwissFranc.getRate()*100));
        swissFrancValue = swissFrancValue/100;
        return swissFrancValue;
    }
}
