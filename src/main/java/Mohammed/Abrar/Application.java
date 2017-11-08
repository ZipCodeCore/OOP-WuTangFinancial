package Mohammed.Abrar;

import java.text.DecimalFormat;

public class Application {
    public static void main(String[] args) {
        InputConsole inputConsole = new InputConsole();
        OutputConsole outputConsole = new OutputConsole();


        double inputToDollar = inputConsole.inputToDollar(inputConsole.inputCurrencyType()
                , inputConsole.inputCurrencyAmount());

        double output= outputConsole.dollarToOutput(outputConsole.outputCurrencyType(),inputToDollar);

        System.out.println("The conversion value is " +
                outputConsole.printCurrencyConvertedValue(output));

    }
}
