package io.zipcoder.wutang.currencies;

public class CNY extends Currency {
    @Override
    public String getFullName() {
        return "Chinese Yuan";
    }

    @Override
    public String getCurrencySymbol() {
        return "¥";
    }

    @Override
    public double getConversionRate() {
        return 6.92;
    }
}
