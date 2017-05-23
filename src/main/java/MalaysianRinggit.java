/**
 * Created by rahmirford on 5/22/17.
 */
public class MalaysianRinggit {
    private static double rate = 4.47;
    private double usDollarConvertedValue;
    private double malaysianRinggitValue;
    public static double convertToUSDollar(double amount){
        return 0;
    }

    public double getUsDollarConvertedValue() {
        return usDollarConvertedValue;
    }


    public static double getRate() {
        return rate;
    }

    public double convertToMalaysianRinggit(double usDollarValue){
        malaysianRinggitValue = usDollarValue * MalaysianRinggit.getRate();
        return malaysianRinggitValue;
    }
}
