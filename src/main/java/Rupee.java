/**
 * Created by rahmirford on 5/22/17.
 */
public class Rupee {
    private static double rate = 68.32;
    private double usDollarConvertedValue;
    private double rupeeValue;

    public double convertToUSDollar(){
        return 0;
    }

    public double getUsDollarConvertedValue() {
        return usDollarConvertedValue;
    }


    public static double getRate() {
        return rate;
    }

    public double convertToIndianRupee(double usDollarValue){
        rupeeValue = usDollarValue * Rupee.getRate();
        return rupeeValue;
    }

}
