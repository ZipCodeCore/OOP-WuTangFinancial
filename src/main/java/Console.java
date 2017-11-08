import java.text.DecimalFormat;
import java.util.Scanner;

public class Console {
    static Scanner scanner = new Scanner(System.in);
    DecimalFormat money = new DecimalFormat("$###,##0.00");


    public static Currency numToEnum(int optionPicked) {
        return Currency.values()[optionPicked-1];
    }

    public static void listOfCurrencies(){
        System.out.println("List of available Currencies:");
        System.out.println("----------------------");
        System.out.println("1. US Dollar\n2. Euro\n3. British Pound\n4. Indian Rupee\n5. Australian Dollar\n6. Canadian Dollar\n7. Singapore Dollar\n8. Swiss Franc\n9. Malaysian Ringgit\n10. Japanese Yen\n11. Chinese Yuan Renminbi");
        System.out.println("----------------------");
    }

    public static void opening() {
        System.out.println("======================");
        System.out.println(" Foreign Exchange");
        System.out.println("======================");


        System.out.println();
        listOfCurrencies();
        System.out.println("Please pick a number of a currency to convert from:");

        int input = scanner.nextInt();
        Currency firstOption = numToEnum(input);

        listOfCurrencies();
        System.out.println("Please pick a number of the currency to convert to:");
        input = scanner.nextInt();
        Currency secondOption = numToEnum(input);
        System.out.println("Enter the amount you want to exchange:");
        double amountInput = scanner.nextDouble();
        double convertedAmount = Convert.convertCurency(firstOption, secondOption, amountInput);

        System.out.println("Exchanged amount is: " + convertedAmount);
    }


}
