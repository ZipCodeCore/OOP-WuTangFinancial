package io.zipcoder.wutang.currencies;

public class USD extends Currency {

    @Override
    public String getFullName() {
        return "US Dollar";
    }

    @Override
    public String getCurrencySymbol() {
        return "$";
    }

    @Override
    public double getConversionRate() {
        return 1.00;
    }

}
