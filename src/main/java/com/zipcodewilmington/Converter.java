package com.zipcodewilmington;

import java.util.HashMap;

public class Converter {

    private static final HashMap<String, Float> conversion = new HashMap<String, Float>();

    public Converter() {
        this.conversion.put("USD", 1.00F);
        this.conversion.put("EUR", 0.94F);
        this.conversion.put("GBP", 0.82F);
        this.conversion.put("INR", 68.32F);
        this.conversion.put("AUD", 1.35F);
        this.conversion.put("CAD", 1.32F);
        this.conversion.put("SGD", 1.43F);
        this.conversion.put("CHF", 1.01F);
        this.conversion.put("MYR", 4.47F);
        this.conversion.put("JPY", 115.84F);
        this.conversion.put("CNY", 6.92F);
    }

    public HashMap<String, Float> getConversion() {
        return this.conversion;
    }

    public float convert(float amount, String fromType, String toType) {
        float conversionMultiplier = this.conversion.get(toType);
        if(!fromType.equals("USD"))
        {
            amount = convertToDollar(amount, fromType);

            if(toType.equals("USD"))
            {
                return amount;
            }
        }
        return amount * conversionMultiplier;
    }

    public float convertToDollar(float amount, String fromType) {
        float conversionMultiplier = this.conversion.get(fromType);
        return amount / conversionMultiplier;
    }
}
