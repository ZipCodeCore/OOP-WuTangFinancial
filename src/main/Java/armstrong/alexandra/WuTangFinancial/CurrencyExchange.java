package armstrong.alexandra.WuTangFinancial;

/**
 * Created by alexandraarmstrong on 1/11/17.
 */
import java.util.HashMap;
import java.util.Map;

public class CurrencyExchange {
    private final Map<String, Double> exchangeValues = new HashMap<String, Double>() {{
        put("USA", 1.0d);
        put("Euro", 0.94d);
        put("British Pound", 0.82d);
        put("Indian Rupee", 68.32d);
        put("Australian Dollar", 1.35d);
        put("Canadian Dollar", 1.32d);
        put("Singapore Dollar", 1.43d);
        put("Swiss Franc", 1.01d);
        put("Malaysian Ringgit", 4.47d);
        put("Japanese Yen", 115.84d);
        put("Chinese Yuan Renminbi", 6.92d);
    }};

    private double sourceCountry;
    private double destinationCountry;
    private double amount;

    public CurrencyExchange(){}

    /*public CurrencyExchange(double sourceCountry, double destinationCountry, double amount){
        this.sourceCountry = sourceCountry;
        this.destinationCountry = destinationCountry;
        this.amount = amount;
    }*/

    public void setSourceCountry(String s){
        this.sourceCountry = exchangeValues.get(s);
    }

    public void setDestinationCountry(String s){
        this.destinationCountry = exchangeValues.get(s);
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public double exchangeCurrency(){
        return ((amount) / (sourceCountry) * (destinationCountry));
    }

    public double getSourceCountry() {
        return sourceCountry;
    }

    public double getDestinationCountry(){
        return destinationCountry;
    }

    public double getAmount(){
        return amount;
    }
}
