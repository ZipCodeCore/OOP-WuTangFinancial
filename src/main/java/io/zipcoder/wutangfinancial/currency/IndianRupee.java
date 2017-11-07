package io.zipcoder.wutangfinancial.currency;

public class IndianRupee extends ZCWCurrency {

    public IndianRupee(Double amount){
        this(amount, 68.32);
    }

    public IndianRupee(Double amount, Double exchangeRateToUSD){
        super(amount, exchangeRateToUSD);
    }

}
