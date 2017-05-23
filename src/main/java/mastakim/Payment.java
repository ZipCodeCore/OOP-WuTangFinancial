package mastakim;

public class Payment {

    private long amount;
    private Currency currency;
    private final long BIG = 10000000000000L;

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
        long amountTimesTen = amount*this.currency.toDollar()*currency.fromDollar()/BIG;
        long remainder = amountTimesTen % 10;
        if(remainder >= 5) return new Payment(amountTimesTen/10 + 1, currency);
        else return new Payment(amountTimesTen/10, currency);
    }
}
