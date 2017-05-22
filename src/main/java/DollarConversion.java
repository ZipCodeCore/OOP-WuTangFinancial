/**
 * Created by jennifermcginty on 5/22/17.
 */
public class DollarConversion {

    public double dollarToEuros(double input){
        double finalConversion = input * .94;
        return finalConversion;
    }

    public double dollarToPounds(double input){
        double finalConversion = input * .82;
        return finalConversion;
    }

    public double dollarToRupee(double input){
        double finalConversion = input * 68.32;
        return finalConversion;
    }

    public double dollarsToAustralianDollar(double input){
        double finalConversion = input * 1.35;
        return finalConversion;
    }
}
