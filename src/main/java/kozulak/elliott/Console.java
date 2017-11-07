package kozulak.elliott;

import java.util.Scanner;

public class Console {
    public static String getStringInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        String userInuput = sc.nextLine();
        return userInuput;
    }


    public static Double doubleInput(String prompt) {
        do {
            try {
                String userInput = getStringInput(prompt);
                Double intUserInput = Double.parseDouble(userInput);
                return intUserInput;
            } catch (IllegalArgumentException iae) {
                continue;
            }
        } while (true);
    }

    public static Currency enumInput(String prompt) {
        do {
            try {
                String userInput = getStringInput(prompt).toUpperCase();
                Currency enumUserInput = Currency.valueOf(userInput.replace(" ","_"));
                return enumUserInput;
            } catch (IllegalArgumentException iae) {
                continue;
            }
        } while (true);
    }
}
