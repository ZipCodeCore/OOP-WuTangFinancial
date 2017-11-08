package io.zipcoder.wutangfinancial.currency;

import java.text.NumberFormat;
import java.util.Locale;

public class SwissFranc extends ZCWCurrency {

    public SwissFranc(Double amount){
        this(amount, 1.01);
    }

    public SwissFranc(Double amount, Double exchangeRateToUSD){
        super(amount, exchangeRateToUSD);
    }

    public String getLocalFormatAmount(){
        String formatted;

        NumberFormat swissFormat = NumberFormat.getCurrencyInstance(new Locale("sv","SE"));

        formatted=swissFormat.format(this.getAmount());

        return formatted;
    }

}
