package io.zipcoder.wutangfinancial.currency;

public class UsDollar extends Currency{

    public UsDollar(Double amount){

        this(amount, 1.00);

    }

    public UsDollar(Double amount, Double exchangeRateToUSD){
        super(amount, exchangeRateToUSD);
    }


}
