import java.text.DecimalFormat;

public class CurrencyConverter {


    public double convertCurrency(double amount, ExchangeRates fromRate, ExchangeRates toRate) {
        double convertedAmount = amount * (toRate.getRate()/fromRate.getRate());
        return roundToDecimal(convertedAmount);
    }

    public double roundToDecimal(double value) {
        DecimalFormat df = new DecimalFormat("####.##");
        return Double.valueOf(df.format(value));
    }
}

