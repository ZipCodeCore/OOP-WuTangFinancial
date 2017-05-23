/**
 * Created by rahmirford on 5/22/17.
 */
public class MalaysianRinggit {
    private static double rate = 4.47;
    private static double usDollarConvertedValue;
    private static double malaysianRinggitValue;

    public static double convertToUSDollar(double amount){
        usDollarConvertedValue = Math.round( amount / MalaysianRinggit.getRate()*100.0);
        usDollarConvertedValue = usDollarConvertedValue/100;
        return usDollarConvertedValue;
    }

    public double getUsDollarConvertedValue() {
        return usDollarConvertedValue;
    }


    public static double getRate() {
        return rate;
    }

    public static double convertToMalaysianRinggit(double usDollarValue){
        malaysianRinggitValue = Math.round((usDollarValue * MalaysianRinggit.getRate()*100));
        malaysianRinggitValue = malaysianRinggitValue/100;
        return malaysianRinggitValue;
    }
}
