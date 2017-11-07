package io.zipcoder.wutangfinancial.currency;

public class ChineseYuan extends Currency{

    public ChineseYuan(Double amount){
        this(amount, 6.92);
    }

    public ChineseYuan(Double amount, Double exchangeRateToUSD){
        super(amount, exchangeRateToUSD);
    }


}
