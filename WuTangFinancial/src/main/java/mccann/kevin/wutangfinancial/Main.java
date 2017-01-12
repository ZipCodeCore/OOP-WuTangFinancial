package mccann.kevin.wutangfinancial;

/**
 * Created by kevinmccann on 1/11/17.
 */
public class Main {

    public static void main(String args[]) {
    CurrencyConverter CC = new CurrencyConverter();
    UserInput UI = new UserInput();
    UI.getUserInput();
    Double fromCountry = CC.getRateFromCode(UI.getInputCountry());
    Double toCountry = CC.getRateFromCode(UI.getOutputCountry());
    Double convertedAmount = CC.convert(UI.getAmount(), fromCountry, toCountry);
    System.out.println(convertedAmount);
    }
}
