/**
 * Created by rahmirford on 5/22/17.
 */
public class Euro {
    private static double rate = 0.94;
    private double usDollarConvertedValue;
    public double euroValue;

    public double convertToUSDollar(){
        return 0;
    }

    public double getUsDollarConvertedValue() {
        return usDollarConvertedValue;
    }


    public static double getRate() {
        return rate;
    }

    public double convertToEuro(double usDollarValue){
        euroValue = usDollarValue * Euro.getRate();
        return euroValue;
    }

}
