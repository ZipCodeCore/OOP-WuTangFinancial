package kozulak.elliott;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Currency[] currencies = Currency.values();
        String repeat="yes";

        do {
            for (int i = 0; i < currencies.length; i++) {
                System.out.print("{" + currencies[i] + "} ");
                if (i == 6)
                    System.out.println("");
            }


            Currency currencyFrom = Console.enumInput("\n\nEnter the currency your money is in: ");
            Double amount = Console.doubleInput("Enter the amount to convert");
            Currency currencyTo = Console.enumInput("Enter the currency to convert to: ");

            double convertedAmount = Converter.convertCurency(currencyFrom, currencyTo, amount);

            System.out.println("You have converted " + amount + " " + currencyFrom + " to " + convertedAmount + " " + currencyTo + "(s)");
            repeat= Console.getStringInput("Would you like to convert more money?");
        }while(!"no".equalsIgnoreCase(repeat));

    }

}
