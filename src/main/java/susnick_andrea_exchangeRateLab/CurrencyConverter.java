package susnick_andrea_exchangeRateLab;

public class CurrencyConverter {

    public double currencyConversionCalculator(double currencyAmountToExchange, Currency fromCurrency, Currency toCurrency){

        double fromRate = fromCurrency.getExchangeRate();
        double toRate = toCurrency.getExchangeRate();

        double newCurrencyAmount = Math.round ((currencyAmountToExchange * toRate / fromRate) * 100.00) / 100.00;

        return newCurrencyAmount;
    }
}
