
/**
 * Created by mollyarant on 5/22/17.
 */
public class ConversionToolFromUSDollar {

    public  double convertDollarToEuro(double dollars)throws IllegalArgumentException{
        if(dollars<0){
            throw new IllegalArgumentException("You cannot convert money that you do not have! Provide an amount larger than zero.");
        }
        double result= dollars*0.94;
        return result;
    }

    public double convertDollarToPound(double dollars)throws IllegalArgumentException {
        if (dollars < 0) {
            throw new IllegalArgumentException("You cannot convert money that you do not have! Provide an amount larger than zero.");
        }
        double result = dollars * 0.82;
        return result;
    }

    public double convertDollarToIndianRupee(double dollars)throws IllegalArgumentException {
        if (dollars < 0) {
            throw new IllegalArgumentException("You cannot convert money that you do not have! Provide an amount larger than zero.");
        }
        double result = dollars * 68.32;
        return result;
    }

    public double convertDollarToAustralianDollar(double dollars)throws IllegalArgumentException {
        if (dollars < 0) {
            throw new IllegalArgumentException("You cannot convert money that you do not have! Provide an amount larger than zero.");
        }
        double result = dollars * 1.35;
        return result;
    }

    public double convertDollarToCanadianDollar(double dollars)throws IllegalArgumentException {
        if (dollars < 0) {
            throw new IllegalArgumentException("You cannot convert money that you do not have! Provide an amount larger than zero.");
        }
        double result = dollars * 1.32;
        return result;
    }

    public double convertDollarToSingaporeDollar(double dollars)throws IllegalArgumentException {
        if (dollars < 0) {
            throw new IllegalArgumentException("You cannot convert money that you do not have! Provide an amount larger than zero.");
        }
        double result = dollars * 1.43;
        return result;
    }

    public double convertDollarToSwissFranc(double dollars)throws IllegalArgumentException {
        if (dollars < 0) {
            throw new IllegalArgumentException("You cannot convert money that you do not have! Provide an amount larger than zero.");
        }
        double result = dollars * 1.01;
        return result;
    }

    public double convertDollarToMalaysianRinggit(double dollars)throws IllegalArgumentException {
        if (dollars < 0) {
            throw new IllegalArgumentException("You cannot convert money that you do not have! Provide an amount larger than zero.");
        }
        double result = dollars * 4.47;
        return result;
    }

    public double convertDollarToJapaneseYen(double dollars)throws IllegalArgumentException {
        if (dollars < 0) {
            throw new IllegalArgumentException("You cannot convert money that you do not have! Provide an amount larger than zero.");
        }
        double result = dollars * 115.84;
        return result;
    }
    public double convertDollarToChineseYuan(double dollars)throws IllegalArgumentException {
        if (dollars < 0) {
            throw new IllegalArgumentException("You cannot convert money that you do not have! Provide an amount larger than zero.");
        }
        double result = dollars * 6.92;
        return result;
    }







}
