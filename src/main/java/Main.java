public class Main {

    public static void main(String[] args) {
        Console console = new Console();
        CurrencyExchange currencyExchange = new CurrencyExchange();
        CurrencyFormatter currencyFormatter = new CurrencyFormatter();

        Currency base = console.getBaseCurrency();
        Currency returned = console.getReturnCurrency();
        Double amountToConvert = console.getAmountToConvert();

        Double amountToReturn = currencyExchange.exchangeMoney(base, returned, amountToConvert);

        String formattedAmountToReturn = currencyFormatter.formatCurrencySymbol(amountToReturn, returned);
        String formattedAmountToConvert = currencyFormatter.formatCurrencySymbol(amountToConvert, base);

        console.returnMoneyStatement(base, returned, formattedAmountToConvert, formattedAmountToReturn);
    }

}
