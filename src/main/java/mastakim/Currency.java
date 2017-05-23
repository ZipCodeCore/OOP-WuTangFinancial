package mastakim;

public enum Currency {

    USD(1000000000, 100),
    EUR(1063829787, 94),
    GBP(1219512195, 82),
    INR(14637002, 6832),
    AUD(740740741, 135),
    CAD(757575758, 132),
    SGD(699300699, 143),
    CHF(990099001, 101),
    MYR(223713647, 447),
    JPY(8632597, 11584),
    CNY(144508671, 692);

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
