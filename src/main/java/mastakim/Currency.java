package mastakim;

public enum Currency {

    USD(1000000, 1000000),
    EUR(1063830, 940000),
    GBP(1219512, 820000),
    INR(14637, 68320000),
    AUD(740741, 1350000),
    CAD(757576, 1320000),
    SGD(699301, 1430000),
    CHF(990099, 1010000),
    MYR(223714, 4470000),
    JPY(8633, 115840000),
    CNY(144509, 6920000);

    private final long toDollar;
    private final long fromDollar;

    public long toDollar(){
        return toDollar;
    }

    public long fromDollar(){
        return fromDollar;
    }

    Currency(long toDollar, long fromDollar) {
        this.toDollar = toDollar;
        this.fromDollar = fromDollar;
    }
}
