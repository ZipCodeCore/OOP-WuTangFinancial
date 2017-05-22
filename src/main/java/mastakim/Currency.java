package mastakim;

public enum Currency {

    USD(1000000, 1000000),
    EUR(1063830, 940000),
    GBP,
    INR,
    AUD,
    CAD,
    SGD,
    CHF,
    MYR,
    JPY,
    CNY;

    private final int toDollar;
    private final int fromDollar;

    public int getToDollar(){
        return toDollar;
    }

    public int getFromDollar(){
        return fromDollar;
    }

    Currency(int toDollar, int fromDollar) {
        this.toDollar = toDollar;
        this.fromDollar = fromDollar;
    }
}
