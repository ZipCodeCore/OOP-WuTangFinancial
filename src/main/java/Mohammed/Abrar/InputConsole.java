package Mohammed.Abrar;

import java.util.Scanner;

public class InputConsole {


    public InputConsole() {
    }


    public int inputCurrencyType() {

        int inputCurrecyType;
       // String inputCurrecyType;
        Scanner scanner = new Scanner(System.in);
        inputCurrecyType = -1;

            do{
                System.out.println("Welcome to currency conversion. " +
                        "Insert the currency type index from the following options:\n" +
                        "1. USD\n2. Euro\n3. British Pound\n4. Indian Rupee\n" +
                        "5. Australian Dollar\n6. Canadian Dollar\n7. Singapore Dollar\n" +
                        "8. Swiss Franc\n9. Malaysian Renggit\n10. Japanese Yen\n" +
                        "11. Chinese Yaun Renminbi\n");
                inputCurrecyType = Integer.parseInt(scanner.nextLine());
            } while (inputCurrecyType>11
                    || inputCurrecyType<1 );

        return inputCurrecyType;




    }

    public double inputCurrencyAmount() {

        double inputAmount;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Amount: ");
        inputAmount = Double.parseDouble(scanner.nextLine());
        return inputAmount;

    }

    public double inputToDollar(int inputCurrencyType, double inputAmount) {
        double outputAmount = 0;
        Dollar dollar = new Dollar();
        switch (inputCurrencyType) {
            case (1):
                return dollar.dollarConvertor(inputAmount);
            case (2):
                return dollar.euroConvertor(inputAmount);
            case (3):
                return dollar.britishPoundConvertor(inputAmount);
            case (4):
                return dollar.indianRupeeConvertor(inputAmount);
            case (5):
                return dollar.australianDollarConvertor(inputAmount);
            case (6):
                return dollar.canadianDollarConvertor(inputAmount);
            case (7):
                return dollar.singaporeDollarConvertor(inputAmount);
            case (8):
                return dollar.swissFrancConvertor(inputAmount);
            case (9):
                return dollar.malaysianRinggitConvertor(inputAmount);
            case (10):
                return dollar.japaneseYenConvertor(inputAmount);
            case (11):
                return dollar.chineseYuanRenminbi(inputAmount);

            default:

                return 0;


        }

    }


}
