package io.zipcoder.wutang.currencies;

public class GBP extends Currency{

    @Override
    public String getFullName() {
        return "British Pound";
    }

    @Override
    public String getCurrencySymbol() {
        return "£";
    }

    @Override
    public double getConversionRate() {
        return 0.82;
    }
}
