package Mohammed.Abrar;

import java.text.DecimalFormat;
import java.util.Scanner;

public class OutputConsole {


    public int outputCurrencyType() {
        int inputCurrencyType;
        Scanner scanner = new Scanner(System.in);
        inputCurrencyType = -1;
        do{
            System.out.println("Insert the currency  index to convert to:\n" +
                    "1. USD\n2. Euro\n3. British Pound\n4. Indian Rupee\n" +
                    "5. Australian Dollar\n6. Canadian Dollar\n7. Singapore Dollar\n" +
                    "8. Swiss Franc\n9. Malaysian Renggit\n10. Japanese Yen\n" +
                    "11. Chinese Yaun Renminbi\n");
            inputCurrencyType = Integer.parseInt(scanner.nextLine());
        } while (inputCurrencyType>11
                || inputCurrencyType<1 );

        return inputCurrencyType;
    }




    public double dollarToOutput(int outputCurrencyType, double inputAmount){
        double outputAmount=0;
        NonDollarCurrencies nonDollarCurrencies = new NonDollarCurrencies();
        switch (outputCurrencyType){
            case (1):
                return nonDollarCurrencies.dollarConvertor(inputAmount);
            case (2):
                return nonDollarCurrencies.euroConvertor(inputAmount);
            case (3):
                return nonDollarCurrencies.britishPoundConvertor(inputAmount);
            case (4):
                return nonDollarCurrencies.indianRupeeConvertor(inputAmount);
            case (5):
                return nonDollarCurrencies.australianDollarConvertor(inputAmount);
            case (6):
                return nonDollarCurrencies.canadianDollarConvertor(inputAmount);
            case (7):
                return nonDollarCurrencies.singaporeDollarConvertor(inputAmount);
            case (8):
                return nonDollarCurrencies.swissFrancConvertor(inputAmount);
            case (9):
                return nonDollarCurrencies.malaysianRinggitConvertor(inputAmount);
            case (10):
                return nonDollarCurrencies.japaneseYenConvertor(inputAmount);
            case (11):
                return nonDollarCurrencies.chineseYuanRenminbi(inputAmount);
            default:
                return 0;

        }

    }

    public String printCurrencyConvertedValue(double dollarToOutputValue) {

        DecimalFormat decimalFormat = new DecimalFormat("###,###.##");
        InputConsole inputConsole = new InputConsole();

        String formattedValue = decimalFormat.format(dollarToOutputValue);
        return formattedValue;
    }
}
