package mattern.william;

/**
 * Created by williammattern on 1/12/17.
 */
public class CurrencyConverter {
    double relativeExchangeRate;
    double inputMonetaryValue;
    double roundedOutputValue = 0;


    public double convertInputValueToOutputValue(Double relativeExchangeRate, Double inputMonetaryValue){
        CurrencyRounder currencyRounder = new CurrencyRounder();
        this.relativeExchangeRate = relativeExchangeRate;
        this.inputMonetaryValue = inputMonetaryValue;
        this.roundedOutputValue = currencyRounder.round(relativeExchangeRate*inputMonetaryValue,2);
        return roundedOutputValue;
    }





}
