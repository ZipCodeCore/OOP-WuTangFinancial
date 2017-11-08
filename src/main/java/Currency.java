import java.math.BigDecimal;
import java.math.RoundingMode;

public enum Currency {

    US_DOLLAR(1.00),
    EURO(0.94),
    BRITISH_POUND(0.82),
    INDIAN_RUPEE(68.32),
    AUSTRALIAN_DOLLAR(1.35),
    CANADIAN_DOLLAR(1.32),
    SINGAPORE_DOLLAR(1.43),
    SWISS_FRANC(1.01),
    MALAYSIAN_RINGGIT(4.47),
    JAPANESE_YEN(115.84),
    CHINESE_YUAN_RENMINBI(6.92);

    private final double rate;

    Currency(double rate){
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }



    public double convertTo(Currency targetCurrency, double amount){

        double conversionFactor = targetCurrency.getRate() / this.getRate();
        double convertedAmount = amount * conversionFactor;


        return convertedAmount;
    }

}
