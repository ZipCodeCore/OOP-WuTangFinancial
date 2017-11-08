package io.zipcoder.herion;

import java.util.Scanner;

public class Console {

    private Scanner scanner1 = new Scanner(System.in);

    private String chooseInitialCurrency() {
        String Msg1 =
                "______________________________________________________________\n" +
                "\nWelcome to the Wu Tang Financial Currency Exchange tool. \n" +
                "Choose the number " +
                "associated with the currency you \n" +
                "will be converting from?" +
                "\n______________________________________________________________\n\n";

        return Msg1;
    }

    private String userCurrencySelector() {
        String Msg2 =
                "0 - US Dollar\n" +
                "1 - Euro\n" +
                "2 - British Pound\n" +
                "3 - Indian Rupee\n" +
                "4 - Australian Dollar\n" +
                "5 - Canadian Dollar\n" +
                "6 - Singapore Dollar\n" +
                "7 - Swiss Frank\n" +
                "8 - Malaysian Ringgit\n" +
                "9 - Japanese Yen\n" +
                "10 - Chinese Yuan Renminbi\n" +
                "\n______________________________________________________________\n\n";

        return Msg2;

    }

    public void printChooseInitialCurrencyAndUserCurrencySelector(){

        System.out.println(chooseInitialCurrency()+userCurrencySelector());
    }

    private int initialCurrency = scanner1.nextInt();
    private Scanner scanner2 = new Scanner(System.in);


    private String chooseAmount() {
        String Msg3 =
                "How much money will you be converting today?\n";

        return Msg3;

    }

    public void printChooseAmount(){

        System.out.println(chooseAmount());
    }

    private double moneyInput = scanner2.nextDouble();
    private Scanner scanner3 = new Scanner(System.in);


    private String chooseTargetCurrency(){
        String Msg4 =
                "______________________________________________________________\n" +
                "Now select the number associated with the currency you will be converting to.\n" +
                "\n______________________________________________________________\n\n";

        return Msg4;

    }

    public void printChooseTargetCurrencyAndUserCurrencySelector(){

        System.out.println(chooseTargetCurrency()+userCurrencySelector());
    }

    private int targetCurrency = scanner3.nextInt();


    public double userChoicesCalc() {

        Conversion_Logic converted = new Conversion_Logic();
        converted.exchange(initialCurrency, targetCurrency);

        Currency_Rate currency_rate = Currency_Rate.values()[0];
        double baseCalc = initialCurrency / currency_rate.getDollarStandard() * targetCurrency;
        double rawDouble = baseCalc * moneyInput;
        double truncatedDouble = Math.floor(rawDouble * 100) / 100;
        return truncatedDouble;

    }

}


















