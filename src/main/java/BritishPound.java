/**
 * Created by jennifermcginty on 5/22/17.
 */
public class BritishPound {

    public double britishPoundToEuro(double input){
        double finalConversion = input * 1.14;
        return finalConversion;
    }

    public double britishPoundToRupee(double input){
        double finalConversion = input * 141.26;
        return finalConversion;
    }

    public double britishPoundToAmericanDollar(double input){
        double finalConversion = input * .82;
        return finalConversion;
    }

    public double britishPoundToAustralianDollar(double input){
        double finalConversion = input * 1.64;
        return finalConversion;
    }

}

