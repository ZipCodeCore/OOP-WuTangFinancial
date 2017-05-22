

/**
 * Created by jarrydstamatelos on 5/22/17.
 */
public class Currency {

    public static final double USDOLLAR = 1.00;
    public static final double EURO = 0.94;
    public static final double BRITISHHPOUND = 0.82;
    public static final double INDIANRUPEE = 68.32;
    public static final double AUSSIEDOLLAR = 1.35;
    public static final double CANADADOLLAR = 1.32;
    public static final double SINGAPOREDOLLAR = 1.43;
    public static final double SWISSFRANC = 1.01;
    public static final double RINGGIT = 4.47;
    public static final double YEN = 115.84;
    public static final double CHINESEYUAN = 6.92;

    public double CurrencyConversion(double startCurrency, double targetCurrency){
        double converted = USDOLLAR / startCurrency * targetCurrency;
        return converted;
    }

}
