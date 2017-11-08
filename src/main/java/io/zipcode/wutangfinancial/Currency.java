package io.zipcode.wutangfinancial;

import java.util.ArrayList;
import java.text.*;

public class Currency {
    private String name;
    private double rate;
    static ArrayList<Currency> currencyList = new ArrayList<>();
    static{
        currencyList.add(new Currency("USD",1.0));
        currencyList.add(new Currency("EURO", 0.94));
        currencyList.add(new Currency("POUNDS", 0.82));
        currencyList.add(new Currency("INDIAN RUPEE", 68.32));
        currencyList.add(new Currency("AUSTRALIAN DOLLAR", 1.35));
        currencyList.add(new Currency("CANADIAN DOLLAR", 1.32));
        currencyList.add(new Currency("SINGAPORE DOLLAR", 1.43));
        currencyList.add(new Currency("SWISS FRANC", 1.01));
        currencyList.add(new Currency("MALAYSIAN RINGGIT", 4.47));
        currencyList.add(new Currency("JAPANESE YEN", 115.84));
        currencyList.add(new Currency("CHINESE YUAN", 6.92));
    }

    public Currency(String name, double rate){
        this.name=name;
        this.rate=rate;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }
    public Currency(){

    }

    public double getTargetAmount(String baseCurrency, double baseAmount, String targetCurrency){
        double baseCurrRate=0;
        double targetCurrRate=0;
        for(Currency eachCurr:currencyList){
            if(baseCurrency.equalsIgnoreCase(eachCurr.getName()))
                baseCurrRate=eachCurr.getRate();
            if(targetCurrency.equalsIgnoreCase(eachCurr.getName()))
                targetCurrRate=eachCurr.getRate();
        }
        double targetAmount= baseAmount/baseCurrRate*targetCurrRate;
        DecimalFormat f = new DecimalFormat("##.00");
        return Double.parseDouble(f.format(targetAmount));
    }
}
