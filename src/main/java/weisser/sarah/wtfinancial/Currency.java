package weisser.sarah.wtfinancial;

/**
 * Created by sarahweisser on 5/22/17.
 */
public enum Currency {
    US_DOLLAR (100),
    EURO (94),
    BRITISH_POUND (82),
    INDIAN_RUPEE (6832),
    AUSTRALIAN_DOLLAR (135),
    CANADIAN_DOLLAR (132),
    SINGAPORE_DOLLAR (143),
    SWISS_FRANC (101),
    MALAYSIAN_RINGGIT (447),
    JAPANESE_YEN (11584),
    CHINESE_YUAN_RENMINBI (692);

    double rate;

    Currency(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return this.rate;
    }
}
