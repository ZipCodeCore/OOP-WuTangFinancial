import static java.lang.String.valueOf;

/**
 * Created by jarrydstamatelos on 5/22/17.
 */
public class Currency {

    public static final double USDOLLAR = 1.00d;
    public static final double EURO = 0.94d;
    public static final double BRITISHHPOUND = 0.82d;
    public static final double INDIANRUPEE = 68.32d;
    public static final double AUSSIEDOLLAR = 1.35d;
    public static final double CANADADOLLAR = 1.32d;
    public static final double SINGAPOREDOLLAR = 1.43d;
    public static final double SWISSFRANC = 1.01d;
    public static final double RINGGIT = 4.47d;
    public static final double YEN = 115.84d;
    public static final double CHINESEYUAN = 6.92d;

    public double startCurrency;
    public double targetCurrency;

    public void setStartCurrency(double startCurrency) {
        this.startCurrency = startCurrency;
    }

    public void setTargetCurrency(double targetCurrency) {
        this.targetCurrency = targetCurrency;
    }

    public double CurrencyConversion(double startCurrency, double targetCurrency){
        double converted = USDOLLAR / startCurrency * targetCurrency;
        return (double) Math.round(converted*100)/100d;
    }


}
