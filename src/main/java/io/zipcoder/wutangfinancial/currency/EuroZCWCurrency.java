package io.zipcoder.wutangfinancial.currency;

public class EuroZCWCurrency extends ZCWCurrency {

    public EuroZCWCurrency(Double amount) {

        this(amount, .94);

    }

    public EuroZCWCurrency(Double amount, Double exchangeRateToUSD) {

        super(amount, exchangeRateToUSD, "en", "MT");
    }
}