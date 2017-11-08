import java.text.DecimalFormat;

class CurrencyExchange {

    double exchangeMoney(Currency currencyToExchange, Currency returnedCurrency, double amountToConvert){

        double rateOfCurrencyToExchange = currencyToExchange.getCurrencyRate();
        double rateOfReturnedCurrency = returnedCurrency.getCurrencyRate();
        double amountToReturn;

        amountToReturn = (rateOfReturnedCurrency * amountToConvert) / rateOfCurrencyToExchange;

        DecimalFormat decimalFormat = new DecimalFormat("###.##");
        amountToReturn = Double.parseDouble(decimalFormat.format(amountToReturn));

        return amountToReturn;
    }



}
