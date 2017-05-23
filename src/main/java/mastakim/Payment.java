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
        BigInteger dollarAmt10 = amount.multiply(this.currency.toDollar()).divide(new BigInteger("1000000000"));

        BigInteger newAmount100 = dollarAmt10.multiply(currency.fromDollar()).divide(BigInteger.TEN);

        BigInteger remainder = newAmount100.remainder(new BigInteger("5"));
        if(remainder.compareTo(new BigInteger("5")) < 0) return new Payment(newAmount100.divide(BigInteger.TEN).add(BigInteger.ONE), currency);
        else return new Payment(newAmount100.divide(BigInteger.TEN), currency);
    }


}
