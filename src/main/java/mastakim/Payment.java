package mastakim;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Payment {

    private BigDecimal amount;
    private Currency currency;


    public Payment(BigDecimal amount, Currency currency){
        this.amount = amount;
        this.currency = currency;
    }

    public Payment(String amount, Currency currency){
        this.amount = toBigDecimal(amount);
        this.currency = currency;
    }

    private BigDecimal toBigDecimal(String amount){
        return new BigDecimal((Long.toString((long)Double.parseDouble(amount)*100)));
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Payment convertTo(Currency currency){
        BigDecimal dollarAmt = amount.multiply(this.currency.toDollar()).multiply(currency.fromDollar());
        dollarAmt = dollarAmt.setScale(0, RoundingMode.HALF_UP);
        return new Payment(dollarAmt, currency);
    }


}
