import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Prompts {

    public static Currency displayOriginPrompt() {
        System.out.println("================================================================================\n");
        System.out.println("Enter one of the following currency types you would like to like to convert from\n\n");
        for(Currency c : Currency.values()) {
            System.out.print(c.toString() + " ");
        }
        System.out.println("\n");
        return getEnum();
    }

    public static Currency displayExchangePrompt() {
        System.out.println("================================================================================\n");
        System.out.println("Enter one of the following currency types you would like to like to convert to\n\n");
        for(Currency c : Currency.values()) {
            System.out.print(c.toString() + " ");
        }
        System.out.println("\n");
        return getEnum();
    }

    public static Double displayMoneyPrompt() {
        System.out.println("================================================================================\n");
        System.out.println("How much money would you like to convert?\n\n");
        return getDouble();
    }

    public static void printSplashLogo() {
        System.out.println(
                "\t                               ###\n" +
                "\t    ##########              #### ##\n" +
                "\t  ###      ##             ###     #\n" +
                "\t ##       ## ######   ####        ##\n" +
                "\t #        #  #    # ###            #\n" +
                "\t #        #  ##   ###              #\n" +
                "\t #        #####   ##               #\n" +
                "\t #                                 #\n" +
                "\t #     == WU-TANG FINANCIAL ==     #\n" +
                "\t #                                 #\n" +
                "\t #                                 #\n" +
                "\t ##           #########            #\n" +
                "\t  ###        ##       ##          ##\n" +
                "\t    ###      #         #         ##\n" +
                "\t      ###    ###       #        ##\n" +
                "\t        ####   ####   ##      ###\n" +
                "\t           ########   #    ####\n" +
                "\t                      #######\n" +
                "\t                      ###\n\n" +
                        "\"Because Your Finances Ain't Nothin' To Fuck With\""
        );
        System.out.println("");

    }

    public static Double getDouble() {
        Double value;
        do {
            try {
                Scanner keyboard = new Scanner(System.in);
                 value = keyboard.nextDouble();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Enter a number, fool");
            }
        }while (true) ;

    }

    public static Currency getEnum() {

        do {
            try {
                Scanner keyboard = new Scanner(System.in);
                String userInput = keyboard.nextLine().toUpperCase();
                Currency enumInput = Currency.valueOf(userInput);
                return enumInput;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid Currency Type. Enter A Currency From The List.");

            }
        } while (true);

    }

}
