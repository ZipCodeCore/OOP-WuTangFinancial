public class CurrencyExchange {

    public static final double US_DOLLAR = 1.00;
    public static final double EURO = 0.94;
    public static final double BRITISH_POUND = 0.82;
    public static final double INDIAN_RUPEE = 68.32;
    public static final double AUSTRALIAN_DOLLAR = 1.35;
    public static final double CANADIAN_DOLLAR = 1.32;
    public static final double SINGAPORE_DOLLAR = 1.43;
    public static final double SWISS_FRANC = 1.01;
    public static final double MALAYSIAN_RINGGIT = 4.47;
    public static final double JAPANESE_YEN = 115.84;
    public static final double CHINESE_YUAN_RENMINBI = 6.92;

    public static double convertFromTo(double fromAmount, double fromCurrencyRate, double toCurrencyRate) {

        double toAmount = toCurrencyRate * (fromAmount / fromCurrencyRate);
        return toAmount;
    }



}
