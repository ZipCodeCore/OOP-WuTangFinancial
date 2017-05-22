package mccann.kevin.wutangfinancial;

import java.util.Scanner;

/**
 * Created by kevinmccann on 1/12/17.
 */
public class UserInput {
    Scanner scanner = new Scanner(System.in);
    Display printer = new Display();
    int amount;
    String inputCountry, outputCountry;

    public void getUserInput() {
        printer.print("What amount needs to be converted?");
        amount = scanner.nextInt();
        printer.print("What currency is the amount in?");
        scanner.nextLine();
        inputCountry = scanner.nextLine();
        printer.print("What currency would you like to convert it to?");
        outputCountry = scanner.nextLine();
    }

    public int getAmount(){
        return this.amount;
    }

    public String getInputCountry() {
        return inputCountry;
    }

    public String getOutputCountry() {
        return outputCountry;
    }
}
