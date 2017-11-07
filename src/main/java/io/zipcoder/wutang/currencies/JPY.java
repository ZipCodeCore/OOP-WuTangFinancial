package io.zipcoder.wutang.currencies;

public class JPY extends Currency{

    @Override
    public String getFullName() {
        return "Japanese Yen";
    }

    @Override
    public String getCurrencySymbol() {
        return "¥";
    }

    @Override
    public double getConversionRate() {
        return 115.84;
    }
}
