package io.zipcoder.wutangfinancial.currency;

import java.text.NumberFormat;
import java.util.Locale;

public class MalaysianRinggit extends ZCWCurrency {

    public MalaysianRinggit(Double amount){
        this(amount, 4.47);
    }

    public MalaysianRinggit(Double amount, Double exchangeRateToUSD){
        super(amount, exchangeRateToUSD);
    }

    public String getLocalFormatAmount(){
        String formatted;

        NumberFormat malaysianFormat = NumberFormat.getCurrencyInstance(new Locale("ms","MY"));

        formatted=malaysianFormat.format(this.getAmount());

        return formatted;
    }

}
