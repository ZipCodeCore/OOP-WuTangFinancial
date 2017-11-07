package io.zipcoder.wutang.currencies;

public class CHF extends Currency {
    @Override
    public String getFullName() {
        return "Swiss Franc";
    }

    @Override
    public String getCurrencySymbol() {
        return "CHF";
    }

    @Override
    public double getConversionRate() {
        return 1.01;
    }
}
