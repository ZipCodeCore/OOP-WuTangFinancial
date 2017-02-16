package Kim.Andy;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by andykim on 2/16/17.
 */
public class ExchangeRates {

    ExchangeRates(){
        addCurrencytoMap();
    }

    Map<String, Double> currencyMap;

    private void addCurrencytoMap(){
        currencyMap = new HashMap<String, Double>();
        currencyMap.put("USD", 1.00);
        currencyMap.put("EUR", 0.94);
        currencyMap.put("GBP", 0.82);
        currencyMap.put("IDR", 68.32);
        currencyMap.put("AUD", 1.35);
        currencyMap.put("CND", 1.32);
        currencyMap.put("SGD", 1.43);
        currencyMap.put("SWF", 1.01);
        currencyMap.put("MRT", 4.47);
        currencyMap.put("JPY", 115.84);
        currencyMap.put("CYR", 6.92);
    }

    public Map<String, Double> getCurrencyMap() {
        return currencyMap;
    }

    public String exchanger(String currency, double amount, String wantCurrency){
        double toUSD = amount / currencyMap.get(currency);
        double toCurrency = toUSD * currencyMap.get(wantCurrency);
        NumberFormat formatter = new DecimalFormat("#0.00");
        return formatter.format(toCurrency);
    }

}
