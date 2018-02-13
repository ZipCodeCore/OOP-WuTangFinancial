

public class CurrencyConverter {
    public static final double DOLLAR = 1.00;
    public static final double EURO = 0.94;
    public static final double BRITISH_POUND = 0.82;
    public static final double INDIAN_RUPEE = 68.32;
    public static final double AUSTRALIAN_DOLLAR = 1.35;
    public static final double CANADIAN_DOLLAR = 1.32;
    public static final double SINGAPORE_DOLLAR = 1.43;
    public static final double SWISS_FRANC = 1.01;
    public static final double MALAYSIAN_RINGGIT = 4.47;
    public static final double JAPANESE_YEN = 115.84;
    public static final double CHINESE_YUAN = 6.92;

    public static double convertFromForeignAToForiegnB (double denomination, double originalCurrency, double newCurrency){
        return convertFromDollars(convertToDollars(denomination,originalCurrency), newCurrency);
    }

    public static double convertFromDollars(double denominationInDollars, double targetCurrency) {
        double workingDollars = multiplyBy100(denominationInDollars);
        return divideBy100(Math.round(workingDollars * targetCurrency));
    }

    public static double convertToDollars(double denominationInForeignCurrency, double oldCurrency){
        double workingForeignCurrency = multiplyBy100(denominationInForeignCurrency);
        return divideBy100(Math.round(workingForeignCurrency / oldCurrency));
    }

    public static double multiplyBy100(double valueToMultiply) {
        double multipliedValue = Math.round(valueToMultiply * 100);
        return multipliedValue;
    }

    public static double divideBy100(double valueToDivide) {
        double dividedValue = valueToDivide / 100;
        return dividedValue;
    }

}
