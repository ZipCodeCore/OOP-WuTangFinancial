package io.zipcoder.wutangfinancial.currency;

public class AustralianDollar extends ZCWCurrency {

    public AustralianDollar(Double amount){
        this(amount, 1.35);
    }

    public AustralianDollar(Double amount, Double exchangeRateToUSD){
        super(amount, exchangeRateToUSD, "en", "AU");
    }
}
