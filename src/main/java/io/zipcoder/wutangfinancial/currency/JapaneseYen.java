package io.zipcoder.wutangfinancial.currency;

import java.text.NumberFormat;
import java.util.Locale;

public class JapaneseYen extends ZCWCurrency {

    public JapaneseYen(Double amount){
        this(amount, 115.84);
    }

    public JapaneseYen(Double amount, Double exchangeRateToUSD){
        super(amount, exchangeRateToUSD);
    }

    public String getLocalFormatAmount(){
        String formatted;

        NumberFormat japanFormat = NumberFormat.getCurrencyInstance(new Locale("ja","JP"));

        formatted=japanFormat.format(this.getAmount());

        return formatted;
    }

}
