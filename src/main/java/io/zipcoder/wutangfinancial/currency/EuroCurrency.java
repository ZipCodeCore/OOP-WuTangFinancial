package io.zipcoder.wutangfinancial.currency;

public class EuroCurrency extends Currency {

//    private io.zipcoder.wutangfinancial.currency.UsDollar(){}

    public EuroCurrency(Double amount) {

        this(amount, .94);

    }

    public EuroCurrency(Double amount, Double exchangeRateToUSD) {
        super(amount, exchangeRateToUSD);
    }

}