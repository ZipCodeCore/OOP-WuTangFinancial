package kozulak.elliott;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class CurrencyLoader {
    private  ArrayList <Currency> currencies=new ArrayList<Currency>();

    public CurrencyLoader(){
        currencies.add(new Currency("USD", 1.00));
        currencies.add(new Currency("EUR", 0.94));
        currencies.add(new Currency("CAD", 1.32));
        currencies.add(new Currency("AUD", 1.35));
        currencies.add(new Currency("CHF", 1.01));
        currencies.add(new Currency("CNY", 6.92));
        currencies.add(new Currency("GBP", 0.82));
        currencies.add(new Currency("INR", 68.32));
        currencies.add(new Currency("JPY", 115.84));
        currencies.add(new Currency("MYR", 4.47));
        currencies.add(new Currency("SGD", 1.43));
    }

     public  Map<String, Double> currencyMap(){
        return currencies.stream().collect(Collectors.toMap(Currency::getAbbreviation, Currency::getConversionRate));
    }



}
