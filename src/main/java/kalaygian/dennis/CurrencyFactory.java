package kalaygian.dennis;

import kalaygian.dennis.typesofcurrency.*;

/**
 * Created by denniskalaygian on 5/22/17.
 */
public class CurrencyFactory {

    public static Currency createCurrency(String type, double amount) {

        Currency currency;

        switch(type.toLowerCase()) {

            case "dollar":
                currency = new Dollar(amount);
                break;

            case "euro":
                currency = new Euro(amount);
                break;

            case "british pound":
                currency = new BritishPound(amount);
                break;

            case "indian rupee":
                currency = new IndianRupee(amount);
                break;

            case "australian dollar":
                currency = new AustralianDollar(amount);
                break;

            case "canadian dollar":
                currency = new CanadianDollar(amount);
                break;

            case "singapore dollar":
                currency = new SingaporeDollar(amount);
                break;

            case "swiss franc":
                currency = new SwissFranc(amount);
                break;

            case "malaysian ringgit":
                currency = new MalaysianRinggit(amount);
                break;

            case "japanese yen":
                currency = new JapaneseYen(amount);
                break;

            case "chinese yuan renminbi":
                currency = new ChineseYuanRenminbi(amount);
                break;

            default:
                currency = new Dollar(amount);

        }

        return currency;
    }
}
