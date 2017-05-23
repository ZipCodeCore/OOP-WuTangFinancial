package mastakim;

import java.math.BigInteger;

public enum Currency {

    USD(new BigInteger("1000000000"), new BigInteger("100")),
    EUR(new BigInteger("1063829787"), new BigInteger("94")),
    GBP(new BigInteger("1219512195"), new BigInteger("82")),
    INR(new BigInteger("14637002"), new BigInteger("6832")),
    AUD(new BigInteger("740740741"), new BigInteger("135")),
    CAD(new BigInteger("757575758"), new BigInteger("132")),
    SGD(new BigInteger("699300699"), new BigInteger("143")),
    CHF(new BigInteger("990099001"), new BigInteger("101")),
    MYR(new BigInteger("223713647"), new BigInteger("447")),
    JPY(new BigInteger("8632597"), new BigInteger("11584")),
    CNY(new BigInteger("144508671"), new BigInteger("692"));

    private final BigInteger toDollar;
    private final BigInteger fromDollar;

    public BigInteger toDollar(){
        return toDollar;
    }

    public BigInteger fromDollar(){
        return fromDollar;
    }

    Currency(BigInteger toDollar, BigInteger fromDollar) {
        this.toDollar = toDollar;
        this.fromDollar = fromDollar;
    }
}
