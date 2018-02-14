package com.zipcodewilmington.ExchangeRate;

public enum ExchangeRate {
    USD(1.00),
    GBP(0.82),
    EUR(0.94),
    INR(68.32),
    AUD(1.35),
    CAD(1.32),
    SGD(1.43),
    CHF(1.01),
    MYR(4.47),
    JPY(115.84),
    CNY(6.92);

    public double rate;

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    ExchangeRate(double rate) {
        this.rate = rate;
    }

    public double conversion (double beginningCurrencyAmount, ExchangeRate beginningCurrency, ExchangeRate endingCurrency){
        double fromExchangeRate = beginningCurrency.getRate(); //USD
        double toExchangeRate = endingCurrency.getRate(); //Euro
        double conversionRate = toExchangeRate/fromExchangeRate; //Euro/USD
        double convertedCurrency = conversionRate * beginningCurrencyAmount;

        return convertedCurrency;

    }




}
