import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by aurorabanuelos on 5/22/17.
 */
public class Input {

    Scanner in = new Scanner(System.in);
    String continueOrExit;
    String currentCurrency;
    String foreignCurrency;
    double amountToBeConverted;


    public void print (){

        System.out.println("Currency Converter");
        System.out.println("Enter amount of currency to be converted: ");
        amountToBeConverted = in.nextDouble();
        System.out.println("Currency exchange rates available are USD, EUR, GBP, INR, AUD, CAD, SGD, CHF, MYR, JPY, CNY. Must be entered in CAPS");
        System.out.println("Enter current type of currency:");
        currentCurrency = in.next();
        while(Arrays.asList("USD", "EUR", "GBP", "INR", "AUD", "CAD", "SGD", "CHF", "MYR", "JPY", "CNY").contains(currentCurrency) != true) {
            System.out.println("Currency exchange rate not valid. Please reenter a valid exchange rate :");
            currentCurrency = in.next();
        }
        System.out.println("Enter currency to be converted to:");
        foreignCurrency = in.next();
        while(Arrays.asList("USD", "EUR", "GBP", "INR", "AUD", "CAD", "SGD", "CHF", "MYR", "JPY", "CNY").contains(foreignCurrency) != true ) {
            System.out.println("Currency exchange rate not valid. Please reenter a valid exchange rate :");
            foreignCurrency = in.next();
        }

    }

    public void continueUse() {

        System.out.println("Need to convert more currency ? Y/N");
        continueOrExit = in.next();
    }

}
