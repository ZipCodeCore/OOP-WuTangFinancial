import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by anthonyjones on 5/22/17.
 */
public class Display {
    Calculate calculate = new Calculate();
    Currency currency;
    int enumLoopCounter;
    private boolean isConverterRunning = true;
    String givenNumber;
    private String operationOfChoice;
    private Scanner input = new Scanner(System.in);


    Display() {
        System.out.println("Welcome to Anthony's Money Converter.");
        displayChoices();
        continuouslyRunCalculator();
    }

    private void displayChoices() {
        System.out.println("Please choose the currency you have below:");
        for (Currency enumLoop : currency.values()) {
            enumLoopCounter++;
            System.out.print(enumLoop + " : " + enumLoopCounter + "  " + "|" + " ");
            if (enumLoopCounter % 4 == 0) {
                System.out.println();
            }
        }
        enumLoopCounter = 0;
        System.out.println();
    }

    private void operationChoice() {
        String choice = input.nextLine().replaceAll("\\s", "");
        this.operationOfChoice = choice.trim();
    }

    private void methodOfOperation() {
        for (Currency enumLoop : currency.values()) {
            int enumPosition = Currency.valueOf(enumLoop.toString()).ordinal();
            try {
                if (enumPosition == Integer.parseInt(operationOfChoice) - 1) {
                    currency = enumLoop;
                    System.out.printf("You've chosen %s\nPlease enter the amount of money you have:\n", currency);
                }
            } catch (Exception e) {
                System.out.println("You did not enter a correct option, please try again");
                operationChoice();
            }
        }
    }

    private void setCurrentNumber() {
        String money = input.nextLine().trim();
        this.givenNumber = money;
    }

    private void calculateAndSendAllNumbers() {

        calculate.setNumber1(Double.parseDouble(givenNumber));
        String number = givenNumber;
        double amount = calculate.conversionMethod(Double.parseDouble(number), currency);
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        System.out.println("You have $" + formatter.format(amount) + "\n");
    }


    private void continuouslyRunCalculator() {
        while (isConverterRunning) {
            operationChoice();
            methodOfOperation();
            setCurrentNumber();
            calculateAndSendAllNumbers();
            displayChoices();
        }

        System.exit(0);
    }


}