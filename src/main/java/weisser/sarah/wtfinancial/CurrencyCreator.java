package weisser.sarah.wtfinancial;

/**
 * Created by sarahweisser on 5/22/17.
 */
public class CurrencyCreator {
    private int choice;
    private Currency currency = null;

    public CurrencyCreator() {

    }

    public Currency setCurrency(int choice) {
        switch (choice) {
            case 0:
                currency = Currency.US_DOLLAR;
                break;
            case 1:
                currency = Currency.EURO;
                break;
            case 2:
                currency = Currency.BRITISH_POUND;
                break;
            case 3:
                currency = Currency.INDIAN_RUPEE;
                break;
            case 4:
                currency = Currency.AUSTRALIAN_DOLLAR;
                break;
            case 5:
                currency = Currency.CANADIAN_DOLLAR;
                break;
            case 6:
                currency = Currency.SINGAPORE_DOLLAR;
                break;
            case 7:
                currency = Currency.SWISS_FRANC;
                break;
            case 8:
                currency = Currency.MALAYSIAN_RINGGIT;
                break;
            case 9:
                currency = Currency.JAPANESE_YEN;
                break;
            case 10:
                currency = Currency.CHINESE_YUAN_RENMINBI;
                break;

        }
        return currency;
    }
    public Currency getCurrency() {
        return currency;
    }
}
