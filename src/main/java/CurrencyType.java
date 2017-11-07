import java.text.NumberFormat;
import java.util.Locale;

public enum CurrencyType {
    //US_DOLLAR (1.00, NumberFormat.getCurrencyInstance(Locale.US)),
    US_DOLLAR (1.00),
    EURO (0.94),
    BRITISH_POUND (0.82),
    INDIAN_RUPEE (68.32),
    AUSTRALIAN_DOLLAR (1.35),
    CANADIAN_DOLLAR (1.32),
    SINGAPORE_DOLLAR (1.43),
    SWISS_FRANC (1.01),
    MALAYSIAN_RINGGIT (4.47),
    JAPANESE_YEN (115.84),
    CHINESE_YUAN_RENMINBI (6.92);

    private final double rateWRTUSDollar;

    //CurrencyType(double rateWRTUSDollar, NumberFormat numberFormat) {
    CurrencyType(double rateWRTUSDollar) {
        this.rateWRTUSDollar = rateWRTUSDollar;
    }

    public double getRateWRTUSDollar() {
        return rateWRTUSDollar;
    }
}
