package mozeik.gerrod;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by gerrodmozeik on 1/12/17.
 * This class takes relativeExchangeRate and inputMonetaryValue from Prompter and passes it to
 */
public class CurrencyConverter {
    double relativeExchangeRate;
    double inputMonetaryValue;
    double roundedOutputValue = 0;


    public Double convertInputValueToOutputValue(Double relativeExchangeRate, Double inputMonetaryValue) {
        CurrencyRounder currencyRounder = new CurrencyRounder();
        this.relativeExchangeRate = relativeExchangeRate;
        this.inputMonetaryValue = inputMonetaryValue;
        this.roundedOutputValue = currencyRounder.round(relativeExchangeRate * inputMonetaryValue, 2);
        return roundedOutputValue;
    }
}
