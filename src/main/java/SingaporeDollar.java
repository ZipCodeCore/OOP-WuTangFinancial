/**
 * Created by rahmirford on 5/22/17.
 */
public class SingaporeDollar {
    private static double rate = 1.43;
    private static double usDollarConvertedValue;
    private static double singaporeDollarValue;


    public double getUsDollarConvertedValue() {
        return usDollarConvertedValue;
    }

    public static double getRate() {
        return rate;
    }

    public static double convertToUSDollar(double amount){
            usDollarConvertedValue = Math.round( amount / SingaporeDollar.getRate()*100.0);
            usDollarConvertedValue = usDollarConvertedValue/100;
            return usDollarConvertedValue;
        }

    public static double convertToSingaporeDollar(double usDollarValue){
        singaporeDollarValue = Math.round((usDollarValue * SingaporeDollar.getRate()*100));
        singaporeDollarValue = singaporeDollarValue/100;
        return singaporeDollarValue;
    }

}
