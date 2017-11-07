import java.text.NumberFormat;
import java.util.Scanner;

public class Console {
    public static void display() {
        boolean hasAnotherTransaction = true;
        while(hasAnotherTransaction) {
            welcomeMessage();
            displayAvailableCurrencyTypes();
            currencyConversionTransaction();
            hasAnotherTransaction = getInputToContinue();
        }
    }

    private static void welcomeMessage() {
        System.out.println("==============================================================================");
        System.out.println("=== Hello, I will convert the currency you have into the type you request! ===");
        System.out.println("==============================================================================");
    }

    private static void displayAvailableCurrencyTypes() {
        System.out.println("==============================================================================");
        System.out.println("==== Here are the available types of currency I can convert to and from:  ====");
        System.out.println("==============================================================================");
        int i = 0;
        for(CurrencyType currencyType: CurrencyType.values()) {
            System.out.printf("===== %d: %s\n", i, currencyType);
            i++;
        }
        System.out.println();
    }

    private static void currencyConversionTransaction() {
        CurrencyType currencyType = getCurrencyType("Select by number, what type of currency do you have?");
        double amount = getDoubleInput("How much do you want to convert?");
        CurrencyType desiredCurrencyType = getCurrencyType("Select by number, what type of currency do you want to convert to?");

        long amountTimes100 = Math.round(amount*100);
        Money money = new Money(amountTimes100, currencyType);
        money.convert(desiredCurrencyType);

        NumberFormat oldFormat = currencyType.getNumberFormat();
        NumberFormat newFormat = money.getCurrencyType().getNumberFormat();
        System.out.println();
        System.out.println("==============================================================================");
        System.out.println("======================== Thank you for your business! ========================");
        System.out.println("==============================================================================");
        System.out.printf("\nYou now have %s in %s in exchange for %s in %s\n\n",
                newFormat.format(money.getAmount()), money.getCurrencyType(), oldFormat.format(amount), currencyType);
    }

    private static CurrencyType getCurrencyType(String prompt) {
        int input = Math.abs(getIntegerInput(prompt));
        return CurrencyType.values()[input];
    }

    private static Integer getIntegerInput(String prompt) {
        double input = getDoubleInput(prompt);
        return (int) Math.round(input);
    }

    private static Double getDoubleInput(String prompt) {
        do {
            String input = getStringInput(prompt);
            try {

                return Double.parseDouble(input);

            } catch (IllegalArgumentException iae) {
                System.out.println("Invalid input");
                continue;
            }
        } while (true);
    }

    private static String getStringInput(String prompt) {
        System.out.println(prompt);
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        return input;
    }

    private static boolean getInputToContinue() {
        String anotherConversion = getYesOrNoInput("============= Would you like to exchange currency again? [ Y/N ] =============");
        if("Y".equalsIgnoreCase(anotherConversion)) {
            return true;
        }
        else {
            return false;
        }
    }

    private static String getYesOrNoInput(String prompt) {
        do {
            String input = getStringInput(prompt);
            if ("Y".equalsIgnoreCase(input) || "N".equalsIgnoreCase(input)) {
                return input;
            } else {
                System.out.println("Input invalid - Please enter Y or N");
                continue;
            }
        } while (true);
    }
}
