package io.zipcoder.wutangfinancial.currency;

import java.text.NumberFormat;
import java.util.Locale;

public class ChineseYuan extends ZCWCurrency {

    public ChineseYuan(Double amount){
        this(amount, 6.92);
    }

    public ChineseYuan(Double amount, Double exchangeRateToUSD){
        super(amount, exchangeRateToUSD);
    }

    public String getLocalFormatAmount(){
        String formatted;

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(new Locale("zh","CN"));

        formatted=usFormat.format(this.getAmount());

        return formatted;
    }

}
