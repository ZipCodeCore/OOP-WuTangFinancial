package io.zipcoder.wutangfinancial.currency;

import java.text.NumberFormat;
import java.util.Locale;

public class SingaporeDollar extends ZCWCurrency {

    public SingaporeDollar(Double amount){

        this(amount, 1.43);

    }

    public SingaporeDollar(Double amount, Double exchangeRateToUSD){
        super(amount, exchangeRateToUSD);
    }

    public String getLocalFormatAmount(){
        String formatted;

        NumberFormat singaporeFormat = NumberFormat.getCurrencyInstance(new Locale("en","SG"));

        formatted=singaporeFormat.format(this.getAmount());

        return formatted;
    }

}
