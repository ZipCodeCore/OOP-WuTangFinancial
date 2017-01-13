package mattern.william;

import java.util.Scanner;

/**
 * Created by williammattern on 1/13/17.
 */
public class Prompter {
    char caseIdentifier;
    Double inputMonetaryValue;
    Scanner scanner = new Scanner(System.in);

    public char getCaseIdentifier(){
        System.out.println("What type of conversion would you like to do?");
        System.out.println("a: Convert Dollar to Euro");
        System.out.println("b: Convert Euro to Dollar");
        System.out.println("c: Convert Euro to British Pound");
        System.out.println("d: Convert British Pound to Indian Rupee");
        System.out.println("e: Convert Rupee to Canadian Dollar");
        System.out.println("f: Convert Canadian Dollar to Singapore Dollar");
        System.out.println("g: Convert Singapore Dollar to Swiss Franc");
        System.out.println("h: Convert Swiss Franc to Malaysian Ringgit");
        System.out.println("i: Convert Malaysian Ringgit to Japanese Yen");
        System.out.println("j: Convert Japanese Yen to Chinese Yuan Renminbi");
        caseIdentifier = scanner.next().charAt(0);
        System.out.println(caseIdentifier);
        return caseIdentifier;
    }

    public Double getInputMonetaryValue(){
        System.out.println("How many units of input currency are you converting?");
        inputMonetaryValue = scanner.nextDouble();
        System.out.println(inputMonetaryValue);
        return inputMonetaryValue;
    }

    public void displayConvertedMonetaryValue(Double outputMonetaryValue){
        System.out.println("Your converted value is:\n" + outputMonetaryValue);
    }
}
