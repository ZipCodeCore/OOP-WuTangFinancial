package io.zipcoder.wutangfinancial.currency;

import java.text.NumberFormat;
import java.util.Locale;

public class UsDollar extends ZCWCurrency {

    public UsDollar(Double amount){

        this(amount, 1.00);

    }

    public UsDollar(Double amount, Double exchangeRateToUSD){
        super(amount, exchangeRateToUSD);
    }

    public String getLocalFormatAmount(){
        String formatted;

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(new Locale("en","US"));

        formatted=usFormat.format(this.getAmount());

        return formatted;
    }


}
