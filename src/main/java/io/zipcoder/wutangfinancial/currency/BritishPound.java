package io.zipcoder.wutangfinancial.currency;

public class BritishPound extends Currency{

    public BritishPound(Double amount){
        this(amount, 0.82);
    }

    public BritishPound(Double amount, Double exchangeRateToUSD){
        super(amount, exchangeRateToUSD);
    }

}
