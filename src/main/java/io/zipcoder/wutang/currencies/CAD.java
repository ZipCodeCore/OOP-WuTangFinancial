package io.zipcoder.wutang.currencies;

public class CAD extends Currency {
    @Override
    public String getFullName() {
        return "Canadian Dollar";
    }

    @Override
    public String getCurrencySymbol() {
        return "$";
    }

    @Override
    public double getConversionRate() {
        return 1.32;
    }
}
