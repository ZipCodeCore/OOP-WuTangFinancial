package mozeik.gerrod;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by gerrodmozeik on 1/12/17.
 */
public class CurrencyConverter {
    Double relativeExchangeRate;
    Double inputMonetaryValue;
    BigDecimal bd = new BigDecimal(0);
    double roundedOutputValue = 0;

    public static double round(double value, int places) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public Double convertInputValueToOutputValue(Double relativeExchangeRate, Double inputMonetaryValue) {
        this.relativeExchangeRate = relativeExchangeRate;
        this.inputMonetaryValue = inputMonetaryValue;
        this.roundedOutputValue = round(relativeExchangeRate * inputMonetaryValue, 2);
        return roundedOutputValue;
    }
}
