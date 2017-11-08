package io.zipcoder.wutangfinancial.currency;

import java.text.NumberFormat;
import java.util.Locale;

public class EuroZCWCurrency extends ZCWCurrency {

    public EuroZCWCurrency(Double amount) {

        this(amount, .94);

    }

    public EuroZCWCurrency(Double amount, Double exchangeRateToUSD) {
        super(amount, exchangeRateToUSD);
    }

    public String getLocalFormatAmount(){
        String formatted;

        NumberFormat euroFormat = NumberFormat.getCurrencyInstance(new Locale("en", "MT"));
            //Locale used is English-speaking Malta to force display of Euro as desired
        formatted=euroFormat.format(this.getAmount());

        return formatted;
    }


}