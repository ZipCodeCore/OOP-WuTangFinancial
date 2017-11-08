package susnick_andrea_exchangeRateLab;

import java.util.Scanner;

public class Console {

     public static Double getDoubleUserInput(String prompt){
         String userInputString;

         do {
             userInputString = getStringUserInput(prompt);
             try {
                 Double userInputAsDouble = Double.parseDouble(userInputString);
                 return userInputAsDouble;
             }catch (IllegalArgumentException iae){
                 System.out.println("Please enter a valid number.");
             }
         }while(true);
    }

    public static String getStringUserInput(String prompt){
         System.out.println(prompt);
         Scanner scanner = new Scanner(System.in);
         String userInput = scanner.nextLine();
         return userInput;
    }

    public static Currency getCurrencyUserInput(String prompt){
        System.out.println(prompt);
        for(Currency a : Currency.values()) {
            System.out.print(a.toString() + "  ");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        Currency userInput = Currency.valueOf(scanner.nextLine());
        return userInput;
    }
}
