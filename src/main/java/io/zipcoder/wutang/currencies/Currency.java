package io.zipcoder.wutang.currencies;

public abstract class Currency {

    public abstract String getFullName();

    public abstract String getCurrencySymbol();

    public abstract double getConversionRate();

    public String printAmountInCurrency(double amount){
        return String.format("%s%,.2f", getCurrencySymbol(), amount);
    }

}
