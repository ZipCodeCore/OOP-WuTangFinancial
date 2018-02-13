import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * filename:
 * project: wu-tang-financial
 * author: https://github.com/vvmk
 * date: 2/13/18
 */
public class CurrencyConverter {
    public enum Currency {
        EUR(.94f),
        GBP(.82f),
        INR(68.32f),
        AUD(1.35f),
        CAD(1.32f),
        SGD(1.43f),
        CHF(1.01f),
        MYR(4.47f),
        JPY(115.84f),
        CNH(6.92f);

        private final float rate;

        Currency(float rate) {
            this.rate = rate;
        }

        public float getRate() {
            return rate;
        }
    }

    public static float convertToUSD(float amount, Currency cur) {
        return siphon(amount / cur.getRate());
    }

    public static float convertFromUSD(float amount, Currency cur) {
        return siphon(amount * cur.getRate());
    }

    public static float convertForeign(float amount, Currency source, Currency target) {
        return siphon(convertFromUSD(convertToUSD(amount, source), target));
    }

    private static float siphon(float c) {
        BigDecimal bigDec = new BigDecimal(Float.toString(c));
        bigDec = bigDec.setScale(2, RoundingMode.HALF_UP);
        return bigDec.floatValue();
    }
}
