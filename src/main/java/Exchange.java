import java.math.BigDecimal;

public class Exchange {
    private float amount;
    public static final float US_DOLLAR = 1.00f;
    public static final float EURO = 0.94f;
    public static final float BRITISH_POUND = 0.82f;
    public static final float INDIAN_RUPEE = 68.32f;
    public static final float AUTRALIAN_DOLLAR = 1.35f;
    public static final float CANADIAN_DOLLAR = 1.32f;
    public static final float SINGAPORE_DOLLAR = 1.43f;
    public static final float Swiss_FRANC = 1.01f;
    public static final float MALAYSIAN_RINGGIT = 4.47f;
    public static final float JAPANESE_YEN = 115.84f;
    public static final float CHINESE_YUAN_RENMINBI = 6.92f;

    public Exchange(float amount) {
        this.amount = amount;
    }

    /**
     *
     * @param amountFrom
     * @param currencyFrom
     * @param currencyTo
     * @return
     */
    public float conversion(float amountFrom, float currencyFrom, float currencyTo) {
        float cleanMoney = currencyTo * (amountFrom / currencyFrom);
        return cleanMoney;
    }

    public void printConvertedMoney(float money) {

        String s = String.format("%.2f", money);
        System.out.println(s);
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}

