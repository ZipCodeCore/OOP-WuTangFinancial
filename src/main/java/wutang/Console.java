package wutang;

import java.util.Scanner;

public class Console {

    public static Double getDoubleInput(String prompt){
        String userInputString;

        do {
            userInputString = getStringInput(prompt);
            try {
                Double userInputAsDouble = Double.parseDouble(userInputString);
                return userInputAsDouble;
            } catch (IllegalArgumentException iae){
                System.out.println("Please enter a valid number.");
                continue;
            }

        } while (true);
    } // end getDoubleInput method

    public static int getIntegerInput(String prompt) {

        return getDoubleInput(prompt).intValue();
    }

    public static String getStringInput(String prompt){
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        return userInput;
    }

}
