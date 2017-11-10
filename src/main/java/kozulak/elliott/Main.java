package kozulak.elliott;



public class Main {


    public static void main(String[] args) {

        String repeat = "yes";

        do {
            printCurrencies(CurrencyNames.values());

            String currencyFrom = Console.currencyInput("\nEnter the currency your money is in: ");
            Double amount = Console.doubleInput("Enter the amount to convert");
            String currencyTo = Console.currencyInput("Enter the currency to convert to: ");

            Double convertedAmount = Converter.convertCurrency(currencyFrom, currencyTo, amount);

            System.out.println("You have converted " + amount + " " + currencyFrom + " to " + convertedAmount + " " + currencyTo);

            repeat = Console.getStringInput("Would you like to convert more money? {Yes} {No}");
        } while (!"no".equalsIgnoreCase(repeat));

    }

    private static void printCurrencies(CurrencyNames names[]) {

        for (int i = 0; i < names.length; i++) {
            System.out.print("{" + names[i] + "} ");
            if (i == 6)
                System.out.println("");
        }
    }


}