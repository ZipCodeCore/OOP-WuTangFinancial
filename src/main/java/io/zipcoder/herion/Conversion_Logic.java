package io.zipcoder.herion;

public class Conversion_Logic {

    public double exchange(int initialCurrency, int targetCurrency) {

        Currency_Rate currency_rate = Currency_Rate.values()[initialCurrency];
        double initialCurrencyRate = currency_rate.getDollarStandard();

        Currency_Rate currency_rate2 = Currency_Rate.values()[targetCurrency];
        double targetCurrencyRate = currency_rate2.getDollarStandard();

        Currency_Rate currency_rate3 = Currency_Rate.values()[0];
        return initialCurrencyRate / currency_rate3.getDollarStandard() * targetCurrencyRate;

    }

}



