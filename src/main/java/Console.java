import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.math.BigDecimal;
import java.util.Scanner;

public class Console {

    public static void startTheThing() {

            Console console = new Console();
            CurrencyHandler currencyHandler = new CurrencyHandler();

            System.out.println("Hello and welcome to WuTang Financial, where we know that Cash Rules Everything Around Me (and you).");
            System.out.println("What currency you have brought to exchange?");
            Currency sourceCurrency = console.getCurrencyType();

            System.out.println("and what are you converting to?");
            Currency targetCurrency = console.getCurrencyType();

            System.out.println("and how much cash do you have in "+ sourceCurrency + " that you would like to convert today?");
            double amountToConvert = console.getDoubleInput();


            double convertedAmount = sourceCurrency.convertTo(targetCurrency, amountToConvert);
            BigDecimal convertedAmountBigDecimal = currencyHandler.formatDecimal(convertedAmount);

            System.out.println("Excellent, at the current exchange rate we can give you " + convertedAmountBigDecimal.toString()
                    + " " + targetCurrency);

    }

    public double getDoubleInput() {
        Scanner scan = new Scanner(System.in);
        double dblInput;
        String stringInput = scan.nextLine();

        dblInput = Double.valueOf(stringInput);

        return dblInput;
    }

    public Currency getCurrencyType() {
        Scanner scan = new Scanner(System.in);


        do {
            String stringInput = scan.nextLine();
            for (Currency currency : Currency.values()) {
                if (currency.toString().equalsIgnoreCase(stringInput)) {
                    return currency;
                }
            }
            System.out.println("Please enter a valid currency.");
        } while (true);
    }

}

/*
                   if(stringInput.equals(Currency.CANADIAN_DOLLAR)){
                    currency = Currency.CANADIAN_DOLLAR;
                    return currency;
                    }else if(stringInput.equals(Currency.JAPANESE_YEN)){
                    currency = Currency.JAPANESE_YEN;
                    return currency;
                    }else if(stringInput.equals(Currency.SINGAPORE_DOLLAR)){
                    currency = Currency.SINGAPORE_DOLLAR;
                    return currency;
                    }else if(stringInput.equals(Currency.US_DOLLAR)){
                    currency = Currency.US_DOLLAR;
                    return currency;
                    }else if(stringInput.equals(Currency.AUSTRALIAN_DOLLAR)) {
                    currency = Currency.AUSTRALIAN_DOLLAR;
                    return currency;
                    }else if(stringInput.equals(Currency.CHINESE_YUAN_RENMINBI)) {
                    currency = Currency.CHINESE_YUAN_RENMINBI;
                    return currency;
                    }else if(stringInput.equals(Currency.SWISS_FRANC)) {
                    currency = Currency.SWISS_FRANC;
                    return currency;
                    }else if(stringInput.equals(Currency.BRITISH_POUND)) {
                    currency = Currency.BRITISH_POUND;
                    return currency;
                    }else if(stringInput.equals(Currency.EURO)) {
                    currency = Currency.EURO;
                    return currency;
                    }else if(stringInput.equals(Currency.INDIAN_RUPEE)) {
                    currency = Currency.INDIAN_RUPEE;
                    return currency;
                    }else if(stringInput.equals(Currency.MALAYSIAN_RINGGIT)) {
                    currency = Currency.MALAYSIAN_RINGGIT;
                    return currency;
                    }else {
                    System.out.println("We don't currently support that conversion.");
         */