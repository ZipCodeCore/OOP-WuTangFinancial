package mattern.william;

import java.math.BigDecimal;

/**
 * Created by williammattern on 1/12/17.
 */
public class CurrencyConverter {
    Double relativeExchangeRate;
    Double inputMonetaryValue;
    BigDecimal bd = new BigDecimal(0);
    double roundedOutputValue = 0;


    public static double round(double value, int places){
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, BigDecimal.ROUND_HALF_UP);
        return bd.doubleValue();
    }

    public double convertInputValueToOutputValue(Double relativeExchangeRate, Double inputMonetaryValue){
        this.relativeExchangeRate = relativeExchangeRate;
        this.inputMonetaryValue = inputMonetaryValue;
        this.roundedOutputValue = round(relativeExchangeRate*inputMonetaryValue,2);
        return roundedOutputValue;
    }





}
