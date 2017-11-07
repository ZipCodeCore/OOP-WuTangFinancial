package io.zipcoder.wutang.currencies;

public class AUD extends Currency {
    @Override
    public String getFullName() {
        return "Australian Dollar";
    }

    @Override
    public String getCurrencySymbol() {
        return "$";
    }

    @Override
    public double getConversionRate() {
        return 1.35;
    }
}
