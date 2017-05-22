/**
 * Created by cameronsima on 5/22/17.
 */
public class CurrencyConverter {

    public static double convert(Currency convertFrom, Currency convertTo, double amount) {
        double inUSD = convertFrom.getToUSRate(amount);
        return convertTo.getToUSD(inUSD);
    }
}
