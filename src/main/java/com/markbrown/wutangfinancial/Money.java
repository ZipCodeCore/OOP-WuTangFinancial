package com.markbrown.wutangfinancial;

/**
 * Created by markbrown on 5/22/17.
 */
public class Money {

    private static long moneyInOneHundredths;

    private Money() {}

    public static void setMoneyInOneHundredths(long money) {
        moneyInOneHundredths = money;
    }

    public static long getMoneyInOneHundredths() {
        return moneyInOneHundredths;
    }

    public static double getMoneyInCurrency() { return (double) moneyInOneHundredths / 100;}
}
