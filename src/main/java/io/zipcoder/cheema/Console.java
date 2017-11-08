package io.zipcoder.cheema;

import java.util.Scanner;

public class Console {


    private Scanner scanner = new Scanner(System.in);

    private int initialCurrency;
    private double moneyInput;
    private int targetCurrency;

    private String chooseInitialCurrency =
            "______________________________________________________________\n" +
                    "\nWelcome to the Wu Tang Financial Currency Exchange tool. \n" +
                    "Choose the number " +
                    "associated with the currency you \n" +
                    "will be converting from?" +
                    "\n______________________________________________________________\n\n";

    private String userCurrencySelector =
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

    private String chooseAmount =
            "How much money will you be converting today?\n";


    private String chooseTargetCurrency =
            "______________________________________________________________\n" +
                    "Now select the number associated with the currency you will be converting to.\n" +
                    "\n______________________________________________________________\n\n";

    private String userFirstInput(){

        return chooseInitialCurrency + userCurrencySelector;
    }

    private String userSecondInput(){

        return chooseAmount;
    }

    private String userThirdInput(){

        return chooseTargetCurrency + userCurrencySelector;
    }

    void collectiveUserInputs(){

        System.out.println(userFirstInput());
        initialCurrency = scanner.nextInt();
        System.out.println(userSecondInput());
        moneyInput = scanner.nextDouble();
        System.out.println(userThirdInput());
        targetCurrency = scanner.nextInt();
    }

    void userChoicesCalc() {

        double initialRate = CurrencyRate.values()[initialCurrency].getDollarStandard();
        double targetRate = CurrencyRate.values()[targetCurrency].getDollarStandard();

        double baseCalc = targetRate / initialRate;
        double rawDouble = baseCalc * moneyInput;
        double truncatedDouble = Math.floor(rawDouble * 100) / 100;
        System.out.println(truncatedDouble);

    }

}




