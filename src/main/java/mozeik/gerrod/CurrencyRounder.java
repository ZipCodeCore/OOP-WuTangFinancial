package mozeik.gerrod;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by gerrodmozeik on 1/13/17.
 */
public class CurrencyRounder {

    double convertedUnroundedMoney;
    Double convertedRoundedMoney;
    int decimalPlaces;
    BigDecimal bd = new BigDecimal(0);

    public static double round(double value, int places) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }


}
