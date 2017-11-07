package io.zipcoder.wutang.currencies;

public class EUR extends Currency {
//    public Euro() {
//        super("Euro", "€", 0.94);
//    }

    @Override
    public String getFullName() {
        return "Euro";
    }

    @Override
    public String getCurrencySymbol() {
        return "€";
    }

    @Override
    public double getConversionRate() {
        return 0.94;
    }
}
