package io.zipcoder.wutangfinancial.currency;

public class CanadianDollar extends Currency{

    public CanadianDollar(Double amount){
        this(amount, 1.32);
    }

    public CanadianDollar(Double amount, Double exchangeRateToUSD){
        super(amount, exchangeRateToUSD);
    }

}
