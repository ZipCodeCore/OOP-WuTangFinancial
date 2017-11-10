package kozulak.elliott;

import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Console {
    public static String getStringInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        String userInuput = sc.nextLine();
        return userInuput.toUpperCase();
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

    public static String currencyInput(String prompt) {
        do {
            String currency;
            try {
                String userInput = getStringInput(prompt).toUpperCase();
                if (userInput.length() < 4)
                    currency = Stream.of(CurrencyNames.values()).map(CurrencyNames::getAbbreviation).filter(s -> s.equalsIgnoreCase(userInput)).collect(Collectors.joining());
                else currency = CurrencyNames.valueOf(userInput.replace(" ", "_")).getAbbreviation();
                if (currency.isEmpty())
                    throw (new IllegalArgumentException());
                return currency;
            } catch (IllegalArgumentException iae) {
                continue;
            }
        } while (true);
    }
}
