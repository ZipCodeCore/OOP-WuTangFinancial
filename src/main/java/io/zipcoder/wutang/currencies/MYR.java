package io.zipcoder.wutang.currencies;

public class MYR extends Currency {
    @Override
    public String getFullName() {
        return "Malaysian Ringgit";
    }

    @Override
    public String getCurrencySymbol() {
        return "RM";
    }

    @Override
    public double getConversionRate() {
        return 4.47;
    }
}
