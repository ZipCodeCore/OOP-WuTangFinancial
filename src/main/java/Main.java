public class Main {

    public static void main(String[] args) {
        Console console = new Console();
        CurrencyExchange currencyExchange = new CurrencyExchange();

        Currency base = console.getBaseCurrency();
        Currency returned = console.getReturnCurrency();
        Double amountToConvert = console.getAmountToConvert();

        System.out.println(currencyExchange.exchangeMoney(base, returned, amountToConvert));
    }

}
