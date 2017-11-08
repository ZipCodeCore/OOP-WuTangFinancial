import java.text.NumberFormat;
import java.util.Locale;

public enum CurrencyType {
    US_DOLLAR (1.00, NumberFormat.getCurrencyInstance(Locale.US)),
    EURO (0.94, NumberFormat.getCurrencyInstance(Locale.FRANCE)),
    BRITISH_POUND (0.82, NumberFormat.getCurrencyInstance(Locale.UK)),
    INDIAN_RUPEE (68.32, NumberFormat.getCurrencyInstance(new Locale("en", "IN"))),
    AUSTRALIAN_DOLLAR (1.35, NumberFormat.getCurrencyInstance(new Locale("en", "AU"))),
    CANADIAN_DOLLAR (1.32, NumberFormat.getCurrencyInstance(new Locale("en", "CA"))),
    SINGAPORE_DOLLAR (1.43, NumberFormat.getCurrencyInstance(new Locale("en", "SG"))),
    SWISS_FRANC (1.01, NumberFormat.getCurrencyInstance(new Locale("fr", "CH"))),
    MALAYSIAN_RINGGIT (4.47, NumberFormat.getCurrencyInstance(new Locale("ms", "MY"))),
    JAPANESE_YEN (115.84, NumberFormat.getCurrencyInstance(new Locale("ja", "JP"))),
    CHINESE_YUAN_RENMINBI (6.92, NumberFormat.getCurrencyInstance(new Locale("zh", "CN")));

    private final double rateWRTUSDollar;
    private final NumberFormat numberFormat;

    CurrencyType(double rateWRTUSDollar, NumberFormat numberFormat) {
        this.rateWRTUSDollar = rateWRTUSDollar;
        this.numberFormat = numberFormat;
    }

    public double getRateWRTUSDollar() {
        return rateWRTUSDollar;
    }

    public NumberFormat getNumberFormat() {
        return numberFormat;
    }
}
