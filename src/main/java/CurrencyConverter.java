import java.math.BigDecimal;

/**
 * Created by cameronsima on 5/22/17.
 */
public class CurrencyConverter {

    public static double convert(Currency convertedFrom, Currency convertedTo, double amount) {
        double valueInUSD = amount * convertedTo.getToUSRate();
        double valueInConverted = valueInUSD * convertedFrom.getFromUSRate();
        return round(valueInConverted).doubleValue();
    }

    private static BigDecimal round(double sum) {
        BigDecimal dec = new BigDecimal(sum);
        return dec.setScale(2, BigDecimal.ROUND_HALF_EVEN);
    }
}
