import java.awt.*;
import java.util.Scanner;

public class Console {

    public String getStringInput(String prompt){
        System.out.println(prompt);
        Menu.printCurrencyOptions();
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
        Currency currencyEnum = null;
        String currencyType;
        while (currencyEnum == null) {
            currencyType = getStringInput("What currency would you like to exchange?");
            currencyEnum = verifyCurrency(currencyType);
        }
        return currencyEnum;
    }

    public Currency getReturnCurrency(){
        Currency currencyEnum = null;
        String currencyType;
        while (currencyEnum == null){
            currencyType = getStringInput("What currency would you like to receive?");
            currencyEnum = verifyCurrency(currencyType);
        }
        return currencyEnum;
    }

    public Currency verifyCurrency(String currencyOption){
        Currency currency;
        switch (currencyOption){
            case "1": currency = Currency.UsDollar;
                    break;
            case "2": currency = Currency.Euro;
                    break;
            case "3": currency = Currency.BritishPound;
                    break;
            case "4": currency = Currency.IndianRupee;
                    break;
            case "5": currency = Currency.AustralianDollar;
                    break;
            case "6": currency = Currency.CanadianDollar;
                    break;
            case "7": currency = Currency.SingaporeDollar;
                    break;
            case "8": currency = Currency.SwissFranc;
                    break;
            case "9": currency = Currency.MalaysianRinggit;
                    break;
            case "10": currency = Currency.JapaneseYen;
                     break;
            case "11": currency = Currency.ChineseYuanRenminbi;
                     break;
            default: currency = null;
                System.out.println("Invalid input. Please enter the number associated with your currency");
                     break;
        }
        return currency;
    }


    public double getAmountToConvert(){
        try {
            double amountToConvert = getDoubleInput("How much would you like to convert?");
            return amountToConvert;
        }
        catch (NumberFormatException nfe) {
            return getAmountToConvert();
        }
    }


}
