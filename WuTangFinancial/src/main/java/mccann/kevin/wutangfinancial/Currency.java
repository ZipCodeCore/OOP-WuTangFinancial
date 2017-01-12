package mccann.kevin.wutangfinancial;

/**
 * Created by kevinmccann on 1/11/17.
 */
public class Currency {
    private static String currencyCode;
    private double rate;

    public Currency(String code, double rate) {
        currencyCode = code;
        this.setRate(rate);
    }

    public String getCurrencyCode(){
        return currencyCode;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }


}
