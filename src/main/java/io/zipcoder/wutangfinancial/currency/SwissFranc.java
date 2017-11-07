package io.zipcoder.wutangfinancial.currency;

public class SwissFranc extends Currency{

    public SwissFranc(Double amount){
        this(amount, 1.01);
    }

    public SwissFranc(Double amount, Double exchangeRateToUSD){
        super(amount, exchangeRateToUSD);
    }
}
