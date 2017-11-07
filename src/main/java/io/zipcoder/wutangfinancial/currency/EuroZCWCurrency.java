package io.zipcoder.wutangfinancial.currency;

public class EuroZCWCurrency extends ZCWCurrency {

//    private io.zipcoder.wutangfinancial.currency.UsDollar(){}

    public EuroZCWCurrency(Double amount) {

        this(amount, .94);

    }

    public EuroZCWCurrency(Double amount, Double exchangeRateToUSD) {
        super(amount, exchangeRateToUSD);
    }

}