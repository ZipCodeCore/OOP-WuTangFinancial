import java.math.BigDecimal;
import java.math.RoundingMode;

public enum Currency {

    US_DOLLAR(1.00,"$"),
    EURO(0.94,"€"),
    BRITISH_POUND(0.82,"£"),
    INDIAN_RUPEE(68.32,"₹"),
    AUSTRALIAN_DOLLAR(1.35,"AUD"),
    CANADIAN_DOLLAR(1.32,"CAD"),
    SINGAPORE_DOLLAR(1.43,"SGD"),
    SWISS_FRANC(1.01,"CHF"),
    MALAYSIAN_RINGGIT(4.47,"RM"),
    JAPANESE_YEN(115.84,"¥"),
    CHINESE_YUAN_RENMINBI(6.92,"CNY");

    private final double rate;
    private final String symbol;

    Currency(double rate, String symbol){
        this.rate = rate;
        this.symbol =symbol;
    }

    public double getRate() {
        return rate;
    }

    public String getSymbol() {
        return symbol;
    }



    public double convertTo(Currency targetCurrency, double amount){

        double conversionFactor = targetCurrency.getRate() / this.getRate();
        double convertedAmount = amount * conversionFactor;


        return convertedAmount;
    }

}
