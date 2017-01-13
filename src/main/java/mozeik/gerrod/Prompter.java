package mozeik.gerrod;

import java.util.Date;
import java.util.Scanner;

/**
 * Created by gerrodmozeik on 1/13/17.
 */
public class Prompter {
    char caseIdentifier;
    Double inputMonetaryValue;

    Scanner scanner = new Scanner(System.in);

    public char getCaseIdentifier() {
        System.out.println("What type of conversion would you like?");
        System.out.println("a: Dollar to Euro");
        System.out.println("b: Euro to Dollar");
        System.out.println("c: Euro to British Pound");
        System.out.println("d: British Pound to Indian Rupee");
        System.out.println("e: Rupee to Canadian Dollar");
        System.out.println("f: Canadian Dollar to Singapore Dollar");
        System.out.println("g: Singapore Dollar to Swiss Franc");
        System.out.println("h: Swiss Franc to Malaysian Ringgit");
        System.out.println("i: Malaysian Ringgit to Japanese Yen");
        System.out.println("j: Japanese Yen to Chinese Yuan Renminbi");
        caseIdentifier = scanner.next().charAt(0);
        System.out.println(caseIdentifier);
        return caseIdentifier;
    }

    public Double getInputMonetaryValue() {
        System.out.println("How much money would you like to convert?");
        inputMonetaryValue = scanner.nextDouble();
        System.out.println(inputMonetaryValue);
        return inputMonetaryValue;
    }

    public void displayConvertedMonetaryValue(Double outputMonetaryValue) {
        System.out.println("Your converted amount is: " + outputMonetaryValue);
    }
}
