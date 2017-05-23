package kalaygian.dennis;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Created by denniskalaygian on 5/22/17.
 */
public abstract class Currency {

    private double amount;
    private double rate;

    public Currency(double amount, double rate) {
        this.amount = amount;
        this.rate = rate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getRate() {
        return rate;
    }

    public String convertTo(String newCurrency) {
        Currency theNewCurrency = CurrencyFactory.createCurrency(newCurrency, 0);
        return formatCurrency(((theNewCurrency.getRate() / getRate())) * getAmount());
    }

    public String formatCurrency(double value){
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return decimalFormat.format(value);
    }
}
