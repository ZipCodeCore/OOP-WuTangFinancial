package mozeik.gerrod;

import java.util.Scanner;

/**
 * Created by gerrodmozeik on 1/13/17.
 */
public class Prompter {
    Scanner scanner = new Scanner(System.in);

    public char caseIdentifier() {
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
        System.out.println("j: Japanese Yen to Chinese Yuan");
        return scanner.next().charAt(0);
    }

    public Double inputMonetaryValue() {
        System.out.println("How much money would you like to convert?");
        return scanner.nextDouble();
    }
}
