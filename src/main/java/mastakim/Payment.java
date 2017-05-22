package mastakim;

public class Payment {

    private long amount;
    private Currency currency;
    private final long BIG = 100000000000000L;

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
        long usdAmount = amount*this.currency.toDollar();
        return new Payment(usdAmount*currency.fromDollar()/BIG, currency);
    }
}
