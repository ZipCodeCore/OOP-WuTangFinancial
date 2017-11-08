package io.zipcoder.wutangfinancial.currency;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class EuroZCWCurrency extends ZCWCurrency {

//    private io.zipcoder.wutangfinancial.currency.UsDollar(){}

    public EuroZCWCurrency(Double amount) {

        this(amount, .94);

    }

    public EuroZCWCurrency(Double amount, Double exchangeRateToUSD) {
        super(amount, exchangeRateToUSD);
    }

    public String getLocalFormatAmount(){
        String formatted;

        Currency euro = Currency.getInstance("EUR");
        NumberFormat euroFormat = NumberFormat.getCurrencyInstance();

        euroFormat.setCurrency(euro);

        formatted=euroFormat.format(this.getAmount());

        return formatted;
    }


}