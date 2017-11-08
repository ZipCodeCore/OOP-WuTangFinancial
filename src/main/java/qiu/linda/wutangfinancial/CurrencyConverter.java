package qiu.linda.wutangfinancial;

public class CurrencyConverter {

    public static double convertCurrency(Currency countryFrom, Currency countryTo, double amount) {

  return countryFrom.toDollar(amount) * countryTo.getConversionRate();

}


}
