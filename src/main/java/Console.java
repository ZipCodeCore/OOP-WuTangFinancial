import java.lang.*;
import java.util.Scanner;

public class Console {

    public void startMainMenu() {
        System.out.print(
                "**************** [Welcome to Currency Converter!] ******************\n" +
                        "Below are the currency choices you can convert from: \n" +
                        "[USD] [EURO] [POUND] [RUPEE] [AUSTRALIAN DOLLAR] [CANADIAN DOLLAR]\n" +
                        "[SINGAPORE DOLLAR] [FRANC] [RINGGIT] [YEN] [YUAN REMINBI]\n" +
                        "*********************** [Type EXIT to exit] ************************\n");
    }

    public static String getStringInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        String userInput = sc.nextLine();
        return userInput;
    }

    public ExchangeRates getExchangeType(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        String userInput = sc.next();
        ExchangeRates exchangeRates = ExchangeRates.valueOf(userInput.toUpperCase());
        switch (exchangeRates) {
            case USD:
                return ExchangeRates.USD;
            case EURO:
                return ExchangeRates.EURO;
            case POUND:
                return ExchangeRates.POUND;
            case RUPEE:
                return ExchangeRates.RUPEE;
            case AUSTRALIANDOLLAR:
                return ExchangeRates.AUSTRALIANDOLLAR;
            case CANADIANDOLLAR:
                return ExchangeRates.CANADIANDOLLAR;
            case SINGAPOREDOLLAR:
                return ExchangeRates.SINGAPOREDOLLAR;
            case FRANC:
                return ExchangeRates.FRANC;
            case RINGGIT:
                return ExchangeRates.RINGGIT;
            case YEN:
                return ExchangeRates.YEN;
            case YUANREMINBI:
                return ExchangeRates.YUANREMINBI;
            default:
                System.out.println("Please enter a valid option!");
                return exchangeRates;
        }
    }

    public Double getDoubleInput(String prompt) {
        String strUserInput;
        do {
            strUserInput = getStringInput(prompt);
            try {
                Double dlbUserInput = Double.parseDouble(strUserInput);
                return dlbUserInput;
            } catch (IllegalArgumentException e) {
                continue;
            }
        } while (true);
    }
}

//to update with:
//what if the user inputs the wrong currency?
//what if the user puts in a negative number?
//what if the user wants to do another conversion/stop conversion?

//if using "return" in switch statement, you don't need a break. b/c return will return a result a complete the method.
//break will break out of the current scope of {curly brackets} and enter above into a large capsulated scope of {curly brackets}.
