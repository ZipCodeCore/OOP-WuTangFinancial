package mastakim;

import java.math.BigDecimal;

public enum Currency {

    USD(new BigDecimal("1.00"), new BigDecimal("1.00")),
    EUR(new BigDecimal("1.063829787234043"), new BigDecimal("0.94")),
    GBP(new BigDecimal("1.219512195121951"), new BigDecimal("0.82")),
    INR(new BigDecimal("0.01463700234192"), new BigDecimal("68.32")),
    AUD(new BigDecimal("0.740740740740741"), new BigDecimal("1.35")),
    CAD(new BigDecimal("0.757575757575758"), new BigDecimal("1.32")),
    SGD(new BigDecimal("0.699300699300699"), new BigDecimal("1.43")),
    CHF(new BigDecimal("0.99009900990099"), new BigDecimal("1.01")),
    MYR(new BigDecimal("0.223713646532438"), new BigDecimal("4.47")),
    JPY(new BigDecimal("0.008632596685083"), new BigDecimal("115.84")),
    CNY(new BigDecimal("0.144508670520231"), new BigDecimal("6.92"));

    private final BigDecimal toDollar;
    private final BigDecimal fromDollar;

    public BigDecimal toDollar(){
        return toDollar;
    }

    public BigDecimal fromDollar(){
        return fromDollar;
    }

    Currency(BigDecimal toDollar, BigDecimal fromDollar) {
        this.toDollar = toDollar;
        this.fromDollar = fromDollar;
    }
}
