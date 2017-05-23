/**
 * Created by rahmirford on 5/22/17.
 */
public class Rupee {
    private static double rate = 68.32;

    private double rupeeValue;

    public double convertToUSDollar(){
        return 0;
    }

    public static double getRate() {
        return rate;
    }

    public double convertToIndianRupee(double usDollarValue){
        rupeeValue = usDollarValue * Rupee.getRate();
        return rupeeValue;
    }

    public static double convertToUSDollar(double loot) {
    }
}
