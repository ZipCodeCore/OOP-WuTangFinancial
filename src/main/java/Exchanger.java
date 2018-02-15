import java.util.Scanner;
import java.util.TreeMap;

public class Exchanger {

    protected double convertToDollarsRate;
    protected double convertFromDollarsRate;
    protected double initialValue;
    protected double finalValue;


    public Exchanger () {

    }


    public void setInitialValueToBeConverted (double value) {
        initialValue = value;

    }

    public void setStartingCurrencyRate (String ccy) {
        convertToDollarsRate = Table.fxTable.get(ccy);
    }

    public void setSecondExchangeRate (String ccy) {
        convertFromDollarsRate = Table.fxTable.get(ccy);
    }


    public double convertCurrency () {
       finalValue = ( initialValue / convertToDollarsRate ) * convertFromDollarsRate;

        return finalValue;
    }



    public static void main(String[] args) {



    }

}
