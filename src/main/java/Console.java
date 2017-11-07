import java.awt.*;
import java.util.Scanner;

public class Console {

    public String getStringInput(String prompt){
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public double getDoubleInput(String prompt){
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        Double doubleInput = Double.parseDouble(scanner.nextLine());
        return doubleInput;
    }

    public Currency getBaseCurrency(){
        boolean isValidCurrency = false;
        String currencyType = "";
        while (isValidCurrency == false){
            currencyType = getStringInput("What currency would you like to exchange?");
            isValidCurrency = verifyCurrency(currencyType);
        }
        Currency currencyEnum = Currency.valueOf(currencyType);
        return currencyEnum;
    }

    public boolean verifyCurrency(String currency){
        for (Currency c : Currency.values()) {
            if (c.name().equalsIgnoreCase(currency)) {
                return true;
            }
        }
        return false;
    }

    public Currency getReturnCurrency(){
        boolean isValidCurrency = false;
        String currencyType = "";
        while (isValidCurrency == false){
            currencyType = getStringInput("What currency would you like to receive?");
            isValidCurrency = verifyCurrency(currencyType);
        }
        Currency currencyEnum = Currency.valueOf(currencyType);
        return currencyEnum;
    }

    public double getAmountToConvert(){
        double amountToConvert = getDoubleInput("How much would you like to convert?");
        return amountToConvert;
    }

}
