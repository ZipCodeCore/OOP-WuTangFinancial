package io.zipcoder.wutang.currencies;

public enum CurrencyEnum {
    AUD(new AUD()),
    CAD(new CAD()),
    CHF(new CHF()),
    CNY(new CNY()),
    EUR(new EUR()),
    GBP(new GBP()),
    INR(new INR()),
    JPY(new JPY()),
    SGD(new SGD()),
    USD(new USD());

    Currency currency;

    private CurrencyEnum(Currency currency) {
        this.currency = currency;
    }

    public Currency getCurrency() {
        return this.currency;
    }
}