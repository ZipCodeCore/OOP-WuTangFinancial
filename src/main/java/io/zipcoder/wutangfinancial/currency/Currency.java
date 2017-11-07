package io.zipcoder.wutangfinancial.currency;

public abstract class Currency{

    private Double amount;
    private final Double exchRateToUSD;

    private Currency(){ //No default constructor allowed
        exchRateToUSD=0.0;
    }

    public Currency(Double amount, Double exchangeRateToUSD){
        this.amount=amount;
        this.exchRateToUSD=exchangeRateToUSD;
    }

    public void setAmount(Double amount){
        this.amount=amount;
    }

    public Double getAmount(){
        return amount;
    }

    public Currency convertToCurrency(Currency toCurrency){

        toCurrency.setAmount(amount/exchRateToUSD*toCurrency.exchRateToUSD);

        return toCurrency;
    }
}
