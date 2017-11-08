package io.zipcoder.wutangfinancial.currency;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class ZCWCurrency {

    private Double amount;
    private final Double exchRateToUSD;
    private final String language;
    private final String country;

    private ZCWCurrency(){ //No default constructor allowed

        exchRateToUSD=0.0;
        language="";
        country="";
    }

    public ZCWCurrency(Double amount, Double exchangeRateToUSD, String language, String country){
        this.amount=amount;
        this.exchRateToUSD=exchangeRateToUSD;
        this.language=language;
        this.country=country;
    }

    public void setAmount(Double amount){
        this.amount=amount;
    }

    public Double getAmount(){
        return amount;
    }

    public ZCWCurrency convertToCurrency(ZCWCurrency toZCWCurrency){
        toZCWCurrency.setAmount(amount/exchRateToUSD* toZCWCurrency.exchRateToUSD);
        return toZCWCurrency;
    }

    public String getLocalFormatAmount(){
        String formatted;

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(new Locale(language,country));

        formatted=usFormat.format(this.getAmount());

        return formatted;
    }
}
