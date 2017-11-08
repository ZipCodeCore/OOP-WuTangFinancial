package Mohammed.Abrar;

public class Application {
    public static void main(String[] args) {
        InputConsole inputConsole = new InputConsole();
        OutputConsole outputConsole = new OutputConsole();
        CurrencyFormatter currencyFormatter = new CurrencyFormatter();


        double inputToDollar = inputConsole.inputToDollar(inputConsole.inputCurrencyType()
                , inputConsole.inputCurrencyAmount());

        double output= outputConsole.dollarToOutput(outputConsole.outputCurrencyType(),inputToDollar);

        System.out.println("The conversion value is " +
                outputConsole.printCurrencyConvertedValue(output));

    }
}
