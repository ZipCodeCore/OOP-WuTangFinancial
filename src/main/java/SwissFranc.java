/**
 * Created by rahmirford on 5/22/17.
 */
public class SwissFranc {
    private static double rate = 1.01;
    private double usDollarConvertedValue;
    private static double swissFrancValue;

    public static double convertToUSDollar(double amount){
        return 0;
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
