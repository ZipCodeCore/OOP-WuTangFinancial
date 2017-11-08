package io.zipcoder.wutangfinancial.currency;

public abstract class ZCWCurrency {

    private Double amount;
    private final Double exchRateToUSD;

    private ZCWCurrency(){ //No default constructor allowed
        exchRateToUSD=0.0;
    }

    public ZCWCurrency(Double amount, Double exchangeRateToUSD){
        this.amount=amount;
        this.exchRateToUSD=exchangeRateToUSD;
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

    public abstract String getLocalFormatAmount();
}
