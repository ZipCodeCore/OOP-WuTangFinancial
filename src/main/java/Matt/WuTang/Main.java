package Matt.WuTang;

/**
 * Created by mattwu on 5/23/17.
 */
public class Main {

    public static void main(String[] args) {

        CurrencyConverter currency = new CurrencyConverter();
        System.out.println(currency.exchange(-1, Currency.chineseYuan, Currency.usDollar));
        System.out.println(currency.exchange(500, Currency.usDollar, Currency.britishPound));

    }
}
