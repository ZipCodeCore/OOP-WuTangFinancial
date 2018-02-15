import java.util.HashMap;
import java.text.DecimalFormat;

    /**
     * Created by Kibret
     */

import java.text.NumberFormat;

public class CurrencyConverter {



    private HashMap<String, Float> exchangeRateRecord;


    public CurrencyConverter () {
        exchangeRateRecord = new HashMap<String, Float>();
        exchangeRateRecord.put("USD", 1.00F);
        exchangeRateRecord.put("EUR", 0.94F);
        exchangeRateRecord.put("GBP", 0.82F);
        exchangeRateRecord.put("INR", 68.32F);
        exchangeRateRecord.put("AUD", 1.35F);
        exchangeRateRecord.put("CAD", 1.32F);
        exchangeRateRecord.put("SGD", 1.43F);
        exchangeRateRecord.put("CHF", 1.01F);
        exchangeRateRecord.put("MYR", 4.47F);
        exchangeRateRecord.put("JPY", 115.84F);
        exchangeRateRecord.put("CNY", 6.92F);

    }


    public String currencyConverter(String fromCurrencyCode, String toCurrencyCode, Float amountToConvert) {
        DecimalFormat formatter = new DecimalFormat("0.##");
        // NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        String result =formatter.format(exchangeRateRecord.get(toCurrencyCode) / (exchangeRateRecord.get(fromCurrencyCode))* amountToConvert);
        return result;


    }


    public HashMap<String, Float> getExchangeRateRecord() {
        return exchangeRateRecord;
    }
}



