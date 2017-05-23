package mastakim;

import java.math.BigInteger;

public class Payment {

    private BigInteger amount;
    private Currency currency;


    public Payment(BigInteger amount, Currency currency){
        this.amount = amount;
        this.currency = currency;
    }

    public Payment(String amount, Currency currency){
        this.amount = toBigInteger(amount);
        this.currency = currency;
    }

    private BigInteger toBigInteger(String amount){
        return new BigInteger((Long.toString((long)Double.parseDouble(amount)*100)));
    }

    public BigInteger getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Payment convertTo(Currency currency){
        BigInteger dollarAmt10 = amount.multiply(this.currency.toDollar()).multiply(currency.fromDollar()).divide(new BigInteger("10000000000000000"));
        BigInteger remainder = dollarAmt10.remainder(new BigInteger("10"));
        if(remainder.compareTo(new BigInteger("5")) < 0) return new Payment(dollarAmt10.divide(BigInteger.TEN).add(BigInteger.ONE), currency);
        else return new Payment(dollarAmt10.divide(BigInteger.TEN), currency);
    }


}
