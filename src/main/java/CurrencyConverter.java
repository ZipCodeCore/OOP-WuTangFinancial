/**
 * Created by brianmullin on 5/22/17.
 */
import java.text.DecimalFormat;
import java.util.Map;
import java.util.TreeMap;
import java.math.BigDecimal;

public class CurrencyConverter {

    //double amount = new BigDecimal(); //Add this later
    //Turn Map keys to regex
    private Map<String, Double> conversionMap = new TreeMap<String, Double>() {
        {
            put("USD", 1.00);
            put("EURO", 0.94);
            put("POUND", 0.82);
            put("AUS", 1.35);
            put("RUP", 68.32);
            put("CAN", 1.32);
            put("SING", 1.43);
            put("FRANC", 1.01);
            put("RINGGIT", 4.47);
            put("YEN", 115.84);
            put("YUAN", 6.92);
            put("BITCOIN", 0.00044961);
            put("ETHER", 0.00565547);
        }
    };


    //public String firstCountry;
    //public String secondCountry;
    //public double amount;


    public CurrencyConverter(){}
/*
    public CurrencyConverter(String firstCountry, String secondCountry, double amount){

        this.firstCountry = firstCountry;
        this.secondCountry = secondCountry;
        this.amount = amount;
    }*/

    //Find a way to keep this as a double or BigDecimal instead of String
    public String convertTo(String firstCountry, String secondCountry, double amount){

        DecimalFormat df = new DecimalFormat("#.##");

        return df.format((getSecondExchangeRate(secondCountry) / getFirstExchangeRate(firstCountry)) * amount);

    }


    private double getFirstExchangeRate(String firstCountry){

        return conversionMap.get(firstCountry);//try catch?
    }


    private double getSecondExchangeRate(String secondCountry){

        return conversionMap.get(secondCountry);

    }





}
