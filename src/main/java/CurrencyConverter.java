import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;
import java.math.BigDecimal;


public class CurrencyConverter {

    private double convertedToUsd;
    private double convertedToInternational;
    private double convertedAmount;

    private TreeMap<String, Double> currencyMap = new TreeMap<String, Double>() {
        {
            put("USD", 1.00);
            put("EUR", 0.94);
            put("GBP", 0.82);
            put("Re", 68.32);
            put("AUD", 1.35);
            put("CAD", 1.32);
            put("SGD", 1.43);
            put("CHF", 1.01);
            put("RM", 4.47);
            put("JPY", 115.84);
            put("CNH", 6.92);

        }
    };

        public double usdToInternational(String nation, double amount) {
            convertedToInternational = amount * currencyMap.get(nation);
            return convertedToInternational;
        }

        public double internationaltoUSD(String nation, double amount) {
            convertedToUsd = amount / currencyMap.get(nation);
            return convertedToUsd;
        }

        public double convertCurrency(String startingNation, String endingNation, double amount){

            convertedAmount = usdToInternational(endingNation,internationaltoUSD(startingNation, amount));
            return convertedAmount;
       }


    }
