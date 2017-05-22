package mccann.kevin.wutangfinancial;

import java.text.DecimalFormat;
import java.util.HashMap;

/**
 * Created by kevinmccann on 1/11/17.
 */
public class CurrencyConverter extends Currency{

    HashMap<String, Double> currencies = new HashMap<String, Double>();

//        private Currency[] currencies = new Currency[]{
//                new Currency("USD", 1.0),
//                new Currency("EUR", .94),
//                new Currency("GBP", .82),
//                new Currency("INR", 68.32),
//                new Currency("AUD", 1.35),
//                new Currency("CAD", 1.32),
//                new Currency("SGD", 1.43),
//                new Currency("CHF", 1.01),
//                new Currency("MYR", 4.47),
//                new Currency("JPY", 115.84),
//                new Currency("CNY", 6.92)};
    CurrencyConverter() {
        currencies.put("USD", 1.0);
        currencies.put("EUR", .94);
        currencies.put("GBP", .82);
        currencies.put("INR", 68.32);
        currencies.put("AUD", 1.35);
        currencies.put("CAD", 1.32);
        currencies.put("SGD", 1.43);
        currencies.put("CHF", 1.01);
        currencies.put("MYR", 4.47);
        currencies.put("JPY", 115.84);
        currencies.put("CNY", 6.92);
    }

    Double convert(double amount, double fromCountry, double toCountry) {
        DecimalFormat decimalFormat = new DecimalFormat("###.##");
        double total = amount * (toCountry / fromCountry);
        return Double.valueOf(decimalFormat.format(total));
    }

    Double getRateFromCode(String code) {
        return currencies.get(code);
    }

//        for(Currency currency : currencies){
//            if (currency.getCurrencyCode().equals(code)) {
//                return currency;
//            }
//
//        }

    }
