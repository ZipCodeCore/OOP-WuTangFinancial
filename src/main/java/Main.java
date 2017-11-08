public class Main {

    public static void main(String[] args) {
        Console console = new Console();
        CurrencyExchange currencyExchange = new CurrencyExchange();

        Currency base = console.getBaseCurrency();
        Currency returned = console.getReturnCurrency();
        Double amountToConvert = console.getAmountToConvert();

        Double amountToReturn = currencyExchange.exchangeMoney(base, returned, amountToConvert);

        console.returnMoneyStatement(base, returned, amountToConvert, amountToReturn);
    }

}
