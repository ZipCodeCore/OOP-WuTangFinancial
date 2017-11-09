package io.zipcoder.wutangfinancial;

public class Console {

public void menu(){



    ConversionRates initialCurrencyChoice;
    ConversionRates convertedCurrencyChoice;
    double userAmount;
    Conversion toBeConverted = new Conversion();
    double converted;
    Display display = new Display();

    do {
        display.print("WU-TANG FINANCIAL");
        display.print("DIVERSIFY YO BONDS!");

        display.printCurrencies();
        initialCurrencyChoice = display.getCurrencySelection("Select initial currency: ");
        userAmount = display.getDouble("Please enter the amount to be converted: ");
        display.printCurrencies();
        convertedCurrencyChoice = display.getCurrencySelection("Select currency to be converted to: ");
        converted = toBeConverted.convert(userAmount, initialCurrencyChoice, convertedCurrencyChoice);


        display.printConversion(userAmount,converted,initialCurrencyChoice,convertedCurrencyChoice);



    }while(Display.anotherConversion());


}
}
