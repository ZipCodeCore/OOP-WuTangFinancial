import java.awt.*;
import java.text.DecimalFormat;
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
        Currency currencyType;
        switch (currencyOption){
            case "1": currencyType = Currency.UsDollar;
                    break;
            case "2": currencyType = Currency.Euro;
                    break;
            case "3": currencyType = Currency.BritishPound;
                    break;
            case "4": currencyType = Currency.IndianRupee;
                    break;
            case "5": currencyType = Currency.AustralianDollar;
                    break;
            case "6": currencyType = Currency.CanadianDollar;
                    break;
            case "7": currencyType = Currency.SingaporeDollar;
                    break;
            case "8": currencyType = Currency.SwissFranc;
                    break;
            case "9": currencyType = Currency.MalaysianRinggit;
                    break;
            case "10": currencyType = Currency.JapaneseYen;
                     break;
            case "11": currencyType = Currency.ChineseYuanRenminbi;
                     break;
            default: currencyType = null;
                System.out.println("Invalid input. Please enter the number associated with your currency");
                     break;
        }
        return currencyType;
    }


    public double getAmountToConvert(){
        try {
            double amountToConvert = getDoubleInput("How much would you like to convert?");
            DecimalFormat decimalFormat = new DecimalFormat("###.##");
            amountToConvert = Double.parseDouble(decimalFormat.format(amountToConvert));
            return amountToConvert;
        }
        catch (NumberFormatException nfe) {
            return getAmountToConvert();
        }
    }

    public void returnMoneyStatement(Currency baseCurrency, Currency returnedCurrency, String formattedAmountToExchange, String formattedAmountToReturn){
        System.out.println("Here's " + formattedAmountToReturn + " " + returnedCurrency + " for your " + formattedAmountToExchange + " " + baseCurrency);
    }


}
