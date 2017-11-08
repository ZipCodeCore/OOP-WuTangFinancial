package wutang;

public enum ExchangeRates {
    USD (1.00),
    EURO(.94),
    BRITISHPOUND(.82),
    INDIANRUPEE(68.32),
    AUSTRALIANDOLLAR(1.35),
    CANADIANDOLLAR(1.32),
    SINGAPOREDOLLAR(1.43),
    SWISSFRANC(1.01),
    MALAYSIANRINGGIT(4.47),
    JAPANESEYEN(115.84),
    CHINESEYUANRENMINBI(6.92),;

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
