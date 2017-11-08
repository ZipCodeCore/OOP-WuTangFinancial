package io.zipcoder.wutangfinancial.currency;

import java.text.NumberFormat;
import java.util.Locale;

public class AustralianDollar extends ZCWCurrency {

    public AustralianDollar(Double amount){
        this(amount, 1.35);
    }

    public AustralianDollar(Double amount, Double exchangeRateToUSD){
        super(amount, exchangeRateToUSD);
    }

    public String getLocalFormatAmount(){
        String formatted;

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(new Locale("en","AU"));

        formatted=usFormat.format(this.getAmount());

        return formatted;
    }

}
