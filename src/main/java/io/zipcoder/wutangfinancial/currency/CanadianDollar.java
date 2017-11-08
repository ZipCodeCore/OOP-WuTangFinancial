package io.zipcoder.wutangfinancial.currency;

import java.text.NumberFormat;
import java.util.Locale;

public class CanadianDollar extends ZCWCurrency {

    public CanadianDollar(Double amount){
        this(amount, 1.32);
    }

    public CanadianDollar(Double amount, Double exchangeRateToUSD){
        super(amount, exchangeRateToUSD);
    }

    public String getLocalFormatAmount(){
        String formatted;

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(new Locale("en","CA"));

        formatted=usFormat.format(this.getAmount());

        return formatted;
    }

}
