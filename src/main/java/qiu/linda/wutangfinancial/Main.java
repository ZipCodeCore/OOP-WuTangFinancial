package qiu.linda.wutangfinancial;

public class Main {

    public static void main(String[] args) {

        Currency[] CurrencyArray = Currency.values();



            for (int i = 0; i < CurrencyArray.length; i++) {
                System.out.print("{" + CurrencyArray[i] + "} ");
                if (i == 6)
                    System.out.println("");
            }


        Currency currencyFrom = InputTools.getEnumInput("Enter the country name of your currency.");
        double amount = InputTools.getDoubleInput("How much do you want to convert?");
        Currency currencyTo= InputTools.getEnumInput("What currency do you want to convert it to?");


        double result = CurrencyConverter.convertCurrency(currencyFrom,  currencyTo,  amount);

            System.out.println("Your converted amount is " + result);



    }
}

