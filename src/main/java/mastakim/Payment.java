package mastakim;

import static mastakim.Currency.*;

public class Payment {

    private int amount;
    private Currency currency;

    public Payment(int amount, Currency currency){
        this.amount = amount;
        this.currency = currency;
    }

    public Payment(String amount, Currency currency){
        this.amount = toInt(amount);
        this.currency = currency;
    }

    private int toInt(String amount){
        return (int)(Double.parseDouble(amount) * 100);
    }

    public int getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Payment convertTo(Currency currency){
        int usdAmount = amount*this.currency.toDollar()/1000000;
        return new Payment(usdAmount*currency.fromDollar()/1000000, currency);
    }
}
