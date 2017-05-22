

/**
 * Created by mollyarant on 5/22/17.
 */
public class ConversionToolToUSDollar {

    public  String convertEuroToUSDollar(double euros)throws IllegalArgumentException{
        if(euros<0){
            throw new IllegalArgumentException("You cannot convert money that you do not have! Provide an amount larger than zero.");
        }
        String result= String.format("%.2f", euros/.94);
        return result;
    }

    public String convertPoundToUSDollar(double pounds)throws IllegalArgumentException{
        if (pounds<0){
            throw new IllegalArgumentException("You cannot convert money that you do not have!  Provide an amount larger than 0");
        }
        String result= String.format("%.2f", pounds/.82);
        return result;
    }

    public String convertIndianRupeeToUSDollar(double rupees)throws IllegalArgumentException{
        if (rupees<0){
            throw new IllegalArgumentException("You cannot convert money that you do not have!  Provide an amount larger than 0");
        }
        String result= String.format("%.2f", rupees/68.32);
        return result;
    }

    public String convertAustralianDollarToUSDollar(double australianDollars) throws IllegalArgumentException{
        if(australianDollars<0){
            throw new IllegalArgumentException("You cannot convert money that you do not have! Provide an amount larger than 0");
        }
        String result= String.format("%.2f", australianDollars/1.35);
        return result;
    }

    public String convertCanadianDollarToUSDollar(double canadianDollars) throws IllegalArgumentException{
        if(canadianDollars<0){
            throw new IllegalArgumentException("You cannot convert money that you do not have! Provide an amount larger than 0");
        }
        String result= String.format("%.2f", canadianDollars/1.32);
        return result;
    }

    public String convertSingaporeDollarToUSDollar(double singaporeDollars)  throws IllegalArgumentException {
        if (singaporeDollars < 0) {
            throw new IllegalArgumentException("You cannot convert money that you do not have! Provide an amount larger than 0");
        }
        String result = String.format("%.2f", singaporeDollars / 1.43);
        return result;
    }

    public String convertSwissFrancToUSDollar(double swissFranc)  throws IllegalArgumentException {
        if (swissFranc < 0) {
            throw new IllegalArgumentException("You cannot convert money that you do not have! Provide an amount larger than 0");
        }
        String result = String.format("%.2f", swissFranc / 1.01);
        return result;
    }

    public String convertMalaysianRinggitToUSDollar(double ringgit) throws IllegalArgumentException {
        if (ringgit < 0) {
            throw new IllegalArgumentException("You cannot convert money that you do not have! Provide an amount larger than 0");
        }
        String result = String.format("%.2f",ringgit / 4.47);
        return result;
    }

    public String convertJapaneseYenToUSDollar(double yen) throws IllegalArgumentException {
        if (yen < 0) {
            throw new IllegalArgumentException("You cannot convert money that you do not have! Provide an amount larger than 0");
        }
        String result = String.format("%.2f",yen / 115.84);
        return result;
    }

    public String convertChineseYuanToUSDollar(double yuan) throws IllegalArgumentException {
        if (yuan < 0) {
            throw new IllegalArgumentException("You cannot convert money that you do not have! Provide an amount larger than 0");
        }
        String result = String.format("%.2f", yuan / 6.92);
        return result;
    }



}
