import java.util.Scanner;

public class Console {
    static Scanner scanner = new Scanner(System.in);


    public static String numToEnum(int optionPicked) {
        return ""+Currency.values()[optionPicked-1];
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


        switch (Currency.valueOf(numToEnum(input))){

            case USDollar:
                listOfCurrencies();
                System.out.println("Please pick a number of the currency to convert to:");
                secondChoice();


                break;
            case Euro:
                break;
            case BritishPound:
                break;
            case IndianRupee:
                break;
            case AustralianDollar:
                break;
            case CanadianDollar:
                break;
            case SingaporeDollar:
                break;
            case SwissFranc:
                break;
            case MalaysianRinggit:
                break;
            case JapaneseYen:
                break;
            case ChineseYuanRenminbi:
                break;
        }
    }

    
}
