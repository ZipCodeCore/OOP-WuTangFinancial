/**
 * Created by brianmullin on 5/22/17.
 */

import java.util.Scanner;

public class AppCurrency {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        System.out.println("Welcome to Wu Tang Financial's Official Currency Conversion Calculator powered by WorldStarHipHop's Java Engine\n");
        System.out.println("Here is a list of the currencies that are supported by this app:\n\n" +
                            "Ticker Symbol | Currency\n" +
                            "USD | US Dollar\n" +
                            "EUR | Euro\n" +
                            "GBP | British Pound\n" +
                            "AUD | Australian Dollar\n" +
                            "INR | Indian Rupee\n" +
                            "CAD | Canadian Dollar\n" +
                            "SGD | Singapore Dollar\n" +
                            "CHF | Swiss Franc\n" +
                            "MYR | Malaysian Ringgit\n" +
                            "JPY | Japanese Yen\n" +
                            "CNY | Chinese Yuan/Renminbi\n" +
                            "BTC | Bitcoin\n" +
                            "ETH | Ethereum\n");
        System.out.println("Enter the ticker symbol of the currency you wish to convert from: ");
        String firstCountry = input.next();
        System.out.println("Enter amount of " + firstCountry.toUpperCase() + ":");
        double amountEntered = input.nextDouble();
        System.out.println("Enter the ticker symbol of the currency you wish to convert to: ");
        String secondCountry = input.next();


        System.out.println("The converted amount from " + firstCountry.toUpperCase() + " to " + secondCountry.toUpperCase() + " is:");
        System.out.println(converter.convertTo(firstCountry.toUpperCase(), secondCountry.toUpperCase(), amountEntered));


    }
}
