public class Convert {

    public static double convertCurency(Currency from, Currency to, double amount) {
        return from.toCurrency(amount) * to.getRate();
    }
}
