/**
 * Created by rahmirford on 5/22/17.
 */
public class SwissFranc {
    private static double rate = 1.01;
    private double usDollarConvertedValue;
    private double swissFrancValue;

    public double convertToUSDollar(){
        return 0;
    }

    public double getUsDollarConvertedValue() {
        return usDollarConvertedValue;
    }

    public static double getRate() {
        return rate;
    }
    public double convertToSwissFranc(double usDollarValue){
        swissFrancValue = usDollarValue * SwissFranc.getRate();
        return swissFrancValue;
    }
}
