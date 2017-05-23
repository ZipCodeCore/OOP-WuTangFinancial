/**
 * Created by rahmirford on 5/22/17.
 */
public class SingaporeDollar {
    private static double rate = 1.43;
    private double usDollarConvertedValue;
    private double singaporeDollarValue;

    public double convertToUSDollar(){
        return 0;
    }

    public double getUsDollarConvertedValue() {
        return usDollarConvertedValue;
    }

    public static double getRate() {
        return rate;
    }
    public double convertToSingaporeDollar(double usDollarValue){
        singaporeDollarValue = usDollarValue * SingaporeDollar.getRate();
        return singaporeDollarValue;
    }

}
