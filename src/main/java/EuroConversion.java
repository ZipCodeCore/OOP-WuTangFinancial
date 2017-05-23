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

    public double euroToRupee(double input){
        double finalConversion = input * 72.68;
        return finalConversion;
    }

    public double euroToAustralianDollar(double input){
        double finalConversion = input * 1.43;
        return finalConversion;
    }

    public double euroToCanadianDollar(double input){
        double finalConversion = input * 1.40;
        return finalConversion;
    }

    public double euroToSingaporeDollar(double input){
        double finalConversion = input * 1.52;
        return finalConversion;
    }

    public double euroToSwissFranc(double input){
        double finalConversion = input * 1.07;
        return finalConversion;
    }
}
