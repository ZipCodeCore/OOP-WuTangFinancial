import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by anthonyjones on 5/22/17.
 */
public class Display {
    private Calculate calculate = new Calculate();
    Converter conversion = new Converter();
    private Currency currency;
    private int enumLoopCounter;
    private boolean isConverterRunning = true;
    private String moneyAmount;
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
            System.out.printf("%s : %s | ", enumLoop, enumLoopCounter);
            if (enumLoopCounter % 4 == 0) {
                System.out.println();
            }
        }
        System.out.print("Or press q to quit");
        enumLoopCounter = 0;
        System.out.println();
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

    private void operationChoice() {
        String choice = input.nextLine().replaceAll("\\s", "");
        this.operationOfChoice = choice.trim();
    }

    private void methodOfOperation() {
        switch (operationOfChoice) {
            case "q":
                isConverterRunning = false;
                continuouslyRunCalculator();
                break;
            default:
                for (Currency enumLoop : currency.values()) {
                    int enumPosition = Currency.valueOf(enumLoop.toString()).ordinal();
                    try {
                        if (enumPosition == Integer.parseInt(operationOfChoice) - 1) {
                            currency = enumLoop;
                            System.out.printf("You've chosen %s\nPlease enter the amount of money you have:\n", currency);
                        }else if(Integer.parseInt(operationOfChoice) > 11){
                            throw new NullPointerException();
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("You did not enter a correct option, please try again");
                        operationChoice();
                    }
                }
        }
    }

    private void setCurrentNumber() {
        String money = input.nextLine().trim();
        this.moneyAmount = money;
    }

    private void calculateAndSendAllNumbers() {
        calculate.setNumber1(Double.parseDouble(moneyAmount));
        String number = moneyAmount;
        double amount = conversion.conversionMethod(Double.parseDouble(number), currency);
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        System.out.println("You have $" + formatter.format(amount) + "\n");
    }


}