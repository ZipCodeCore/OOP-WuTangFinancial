import java.text.DecimalFormat;

public class WuTangCurrency {


    protected static final double US_DOLLAR = 1.00;
    protected static final double EURO = 0.94;
    protected static final double BRITISH = 0.82;
    protected static final double INDIAN_RUPEE = 68.32;
    protected static final double AUSTRALIAN_DOLLAR = 1.35;
    protected static final double CANADIAN_DOLLAR = 1.32;
    protected static final double SINGAPORE_DOLLAR = 1.43;
    protected static final double SWISS_FRANC = 1.01;
    protected static final double MALAYSIAN_RINGGIT = 4.47;
    protected static final double JAPANESE_YEN = 115.84;
    protected static final double CHINESE_YUAN_RENMINBI = 6.92;

    public static double currencyExchangeFormula(double amountFrom, double rateTo, double rateFrom) {

        double amountTo = amountFrom * (rateFrom / rateTo);

        // tried rounding to 2 decimal places but was unsuccessful
      //  double amountToRounded = (double)Math.round(amountTo * 100d) / 100d;

        System.out.println(amountTo);
        return amountTo;
    }

}


