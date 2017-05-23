/**
 * Created by jarrydstamatelos on 5/22/17.
 */
public class Input {
//
//    public void getstartCurrency() {
//        Console.getDoubleInput("Select from the following options by number: \n" +
//                "(1) UsDollar \n" +
//                "(2) BritishPound \n" +
//                "(3) Indian Rupee \n" +
//                "(4) Aussie Dollar \n" +
//                "(5) Canada Dollar \n" +
//                "(6) Singapore Dollar \n" +
//                "(7) Swiss Franc \n" +
//                "(8) Ringgit \n" +
//                "(9) Yen \n" +
//                "(10) Yuan");
//
//    }


    public static void main(String[] args) {

        Currency wuTang = new Currency();

        Console.printDouble(wuTang.CurrencyConversion(Currency.USDOLLAR, Currency.AUSSIEDOLLAR));
        Console.printDouble(wuTang.CurrencyConversion(Currency.AUSSIEDOLLAR, Currency.SWISSFRANC));
        Console.printDouble(wuTang.CurrencyConversion(Currency.CHINESEYUAN, Currency.USDOLLAR));
        Console.printDouble(wuTang.CurrencyConversion(Currency.SWISSFRANC, Currency.RINGGIT));
        Console.printDouble(wuTang.CurrencyConversion(Currency.USDOLLAR, Currency.YEN));

    }

}
