import java.math.BigDecimal;
import java.util.Locale;

/**
 * Created by andrewwong on 5/22/17.
 */
public class ExchangeRates {
    private static final BigDecimal USD = new BigDecimal(1.00);
    private static final BigDecimal EUR = new BigDecimal(0.94);
    private static final BigDecimal GBP = new BigDecimal(0.82);
    private static final BigDecimal INR = new BigDecimal(68.32);
    private static final BigDecimal AUD = new BigDecimal(1.35);
    private static final BigDecimal CAD = new BigDecimal(1.32);
    private static final BigDecimal SGD = new BigDecimal(1.43);
    private static final BigDecimal CHF = new BigDecimal(1.01);
    private static final BigDecimal MYR = new BigDecimal(4.47);
    private static final BigDecimal JPY = new BigDecimal(115.84);
    private static final BigDecimal CNY = new BigDecimal(6.92);
    private Locale locale;

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public Locale getLocale() {

        return locale;
    }

    public static BigDecimal getUSD() {
        return USD;
    }

    public static BigDecimal getEUR() {
        return EUR;
    }


    public static BigDecimal getGBP() {
        return GBP;
    }

    public static BigDecimal getINR() {
        return INR;
    }

    public static BigDecimal getAUD() {
        return AUD;
    }

    public static BigDecimal getCAD() {
        return CAD;
    }

    public static BigDecimal getSGD() {
        return SGD;
    }

    public static BigDecimal getCHF() {
        return CHF;
    }

    public static BigDecimal getMYR() {
        return MYR;
    }

    public static BigDecimal getJPY() {
        return JPY;
    }

    public static BigDecimal getCNY() {
        return CNY;
    }

    public BigDecimal selectMenuOption(String s) {
        switch (s) {
            case "1":
                setLocale(Locale.US);
                return USD;
            case "2":
                setLocale(Locale.GERMANY);
                return EUR;
            case "3":
                setLocale(Locale.UK);
                return GBP;
            case "4":
                setLocale(Locale.US);
                return INR;
            case "5":
                setLocale(Locale.US);
                return AUD;
            case "6":
                setLocale(Locale.CANADA);
                return CAD;
            case "7":
                setLocale(Locale.US);
                return SGD;
            case "8":
                setLocale(Locale.US);

                return CHF;
            case "9":
                setLocale(Locale.US);
                return MYR;
            case "10":
                setLocale(Locale.JAPAN);
                return JPY;
            case "11":
                setLocale(Locale.CHINA);
                return CNY;
            default:
                return null;
        }
    }
}
