public class Currency {
    private String currencyType;
    private double rate;
    Currency(String currency,double rate){
        this.currencyType = currency;
        this.rate = rate;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public double getRate() {
        return rate;
    }
}
