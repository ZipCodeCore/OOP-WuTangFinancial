package io.zipcoder.wutangfinancial.currency;

public class JapaneseYen extends ZCWCurrency {

    public JapaneseYen(Double amount){
        this(amount, 115.84);
    }

    public JapaneseYen(Double amount, Double exchangeRateToUSD){

        super(amount, exchangeRateToUSD, "ja", "JP");
    }
}
