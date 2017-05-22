package mastakim;

import static mastakim.Currency.*;

public class Money {

    private int amount;
    private Currency currency;

    public Money(int amount, Currency currency){
        this.amount = amount;
        this.currency = currency;
    }

    public Money convertTo(Currency currency){
        return new Money(0, USD);
    }
}
