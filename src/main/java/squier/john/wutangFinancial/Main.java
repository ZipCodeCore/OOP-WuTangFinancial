package squier.john.wutangFinancial;

/**
 * Created by johnsquier on 1/12/17.
 */
public class Main {

    public static void main(String[] args) {
        CurrencyInputOutput cio = new CurrencyInputOutput();
        CurrencyExchanger ce = new CurrencyExchanger();

        String inputCurrency = cio.promptForInputCurrency();
        String outputCurrency = cio.promptForOutputCurrency();
        Double amountToConvert = cio.promptForAmountToConvert();

        cio.displayResults(inputCurrency, outputCurrency, amountToConvert,
                ce.convertCurrency(inputCurrency, outputCurrency, amountToConvert));
    }
}
