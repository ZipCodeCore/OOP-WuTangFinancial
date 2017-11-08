package io.zipcoder.cheema;

public class Converter {

    public double exchange(int initialCurrency, int targetCurrency) {

        CurrencyRate currency_rate = CurrencyRate.values()[initialCurrency];
        double initialCurrencyRate = currency_rate.getDollarStandard();

        CurrencyRate currency_rate2 = CurrencyRate.values()[targetCurrency];
        double targetCurrencyRate = currency_rate2.getDollarStandard();

        CurrencyRate currency_rate3 = CurrencyRate.values()[0];
        return initialCurrencyRate / currency_rate3.getDollarStandard() * targetCurrencyRate;

    }

}
