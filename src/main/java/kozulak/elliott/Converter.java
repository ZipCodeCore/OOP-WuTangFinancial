package kozulak.elliott;

public class Converter {

    public static Double convertCurrency(String fromCurrency, String toCurrency, Double amount) {
        CurrencyLoader currencyLoader = new CurrencyLoader();
        double fromRate =currencyLoader.currencyMap().get(fromCurrency);
        double toRate =currencyLoader.currencyMap().get(toCurrency);
        return (toRate/fromRate)*amount;
    }
}
