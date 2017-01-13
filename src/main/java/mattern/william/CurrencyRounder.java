package mattern.william;

import java.math.BigDecimal;

/**
 * Created by williammattern on 1/13/17.
 */
public class CurrencyRounder {
    BigDecimal bd = new BigDecimal(0);

    public static double round(double value, int places) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, BigDecimal.ROUND_HALF_UP);
        return bd.doubleValue();
    }
}
