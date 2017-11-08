public class Currency {
    private String currencyType;
    private double rate;
    private String currencyName;
    Currency(String currency,double rate,String currencyName){
        this.currencyType = currency;
        this.rate = rate;
        this.currencyName = currencyName;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public double getRate() {
        return rate;
    }

    public String getCurrencyName() {
        return currencyName;
    }
}
