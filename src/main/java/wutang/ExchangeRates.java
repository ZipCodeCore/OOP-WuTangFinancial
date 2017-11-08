package wutang;

public enum ExchangeRates {
    USD (1.00),
    Euro(.94),
    BritishPound(.82),
    IndianRupee(68.32),
    AustralianDollar(1.35),
    CanadianDollar(1.32),
    SingaporeDollar(1.43),
    SwissFranc(1.01),
    MalaysianRinggit(4.47),
    JapaneseYen(115.84),
    ChineseYuanRenminbi(6.92),;

    private double rate;

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    ExchangeRates(double rate) {
        this.rate = rate;
    }
}
