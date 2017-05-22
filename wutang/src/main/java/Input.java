/**
 * Created by jarrydstamatelos on 5/22/17.
 */
public class Input {
    public static void main(String[] args) {

        Currency wuTang = new Currency();
        Console.printDouble(wuTang.CurrencyConversion(Currency.USDOLLAR, Currency.AUSSIEDOLLAR));
        Console.printDouble(wuTang.CurrencyConversion(Currency.AUSSIEDOLLAR, Currency.SWISSFRANC));
        Console.printDouble(wuTang.CurrencyConversion(Currency.CHINESEYUAN, Currency.USDOLLAR));

    }

}
