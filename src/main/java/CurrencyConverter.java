/**
 * Created by brianmullin on 5/22/17.
 */
import java.util.Map;
import java.util.Map;
import java.util.TreeMap;
import java.math.BigDecimal;

public class CurrencyConverter {

    Map<String, Double> conversionMap = new TreeMap<String, Double>() {{put("USD", 1.00); put("EURO", 0.94);
        put("POUND", 0.82); put("AUS", 1.35); put("RUP", 68.32); put("CAN", 1.32); put("SING", 1.43);
        put("FRANC", 1.01); put("RINGGIT", 4.47); put("YEN", 115.84); put("YUAN", 6.92)}};


    public String firstCountry;
    public String secondCountry;
    public double amount;
    public double firstRate;
    public double secondRate;


    public CurrencyConverter(String firstCountry, String secondCountry, double amount){

        this.firstCountry = firstCountry;
        this.secondCountry = secondCountry;
        this.amount = amount;
    }

    public double convertTo(String firstCountry, String secondCountry, double amount){

        double convertedAmount = (getFirstExchangeRate(firstCountry)/getSecondExchangeRate(secondCountry)) * amount;

        return convertedAmount;
    }

    public double getFirstExchangeRate(String country){

        this.firstRate = conversionMap.get(country);

        return firstRate;
    }

    public double getSecondExchangeRate(String country){

        this.secondRate = conversionMap.get(country);

        return secondRate;
    }





}
