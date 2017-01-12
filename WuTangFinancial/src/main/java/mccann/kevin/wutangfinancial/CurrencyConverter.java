package mccann.kevin.wutangfinancial;

import static mccann.kevin.wutangfinancial.Currency.*;

/**
 * Created by kevinmccann on 1/11/17.
 */
public class CurrencyConverter {
//        HashMap<String, double> currencies = new HashMap<String, double>();
//        currencies.put("USD", 1.0);
//        currencies.put("EUR", .94);
//        currencies.put("GBP", .82);
//        currencies.put("INR", 68.32);
//        currencies.put("AUD", 1.35);
//        currencies.put("CAD", 1.32);
//        currencies.put("SGD", 1.43);
//        currencies.put("CHF", 1.01);
//        currencies.put("MYR", 4.47);
//        currencies.put("JPY", 115.84);
//        currencies.put("CNY", 6.92);

        private Currency[] currencies = new Currency[]{
                new Currency("USD", 1.0),
                new Currency("EUR", .94),
                new Currency("GBP", .82),
                new Currency("INR", 68.32),
                new Currency("AUD", 1.35),
                new Currency("CAD", 1.32),
                new Currency("SGD", 1.43),
                new Currency("CHF", 1.01),
                new Currency("MYR", 4.47),
                new Currency("JPY", 115.84),
                new Currency("CNY", 6.92)};

    CurrencyConverter() {
    }

    Double convert(double amount, Currency fromCountry, Currency toCountry) {
        return amount * (toCountry.getRate() / fromCountry.getRate());
    }

    Currency getCurrencyFromCode(String code) {
        for(Currency currency : currencies) {
            if (code.equals(currency.getCurrencyCode()))
                return currency;
        }
    }
}
