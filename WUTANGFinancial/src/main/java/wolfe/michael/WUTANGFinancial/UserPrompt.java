package wolfe.michael.WUTANGFinancial;

import java.util.Scanner;

/**
 * Created by michaelwolfe on 1/12/17.
 */
public class UserPrompt extends ExchangeRateRetriever {

    public static void prompt(){
        CalculateExchange calc = new CalculateExchange();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the 3 character country code of a currency you would like to convert:");
        Double convertFrom = retrieveRate(keyboard.next());
        System.out.print("Enter the 3 character country code of a currency you would like to convert to:");
        Double convertTo = retrieveRate(keyboard.next());
        System.out.print("Enter the amount of money you would like to convert:");
        Double amount = keyboard.nextDouble();
        System.out.println(calc.exchange(convertFrom, convertTo, amount));
        System.out.println("Congratulations! You have successfully diversified your BONDS!");
    }
}
