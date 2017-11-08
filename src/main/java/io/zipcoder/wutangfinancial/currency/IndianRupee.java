package io.zipcoder.wutangfinancial.currency;

import java.text.NumberFormat;
import java.util.Locale;

public class IndianRupee extends ZCWCurrency {

    public IndianRupee(Double amount){
        this(amount, 68.32);
    }

    public IndianRupee(Double amount, Double exchangeRateToUSD){
        super(amount, exchangeRateToUSD);
    }

    public String getLocalFormatAmount(){
        String formatted;

        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en","IN"));

        formatted=indiaFormat.format(this.getAmount());

        return formatted;
    }

}
