/**
 * Created by rahmirford on 5/22/17.
 */
public class Euro {
    private static double rate = 0.94;
    private static double usDollarConvertedValue;
    public static double euroValue;

    public static double convertToUSDollar(double amount){
        usDollarConvertedValue = Math.round(amount * Euro.getRate()*100);
        usDollarConvertedValue = usDollarConvertedValue/100;
        return usDollarConvertedValue;
    }

    public double getUsDollarConvertedValue() {
        return usDollarConvertedValue;
    }


    public static double getRate() {
        return rate;
    }

    public static double convertToEuro(double usDollarValue){
        euroValue = Math.round((usDollarValue * Euro.getRate()*100));
        euroValue = euroValue/100;
        return euroValue;
    }

}
