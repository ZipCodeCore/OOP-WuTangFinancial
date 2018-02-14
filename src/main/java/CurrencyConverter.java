import java.util.Map;
import java.util.TreeMap;

public class CurrencyConverter {

    private double convertingCurrency;

    private Map<String, Double> conversionMap = new TreeMap<String, Double>() {
        {
        put("Us Dollar", 1.00);
        put("Euro", 0.94);
        put("British Pound", 0.82);
        put("Indian Rupee", 68.32);
        put("Australian Dollar", 1.35);
        put("Canadian Dollar", 1.32);
        put("Singapore Dollar", 1.43);
        put("Swiss Franc", 1.01);
        put("Malaysian Ringgit", 4.47);
        put("Japanese Yen", 115.84);
        put("Chinese Yuan Renminbi", 6.92);
        }
    };
    public double convertCurrentToDestinationCurrency(String current, String destination, double fatStack) {
        convertingCurrency = ((conversionMap.get(destination)) / (conversionMap.get(current))) * fatStack;
        return convertingCurrency;
    }

}