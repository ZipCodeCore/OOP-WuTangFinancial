package io.zipcoder.wutang.currencies;

public class INR extends Currency {
    @Override
    public String getFullName() {
        return "Indian Rupee";
    }

    @Override
    public String getCurrencySymbol() {
        return "₹";
    }

    @Override
    public double getConversionRate() {
        return 68.32;
    }
}
