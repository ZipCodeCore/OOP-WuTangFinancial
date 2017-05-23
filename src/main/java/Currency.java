

/**
 * Created by cameronsima on 5/22/17.
 */
public enum Currency {

    US_DOLLAR (1),
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

    private final double toUSRate;

    Currency(double toUSRate) {
        this.toUSRate = toUSRate;
    }

    public double getToUSRate() {
        return toUSRate;
    }

    public double getFromUSRate() {
        return 1 / toUSRate;
    }
}



