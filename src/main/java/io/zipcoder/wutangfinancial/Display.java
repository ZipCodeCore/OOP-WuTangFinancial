package io.zipcoder.wutangfinancial;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Display {

    public Display(){}

    private static NumberFormat formatter = new DecimalFormat("#0.00");
    private static Scanner sc = new Scanner(System.in);
    private static ConversionRates[] currencyGiven = ConversionRates.values();
    String formattedUserAmount;
    String formattedConvertedAmount;

    public static void print(String input) {
        System.out.println(input);
    }

    public static ConversionRates getCurrencySelection(String prompt) {
        System.out.println(prompt);
        int choice = sc.nextInt() - 1;
        return ConversionRates.values()[choice];
    }

    public static double getDouble(String prompt) {
        do {
            try {
                sc = new Scanner(System.in);
                System.out.println(prompt);
                return sc.nextDouble();
            } catch (InputMismatchException e) {
                Display.print("Please enter a number.");
                continue;
            }
        }while (true);
    }

    public static void printCurrencies(){
        int i = 0;
        for(ConversionRates m: currencyGiven)
        {
            String currencyName = ConversionRates.values()[i].getName();
            System.out.printf("%d) " + currencyName + "%n", m.ordinal() + 1, m);
            i++;
        }
    }

    public static boolean anotherConversion() {

        do {
        System.out.println("Would you like to perform another conversion? (Yes/No)");
        String answer = sc.nextLine();

            if("YES".equalsIgnoreCase(answer)){
                return true;
            }
            else if("NO".equalsIgnoreCase(answer)){
                return false;
            }
            else{
                Display.print("ERROR: PLEASE INPUT YES OR NO!");
            }
        }while(true);
    }

    public String formatUserAmount(double userAmount){
        formattedUserAmount = formatter.format(userAmount);
        return formattedUserAmount;
    }

    public String formatConvertedAmount(double convertedAmount){
        formattedConvertedAmount = formatter.format(convertedAmount);
        return formattedConvertedAmount;
    }

    public void printConversion(double userAmount, double convertedAmount, ConversionRates in, ConversionRates out){
        String roundedUserAmount = formatUserAmount(userAmount);
        String roundedConvertedAmount = formatConvertedAmount(convertedAmount);

        System.out.println(roundedUserAmount + " " + in.getName() + " is equal to " + roundedConvertedAmount + " " + out.getName());
    }
}
