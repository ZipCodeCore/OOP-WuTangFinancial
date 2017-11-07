public class Money {
    private long amountTimes100;
    private CurrencyType currencyType;

    public Money(long amountTimes100, CurrencyType currencyType) {
        this.amountTimes100 = amountTimes100;
        this.currencyType = currencyType;
    }

    public long getAmountTimes100() {
        return amountTimes100;
    }

    public double getAmount() {
        return amountTimes100/100.0;
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    public void convert(CurrencyType desiredCurrencyType) {
        double conversionRate = desiredCurrencyType.getRateWRTUSDollar()/currencyType.getRateWRTUSDollar();
        amountTimes100 = Math.round(conversionRate * amountTimes100);
        currencyType = desiredCurrencyType;
    }
}
