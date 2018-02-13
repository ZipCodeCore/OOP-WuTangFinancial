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

        private Currency(float rate) {
            this.rate = rate;
        }

        public float getRate() {
            return rate;
        }
    }

    public static float convertToUSD(float amount, Currency cur) {
        return 0.0f;
    }

    public static float convertFromUSD(float amount, Currency cur) {
        return 0.0f;
    }

    public static float convertForeign(float amount, Currency source, Currency target) {
        return 0.0f;
    }
}
