
/**
 * Created by mollyarant on 5/22/17.
 */
public class ConversionToolFromUSDollar {

    public  String convertDollarToEuro(double dollars)throws IllegalArgumentException{
        if(dollars<0){
            throw new IllegalArgumentException("You cannot convert money that you do not have! Provide an amount larger than zero.");
        }
        String result= String.format("%.2f", dollars*0.94);
        return result;
    }

    public String convertDollarToPound(double dollars)throws IllegalArgumentException {
        if (dollars < 0) {
            throw new IllegalArgumentException("You cannot convert money that you do not have! Provide an amount larger than zero.");
        }
        String result = String.format("%.2f", dollars * 0.82);
        return result;
    }



}
