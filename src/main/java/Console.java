import java.text.DecimalFormat;
import java.util.*;

public class Console {

    Scanner scan = new Scanner(System.in);
    Convert converter = new Convert();

    public void start(){
        do {
            print("Welcome to Currency Converter");
            Currency currencyFrom = getCurrency("What would you like to convert from?", null);
            double amount = getUserDoubleInput("How much would you like to convert?");
            Currency currencyTo = getCurrency("What would you like to convert to?", currencyFrom);
            String finalString = createFinalString(currencyFrom, currencyTo, amount);
            print(finalString);
        }while(runAgain());
        print("Good bye.");
    }

    public boolean runAgain(){
        String input = getUserStringInput("Would you like to convert any other currencies?");
        return "yes".equalsIgnoreCase(input);
    }

    public String formatDouble(double amount){
        DecimalFormat tdp = new DecimalFormat("#,##0.00");
        return tdp.format(amount);
    }

    public String createFinalString(Currency currency1,Currency currency2,double amount){
        String amountString = formatDouble(amount);
        String currencyName1 = currency1.getCurrencyType();
        String currencyName2 = currency2.getCurrencyType();

        String output = amountString +" "+ currencyName1 + " converts to ";

        double newAmount = converter.convertCurrency(currency1,currency2,amount);
        String newAmountString = formatDouble(newAmount);
        output += newAmountString+" "+currencyName2+"\n";
        return output;
    }

    public double getUserDoubleInput(String prompt){
        double returnDouble;
        do {
            String input = getUserStringInput(prompt);
            try{
                returnDouble = Double.parseDouble(input);
                break;
            }catch(Exception e){
                print("Invalid input");
            }
        }while(true);
        return returnDouble;
    }

    public Currency getCurrency(String prompt,Currency currency1){
        Currency returnCurrency;
        printPossibleCurrencies(currency1);
        do{
            String input = getUserStringInput(prompt);
            returnCurrency = converter.getCurrencyByType(input);
            if(returnCurrency == null) {
                print("Invalid input");
            }
//            else if(returnCurrency.getCurrencyType().equalsIgnoreCase(currency1.getCurrencyType())){
//                print("Currency already used");
//            }
            else{
                break;
            }
        }while(true);
        return returnCurrency;
    }

    public void printPossibleCurrencies(Currency currency){
        String output = "\n|", currencyType = "";
        if(currency != null) {
            currencyType = currency.getCurrencyType();
        }
        ArrayList<Currency> currencyArrayList = converter.getCurrencyRateList();
        for(int i =0;i<currencyArrayList.size();i++){
            Currency currentCurrency = currencyArrayList.get(i);
            String currentCurrencyType = currentCurrency.getCurrencyType();
            if(!currencyType.equalsIgnoreCase(currentCurrencyType)){
                output += " "+currentCurrencyType+" |";
            }
        }
        print(output+"\n");
    }

    public String getUserStringInput(String prompt){
        System.out.println(prompt);
        return scan.nextLine();
    }

    public void print(Object prompt){
        System.out.println(prompt);
    }
}
