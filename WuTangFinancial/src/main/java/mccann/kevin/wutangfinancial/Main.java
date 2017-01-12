package mccann.kevin.wutangfinancial;

/**
 * Created by kevinmccann on 1/11/17.
 */
public class Main {

    public static void main(String args[]) {
    CurrencyConverter CC = new CurrencyConverter();
    double amount = 100;
    String inputCountry = "EUR";
    String outputCountry = "EUR";
    Currency fromCountry = CC.getCurrencyFromCode(inputCountry);
    Currency toCountry = CC.getCurrencyFromCode(outputCountry);
        Double convertedAmount = CC.convert(amount, fromCountry, toCountry);
        System.out.println(convertedAmount);
    }
}
