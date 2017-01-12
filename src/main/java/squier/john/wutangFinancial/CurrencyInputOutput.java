package squier.john.wutangFinancial;

import java.util.Scanner;

/**
 * Created by johnsquier on 1/12/17.
 */
public class CurrencyInputOutput {

    private Scanner scanner = new Scanner(System.in);

    public String promptForInputCurrency() {
        System.out.print("Enter the currency type you have:");
        return scanner.nextLine();
    }

    public String promptForOutputCurrency() {
        System.out.print("Enter the currency type you desire:");
        return scanner.nextLine();
    }

    public Double promptForAmountToConvert() {
        System.out.print("Enter the amount of money you wish to convert:");
        return scanner.nextDouble();
    }

    public void displayResults(String inputCurrency, String outputCurrency, Double amountToExchange, Double result) {
        System.out.printf("\n%.2f %s is %.2f %s\n",
                amountToExchange, inputCurrency, result, outputCurrency);
        System.out.println("Remember to diversify your bonds");
    }

}
