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
        return (long)(Double.parseDouble(amount) * 100);
    }

    public long getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Payment convertTo(Currency currency){
        long dollarAmt10 = amount*this.currency.toDollar()/1000000000L;
        long newAmount100 = dollarAmt10 * currency.fromDollar() / 10;

        long remainder = newAmount100 % 10;
        if(remainder < 5) return new Payment(newAmount100/10 + 1, currency);
        else return new Payment(newAmount100/10, currency);
    }


}
