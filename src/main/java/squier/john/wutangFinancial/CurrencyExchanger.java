package squier.john.wutangFinancial;

import java.util.Scanner;
/**
 * This class converts currencies from one to another as long as both currencies are in
 * DollarExchangeRates
 * @author John Squier
 * @author github.com/jasquier
 * @version 1.0
 */
public class CurrencyExchanger {

    public Double convertCurrency(String inputCurrency, String outputCurrency, Double amountToConvert) {
        DollarExchangeRates rates = new DollarExchangeRates();

        Double inputRate = rates.getDollarExchangeRate(inputCurrency);
        Double outputRate = rates.getDollarExchangeRate(outputCurrency);

        Double outputAmount = amountToConvert * (1.00 / inputRate) * outputRate;

        // Truncate a double value to two decimal places
        return (Math.floor(outputAmount * 100) / 100);
    }
}
