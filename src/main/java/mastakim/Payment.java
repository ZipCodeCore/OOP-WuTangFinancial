package mastakim;

public class Payment {

    private long amount;
    private Currency currency;

    public Payment(long amount, Currency currency){
        this.amount = amount;
        this.currency = currency;
    }

    public Payment(String amount, Currency currency){
        this.amount = toLong(amount);
        this.currency = currency;
    }

    private long toLong(String amount){
        return (int)(Double.parseDouble(amount) * 100);
    }

    public long getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Payment convertTo(Currency currency){
        long usdAmount = amount*this.currency.toDollar()/1000000;
        return new Payment(usdAmount*currency.fromDollar()/1000000, currency);
    }
}
