package zygmundfelt.dan.wutangfinancial;

public class CurrencyConverter {

    public enum ConversionRate {
        US_DOLLAR (1.00),
        EURO (0.94),
        BRITISH_POUND (0.82),
        INDIAN_RUPEE (68.32),
        AUSTRALIAN_DOLLAR (1.35),
        CANADIAN_DOLLAR (1.32),
        SINGAPORE_DOLLAR (1.43),
        SWISS_FRANC (1.01),
        MALAYSIAN_RINGGIT (4.47),
        JAPANESE_YEN (115.84),
        CHINESE_YUAN_RENMINBI (6.92);

        private double rate;

        ConversionRate(double rate) {
            this.rate = rate;
        }

        public double getRate() {
            return rate;
        }
    }

    private double ratio;

    CurrencyConverter(ConversionRate initialCurrency, ConversionRate finalCurrency) {
        ratio = finalCurrency.getRate() / initialCurrency.getRate();
    }

    long convert(long initialAmount) {
        double unrounded = ratio * initialAmount;
        return Math.round(unrounded);
    }
}
