package io.zipcoder.wutangfinancial.currency;

public class ChineseYuan extends ZCWCurrency {

    public ChineseYuan(Double amount){
        this(amount, 6.92);
    }

    public ChineseYuan(Double amount, Double exchangeRateToUSD){

        super(amount, exchangeRateToUSD, "zh", "CN");
    }
}
