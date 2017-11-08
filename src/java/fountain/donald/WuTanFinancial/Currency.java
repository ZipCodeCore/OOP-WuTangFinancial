package fountain.donald.WuTanFinancial;

public enum Currency {
    USDollar(1.00),
    Euro(0.94),
    BritishPound(0.82),
    IndianRupee(68.32),
    AustralianDollar(1.35),
    CanadianDollar(1.32),
    SingaporeDollar(1.43),
    SwissFranc(1.01),
    MalaysianRinggit(4.47),
    JapaneseYen(115.84),
    ChineseYuanRenminbi(6.92)
    ;

    private final Double currencyRate;

    Currency(Double locale) {
        this.currencyRate = locale;
    }

    public Double getCurrencyRate() {
        return this.currencyRate;
    }
}

