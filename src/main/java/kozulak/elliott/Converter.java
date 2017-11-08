package kozulak.elliott;

public class Converter {

    public static double convertCurrency(Currency from, Currency to, double amount) {
        return from.toDollar(amount) * to.getConversionRate();
    }
}
