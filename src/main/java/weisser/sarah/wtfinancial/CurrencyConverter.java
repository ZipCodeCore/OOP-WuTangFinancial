package weisser.sarah.wtfinancial;

/**
 * Created by sarahweisser on 5/22/17.
 */
public class CurrencyConverter {
    private Currency convertFrom;
    private Currency convertTo;
    private double amountToConvert;
    private double amountAfterConversion;
    private double amountInUSDollars;



    public CurrencyConverter (Currency convertFrom, Currency convertTo, double amount) {
        this.convertFrom = convertFrom;
        this.convertTo = convertTo;
        this.amountToConvert = amount * 100;
    }

    public double convertToUSDollars () {
        amountInUSDollars = (amountToConvert / convertFrom.getRate());

        return amountInUSDollars;
    }

    public String convertCurrency () {
        convertToUSDollars();
        amountAfterConversion = (amountInUSDollars * convertTo.getRate()) / 100;
        return String.format("%.2f", amountAfterConversion);
    }

}
