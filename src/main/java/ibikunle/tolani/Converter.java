package ibikunle.tolani;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by tolaniibikunle on 2/16/17.
 */
public class Converter {
    private Map conversionRate = new HashMap<String,Integer>();
    private String startingCurrencyType;
    private String convertedCurrencyType;
    private Double inputAmount;




    public Converter(String startingCurrencyType,String convertedCurrencyType, Double amount) {
        conversionRate.put("US Dollar",1.00);
        conversionRate.put("Euro",0.94);
        conversionRate.put("British Pound",0.82);
        conversionRate.put("Indian Rupee",68.32);
        conversionRate.put("Australian Dollar",1.35);
        conversionRate.put("Canadian Dollar",1.32);
        conversionRate.put("Singapore Dollar",1.43);
        conversionRate.put("Swiss Franc",1.01);
        conversionRate.put("Malaysian Ringgit",4.47);
        conversionRate.put("Japanese Yen",115.84);
        conversionRate.put("Chinese Yuan Renminbi",6.92);
    this.startingCurrencyType = startingCurrencyType;
    this.convertedCurrencyType = convertedCurrencyType;
    this.inputAmount = amount;

    }

    public double convert(){
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        return Double.parseDouble(df.format((inputAmount/(Double)conversionRate.get(startingCurrencyType)
                *(Double)conversionRate.get(convertedCurrencyType))));
    }

}
