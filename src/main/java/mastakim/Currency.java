package mastakim;

public enum Currency {

    USD(10000000, 10000000),
    EUR(10638297, 9400000),
    GBP(12195122, 8200000),
    INR(146370, 683200000L),
    AUD(7407407, 13500000),
    CAD(7575758, 13200000),
    SGD(6993007, 14300000),
    CHF(9900990, 10100000),
    MYR(2237136, 44700000L),
    JPY(86326, 1158400000L),
    CNY(1466276, 69200000);

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
