public enum Currency {
    USDollar(1.0),
    Euro(0.94),
    BritishPound(0.82),
    IndianRupee(68.32),
    AustralianDollar(1.35),
    CanadianDollar(1.32),
    SingaporeDollar(1.43),
    SwissFranc(1.01),
    MalaysianRinggit(4.47),
    JapaneseYen(115.84),
    ChineseYuanRenminbi(6.92);

    final double rate;

    Currency(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public double toCurrency(double amount){
        return amount/rate;
    }
}
