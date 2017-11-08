package io.zipcode.WuTangFinancial;

import java.util.ArrayList;

public class Currency {
    private String name;
    private double rate;
    static ArrayList<Currency> currencyArrayList= new ArrayList<Currency>();
    public Currency(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }
    public Currency(){

    }
    public String getName() {
        return name;
    }

    public double getRate() {

        return rate;
    }
    static {
        currencyArrayList.add(new Currency("USD",1.00));
        currencyArrayList.add(new Currency("BRITISH POUND",0.82));
        currencyArrayList.add(new Currency("INDIAN RUPEE",68.32));
        currencyArrayList.add(new Currency("AUSTRALIAN DOLLAR",1.35));
        currencyArrayList.add(new Currency("CANADIAN DOLLAR",1.32));
        currencyArrayList.add(new Currency("SINGAPORE DOLLAR",1.43));
        currencyArrayList.add(new Currency("SWISS FRANC",1.01));
        currencyArrayList.add(new Currency("MALAYSIAN RINGGIT",4.47));
        currencyArrayList.add(new Currency("JAPANESE YEN",115.84));
        currencyArrayList.add(new Currency("CHINESE YUAN RENMINBI",6.92));
//        Currency.add("EURO",0.94);
//        Currency.add("BRITISH POUND",0.82);
//        Currency.add("INDIAN RUPEE",68.32);
//        Currency.add("AUSTRALIAN DOLLAR",1.35);
//        Currency.add("CANADIAN DOLLAR",1.32);
//        Currency.add("SINGAPORE DOLLAR",1.43);
//        Currency.add("SWISS FRANC",1.01);
//        Currency.add("MALAYSIAN RINGGIT",4.47);
//        Currency.add("JAPANESE YEN",115.84);
//        Currency.add("CHINESE YUAN RENMINBI",6.92);

    }
    public double toExchangeMoney(double sourceAmount,String baseCurrency,String targetCurrency){
        double baseCurrencyRate= 1.00 ;
        double targetCurrencyRate = 1.00;
        for (Currency i: currencyArrayList) {
            if(i.getName().equalsIgnoreCase(baseCurrency))
                baseCurrencyRate = i.rate;
            if(i.getName().equalsIgnoreCase(targetCurrency))
                targetCurrencyRate = i.rate;
        }
        double inDollar = Math.round(sourceAmount/baseCurrencyRate);
        double targetAmount = inDollar*targetCurrencyRate;
        return targetAmount;
    }
//       public static void add(String name, double rate) {
//        currencyArrayList.add(new Currency(name, rate));
//    }
}
