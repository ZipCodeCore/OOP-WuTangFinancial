package kalaygian.dennis.typesofcurrency;

import kalaygian.dennis.Currency;

/**
 * Created by denniskalaygian on 5/22/17.
 */
public class Euro extends Currency {

    public Euro(double amount) {
        super(amount, 0.94);
    }

    public double getAmount() {
        return super.getAmount();
    }

    public double getRate() {
        return super.getRate();
    }
}
