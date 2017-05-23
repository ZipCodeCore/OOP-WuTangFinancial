/**
 * Created by jennifermcginty on 5/22/17.
 */
public class EuroConversion {

    public double euroToBritishPound(double input){
        double finalConversion = input * .87;
        return finalConversion;
    }

    public double euroToAmericanDollars(double input){
        double finalConversion = input * .94;
        return finalConversion;
    }
}
