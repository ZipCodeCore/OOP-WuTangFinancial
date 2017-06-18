/**
 * Created by brianmullin on 5/22/17.
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Map;
import java.util.TreeMap;
import java.math.BigDecimal;
import java.util.*;
import java.text.*;

public class CurrencyConverter {

    //double amount = new BigDecimal(); //Add this later
    //Turn Map keys to regex
    private Map<String, Double> conversionMap = new TreeMap<String, Double>() {
        {
            put("USD" /*\b[Uu][Ss][Dd]*/, 1.00); //US Dollar
            put("EUR"/*"\b[Ee][Uu][Rr]"*/, 0.94); //EURO
            put("GBP"/*"\b[Gg][Bb][Pp]"*/, 0.82); //Great Britain Pound
            put("AUD"/*"\b[Aa][Uu][Dd]"*/, 1.35); //Australian Dollar
            put("INR"/*"\b[Ii][Nn][Rr]"*/, 68.32);//India Rupee
            put("CAD"/*"\b[Cc][Aa][Dd]"*/, 1.32); //Canadian Dollar
            put("SGD"/*"\b[Ss][Gg][Dd]"*/, 1.43); //Singapore Dollar
            put("CHF"/*"\b[Cc][Hh][Ff]"*/, 1.01); //Swiss Franc
            put("MYR"/*"\b[Mm][Yy][Rr]"*/, 4.47); //Malaysia Ringgit
            put("JPY"/*"\b[Jj][Pp][Yy]"*/, 115.84); //Japan Yen
            put("CNY"/*"\b[Cc][Nn][Yy]"*/, 6.92);  //Chinese Yuan/Renminbi
            put("BTC"/*"\b[Bb][Tt][Cc]"*/, 0.00044961); //Bitcoin
            put("ETH"/*"\b[Ee][Tt][Hh"*/, 0.00565547); //Ethereum
        }
    };

    public CurrencyConverter(){}

    //Find a way to keep this as a double or BigDecimal instead of String
    public BigDecimal convertTo(String firstCountry, String secondCountry, double amountEntered){

        double amount = calculateExchangeRate(firstCountry, secondCountry) * amountEntered;
        BigDecimal roundedAmount = new BigDecimal(amount);

        return roundedAmount.setScale(2, BigDecimal.ROUND_CEILING);


    }

    private double calculateExchangeRate(String firstCountry, String secondCountry){

        return (getSecondExchangeRate(secondCountry) / getFirstExchangeRate(firstCountry));

    }


    private double getFirstExchangeRate(String firstCountry){

        return conversionMap.get(firstCountry);//try catch?
    }


    private double getSecondExchangeRate(String secondCountry){

        return conversionMap.get(secondCountry);

    }





}
