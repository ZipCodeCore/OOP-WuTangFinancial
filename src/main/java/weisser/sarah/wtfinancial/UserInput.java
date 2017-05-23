package weisser.sarah.wtfinancial;

import java.util.Scanner;

/**
 * Created by sarahweisser on 5/22/17.
 */
public class UserInput {
    private Currency convertFrom;
    private Currency convertTo;
    private double amountToConvert;
    private int choice;
    private int convertFromChoice;
    private int convertToChoice;
    private int counter = 0;

    public int askForConvertFromChoice() {
        System.out.println("What currency would you like to convert from?");
        convertFromChoice = getChoice();
        return convertFromChoice;
    }

    public int askForConvertToChoice() {
        System.out.println("What currency would you like to convert to?");
        convertToChoice = getChoice();
        return convertToChoice;
    }

    public int getChoice() {
        System.out.println(printChoice());
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt() - 1;
        while (((choice < 0) || (choice > 10)) && counter < 10) {
            System.out.println("That is not a valid option.");
            counter++;
            if (counter == 10) {

                choice = -1;
                return choice;

            }
            printChoice();
            choice = scanner.nextInt() - 1;
        }

        return choice;
    }

    public Currency setConvertFrom() {
        choice = askForConvertFromChoice();
        if (choice == -1) {
            return null;
        }
        CurrencyCreator creator = new CurrencyCreator();
        convertFrom = creator.setCurrency(choice);
        return convertFrom;
    }

    public Currency getConvertFrom() {
        return convertFrom;
    }

    public Currency setConvertTo() {
        choice = askForConvertToChoice();
        if (choice == -1) {
            return null;
        }
        CurrencyCreator creator = new CurrencyCreator();
        convertTo = creator.setCurrency(choice);
        return convertTo;
    }

    public Currency getConvertTo() {
        return convertTo;
    }

    public String printChoice() {
        String choiceString = "Please enter the number that corresponds to your choice:\n" + "(1) US Dollar\n" +
                "(2) Euro\n" +
                "(3) British Pound\n" +
                "(4) Indian Rupee\n" +
                "(5) Australian Dollar\n" +
                "(6) Canadian Dollar\n" +
                "(7) Singapore Dollar\n" +
                "(8) Swiss Franc\n" +
                "(9) Malaysian Ringgit\n" +
                "(10) Japanese Yen\n" +
                "(11) Chinese Yuan Renminbi";
        return choiceString;
    }

    public double setAmountToConvert() {
        System.out.println("How many units of the " + convertFrom + " would you like to exchange?");
        Scanner scanner = new Scanner(System.in);
        amountToConvert = scanner.nextDouble();
        if (amountToConvert <= 0) {
            System.out.println("Don't waste my time if you don't have any money.");
            amountToConvert = 0;
        }
        return amountToConvert;
    }

    public double getAmountToConvert() {
        return amountToConvert;
    }
}
