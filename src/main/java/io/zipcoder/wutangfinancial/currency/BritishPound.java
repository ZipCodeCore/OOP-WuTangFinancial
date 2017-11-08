package io.zipcoder.wutangfinancial.currency;

import java.text.NumberFormat;
import java.util.Locale;

public class BritishPound extends ZCWCurrency {

    public BritishPound(Double amount){
        this(amount, 0.82);
    }

    public BritishPound(Double amount, Double exchangeRateToUSD){
        super(amount, exchangeRateToUSD);
    }

    public String getLocalFormatAmount(){
        String formatted;

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(new Locale("en","GB"));

        formatted=usFormat.format(this.getAmount());

        return formatted;
    }

}
