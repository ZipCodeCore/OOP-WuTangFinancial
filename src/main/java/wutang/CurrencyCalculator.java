package wutang;

public class CurrencyCalculator {

    public static Double convert(Double moneyInput, ExchangeRates currentCurrency, ExchangeRates newCurrency){
        Double newTotal;
        newTotal = moneyInput / currentCurrency.getRate() * newCurrency.getRate();
        return newTotal;

    }
}
