package io.zipcode.wutangfinancial;

public class Main {
    public static void main(String[] args){
        //base currency is dollar
        //method to convert currency to usd first then convert to another currency
        System.out.println("The following chart represents the different currencies:");
        Currency currency = new Currency();
        for(Currency eachCurr: Currency.currencyList){
            System.out.println(eachCurr.getName()+" "+eachCurr.getRate());
        }
        String baseCurrency= Console.getStringInput("What type of base currency do you have? Please select one from the chart.");
        double baseAmount = Console.getDoubleInput("How much base currency do you have?");
        String targetCurrency=Console.getStringInput("Which currency do you want to exchange? Please select one from the chart.");
        double targetAmount = currency.getTargetAmount(baseCurrency,baseAmount,targetCurrency);
        System.out.println("You will get "+targetAmount+" "+targetCurrency);
    }
}
