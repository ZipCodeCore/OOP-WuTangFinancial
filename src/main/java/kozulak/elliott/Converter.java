package kozulak.elliott;

public class Converter {

    public static double convertCurency(Currency from, Currency to, double amount) {
        return from.toDollar(amount) * to.getConversionRate();
    }
}
