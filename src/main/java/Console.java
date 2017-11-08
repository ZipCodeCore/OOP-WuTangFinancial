import java.util.*;

public class Console {

    Scanner scan = new Scanner(System.in);
    Convert converter = new Convert();

    public void start(){
        do {
            print("Currency Converter");
            Currency currencyFrom = getCurrency("What would you like to convert from?");
            double amount = getUserDoubleInput("How much would you like to convert?");
            Currency currencyTo = getCurrency("What would you like to convert to?");
            String finalString = createFinalString(currencyFrom, currencyTo, amount);
            print(finalString);
        }while(runAgain());
        print("Good bye.");
    }

    public boolean runAgain(){
        String input = getUserStringInput("Would you like to convert any other currencies?");
        return "yes".equalsIgnoreCase(input);
    }


    public String createFinalString(Currency currency1,Currency currency2,double amount){
        String amountString = converter.formatDouble(amount);
        String currencyName1 = currency1.getFullName(), currencyName2 = currency2.getFullName();
        String output = amountString +" "+ currencyName1 + " converts to ";

        double newAmount = converter.convertCurrency(currency1,currency2,amount);
        String newAmountString = converter.formatDouble(newAmount);
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

    public Currency getCurrency(String prompt){
        printCurrencies();
        do{
            String input = getUserStringInput(prompt);
            for(Currency currency : Currency.values()){
                boolean nameMatch = input.equalsIgnoreCase(currency.name());
                boolean fullNameMatch = input.equalsIgnoreCase(currency.getFullName());
                if(nameMatch || fullNameMatch){
                    return currency;
                }
            }
            print("Invalid input");
        }while(true);
    }

    public void printCurrencies(){
        String output = "\nAvailable currencies\n|";
        for(Currency currency : Currency.values()){
            output += " "+currency.name()+" |";
        }
        print(output);
    }

    public String getUserStringInput(String prompt){
        System.out.println(prompt);
        return scan.nextLine();
    }

    public void print(Object prompt){
        System.out.println(prompt);
    }
}
