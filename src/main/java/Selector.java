

import java.util.Scanner;

public class Selector extends Currencies{
    private static Scanner firstCurrency = new Scanner(System.in);
    private static int firstCurrencyInput;
    private static double firstCurrencyRate;
    private static double secondCurrencyRate;
    private static Scanner secondCurrencySelection = new Scanner(System.in);
    private static int secondCurrencyInput;
    private static Scanner valueToBeConverted = new Scanner(System.in);
    private static double valueToBeConvertedInput;

    public static void InitialCurrencySelector(){
        System.out.println("Please make a selection for your initial currency: \n" +
                "1 for USDollar\n" +
                "2 for Euro\n" +
                "3 for British Pound\n" +
                "4 for Indian Rupee\n" +
                "5 for Australian Dollar\n" +
                "6 for Canadian Dollar\n" +
                "7 for Singapore Dollar\n" +
                "8 for Swiss Franc\n" +
                "9 for Malaysian Ringgit\n" +
                "10 for Japanese Yen\n" +
                "11 for Chinese Yuan Renminbi");
        firstCurrencyInput = firstCurrency.nextInt();
        firstCurrencyAnswer(firstCurrencyInput);

    }

    public static void  firstCurrencyAnswer(Integer firstCurrencyInput) {
        switch (firstCurrencyInput) {
            case 1:
                firstCurrencyRate = usDollar;
                break;
            case 2:
                firstCurrencyRate = euro;
                break;
            case 3:
                firstCurrencyRate = britishPound;
                break;
            case 4:
                firstCurrencyRate = indianRupee;
                break;
            case 5:
                firstCurrencyRate = australianDollar;
                break;
            case 6:
                firstCurrencyRate = canadianDollar;
                break;
            case 7:
                firstCurrencyRate = singaporeDollar;
                break;
            case 8:
                firstCurrencyRate = swissFranc;
                break;
            case 9:
                firstCurrencyRate = malaysianRinggit;
                break;
            case 10:
                firstCurrencyRate = japaneseYen;
                break;
            case 11:
                firstCurrencyRate = chineseYuanRenminbi;
                break;
            default:
                System.out.println("Your selection did not match an option.");
                break;

        }
    }

    public static void SecondCurrencySelector() {
        System.out.println("Please make a selection for the currency you would like to convert to: \n" +
                "1 for USDollar\n" +
                "2 for Euro\n" +
                "3 for British Pound\n" +
                "4 for Indian Rupee\n" +
                "5 for Australian Dollar\n" +
                "6 for Canadian Dollar\n" +
                "7 for Singapore Dollar\n" +
                "8 for Swiss Franc\n" +
                "9 for Malaysian Ringgit\n" +
                "10 for Japanese Yen\n" +
                "11 for Chinese Yuan Renminbi");
        secondCurrencyInput = secondCurrencySelection.nextInt();
        SecondCurrencyAnswer(secondCurrencyInput);

    }

    public static void  SecondCurrencyAnswer(Integer secondCurrencyInput) {
        switch (secondCurrencyInput) {
            case 1:
                secondCurrencyRate = usDollar;
                break;
            case 2:
                secondCurrencyRate = euro;
                break;
            case 3:
                secondCurrencyRate = britishPound;
                break;
            case 4:
                secondCurrencyRate = indianRupee;
                break;
            case 5:
                secondCurrencyRate = australianDollar;
                break;
            case 6:
                secondCurrencyRate = canadianDollar;
                break;
            case 7:
                secondCurrencyRate = singaporeDollar;
                break;
            case 8:
                secondCurrencyRate = swissFranc;
                break;
            case 9:
                secondCurrencyRate = malaysianRinggit;
                break;
            case 10:
                secondCurrencyRate = japaneseYen;
                break;
            case 11:
                secondCurrencyRate = chineseYuanRenminbi;
                break;
            default:
                System.out.println("Your selection did not match an option.");
                break;

        }

    }

    public static void CurrencyAmout() {
        System.out.println("Please enter the amount you with to sonvert:");
        valueToBeConvertedInput =valueToBeConverted.nextDouble();
    }

    public static void ConvertCurrencies() {
        double convertedValue = (valueToBeConvertedInput/firstCurrencyRate) * secondCurrencyRate;
        if (firstCurrencyRate == secondCurrencyRate) {
            System.out.println("Those are the same currencies!");
        }else {
            System.out.printf("%.2f converted is equal to %.2f", valueToBeConvertedInput, convertedValue);
        }
    }
}
