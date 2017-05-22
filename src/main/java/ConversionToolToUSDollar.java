

/**
 * Created by mollyarant on 5/22/17.
 */
public class ConversionToolToUSDollar {

    public  double convertEuroToUSDollar(double euros)throws IllegalArgumentException{
        if(euros<0){
            throw new IllegalArgumentException("You cannot convert money that you do not have! Provide an amount larger than zero.");
        }
        double result= euros/.94;
        return result;
    }

    public double convertPoundToUSDollar(double pounds)throws IllegalArgumentException{
        if (pounds<0){
            throw new IllegalArgumentException("You cannot convert money that you do not have!  Provide an amount larger than 0");
        }
        double result= pounds/.82;
        return result;
    }

    public double convertIndianRupeeToUSDollar(double rupees)throws IllegalArgumentException{
        if (rupees<0){
            throw new IllegalArgumentException("You cannot convert money that you do not have!  Provide an amount larger than 0");
        }
       double result= rupees/68.32;
        return result;
    }

    public double convertAustralianDollarToUSDollar(double australianDollars) throws IllegalArgumentException{
        if(australianDollars<0){
            throw new IllegalArgumentException("You cannot convert money that you do not have! Provide an amount larger than 0");
        }
        double result= australianDollars/1.35;
        return result;
    }

    public double convertCanadianDollarToUSDollar(double canadianDollars) throws IllegalArgumentException{
        if(canadianDollars<0){
            throw new IllegalArgumentException("You cannot convert money that you do not have! Provide an amount larger than 0");
        }
        double result= canadianDollars/1.32;
        return result;
    }

    public double convertSingaporeDollarToUSDollar(double singaporeDollars)  throws IllegalArgumentException {
        if (singaporeDollars < 0) {
            throw new IllegalArgumentException("You cannot convert money that you do not have! Provide an amount larger than 0");
        }
        double result = singaporeDollars / 1.43;
        return result;
    }

    public double convertSwissFrancToUSDollar(double swissFranc)  throws IllegalArgumentException {
        if (swissFranc < 0) {
            throw new IllegalArgumentException("You cannot convert money that you do not have! Provide an amount larger than 0");
        }
        double result = swissFranc / 1.01;
        return result;
    }

    public double convertMalaysianRinggitToUSDollar(double ringgit) throws IllegalArgumentException {
        if (ringgit < 0) {
            throw new IllegalArgumentException("You cannot convert money that you do not have! Provide an amount larger than 0");
        }
        double result = ringgit / 4.47;
        return result;
    }

    public double convertJapaneseYenToUSDollar(double yen) throws IllegalArgumentException {
        if (yen < 0) {
            throw new IllegalArgumentException("You cannot convert money that you do not have! Provide an amount larger than 0");
        }
        double result = yen / 115.84;
        return result;
    }

    public double convertChineseYuanToUSDollar(double yuan) throws IllegalArgumentException {
        if (yuan < 0) {
            throw new IllegalArgumentException("You cannot convert money that you do not have! Provide an amount larger than 0");
        }
        double result =  yuan / 6.92;
        return result;
    }



}
