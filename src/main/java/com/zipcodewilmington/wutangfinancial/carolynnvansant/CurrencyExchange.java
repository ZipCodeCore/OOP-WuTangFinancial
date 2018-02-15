package com.zipcodewilmington.wutangfinancial.carolynnvansant;

public class CurrencyExchange {
//exchange rate table is computed in dollar to __

    private Double money;

    public static final Double US_DOLLAR = 1.00;
    public static final Double EURO = 0.94;
    public static final Double BRITISH_POUND = 0.82;
    public static final Double INDIAN_RUPEE = 68.32;
    public static final Double AUSTRALIAN_DOLLAR = 1.35;
    public static final Double CANADIAN_DOLLAR = 1.32;
    public static final Double SINGAPORE_DOLLAR = 1.43;
    public static final Double SWISS_FRANK = 1.01;
    public static final Double MALAYSIAN_RINGGIT = 4.47;
    public static final Double JAPANESE_YEN = 115.84;
    public static final Double CHINESE_YUAN_RENMINBI = 6.92;

    public CurrencyExchange(){
        this.money = money;
    }


    public static Double currencyRateConversion(Double firstRate, Double secondRate, Double money) {
        Double conversion = (1 / firstRate)*secondRate;
        Double currencyLast = Math.round(money * conversion * 100d)/100d;
        return currencyLast;
    }



}

