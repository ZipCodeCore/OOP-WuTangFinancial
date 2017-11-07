package io.zipcoder.wutangfinancial.currency;

public class MalaysianRinggit extends ZCWCurrency {

    public MalaysianRinggit(Double amount){
        this(amount, 4.47);
    }

    public MalaysianRinggit(Double amount, Double exchangeRateToUSD){
        super(amount, exchangeRateToUSD);
    }

}
