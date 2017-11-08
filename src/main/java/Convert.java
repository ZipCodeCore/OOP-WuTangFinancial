public class Convert {

    //DecimalFormat money = new DecimalFormat("$###,##0.00");


    public static double convertCurency(Currency from, Currency to, double amount) {
        return from.toCurrency(amount) * to.getRate();
    }
}
