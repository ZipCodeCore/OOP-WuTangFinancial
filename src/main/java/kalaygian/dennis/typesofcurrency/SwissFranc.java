package kalaygian.dennis.typesofcurrency;

import kalaygian.dennis.Currency;

/**
 * Created by denniskalaygian on 5/22/17.
 */
public class SwissFranc extends Currency {

    public SwissFranc(double amount) {
        super(amount, 1.01);
    }

    public double getAmount() {
        return super.getAmount();
    }

    public double getRate() {
        return super.getRate();
    }
}
