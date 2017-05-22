package weisser.sarah.wtfinancial;

import java.util.Scanner;

/**
 * Created by sarahweisser on 5/22/17.
 */
public class UserInput {
    private Currency convertFrom;
    private Currency convertTo;
    private long amountToConvert;
    private int choice;
    private int counter = 0;

    public int askForConvertFrom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What currency would you like to convert from?");
        askForChoice();
        int choice = scanner.nextInt() - 1;
        while (((choice < 0) || (choice > 10)) && counter < 10) {
            System.out.println("That is not a valid option.");
            counter++;
            if (counter == 10) {

                choice = -1;
                return choice;

            }
            askForChoice();
            choice = scanner.nextInt() - 1;



        }

        return choice;
    }

    public Currency setConvertFrom() {
        choice = askForConvertFrom();
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

    public void askForChoice() {
        System.out.println("Please enter the number that corresponds to your choice:");
        System.out.print("(1) US Dollar\n" +
                "(2) Euro\n" +
                "(3) British Pound\n" +
                "(4) Indian Rupee\n" +
                "(5) Australian Dollar\n" +
                "(6) Canadian Dollar\n" +
                "(7) Singapore Dollar\n" +
                "(8) Swiss Franc\n" +
                "(9) Malaysian Ringgit\n" +
                "(10) Japanese Yen\n" +
                "(11) Chinese Yuan Renminbi\n");
    }
}
