package io.zipcoder.wutang.currencies;

public class SGD extends Currency {
    @Override
    public String getFullName() {
        return "Singapore Dollar";
    }

    @Override
    public String getCurrencySymbol() {
        return "$";
    }

    @Override
    public double getConversionRate() {
        return 1.43;
    }
}
