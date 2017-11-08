import java.text.DecimalFormat;
import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        Console console = new Console();
        ConversionCalculator calculator = new ConversionCalculator();
        Prompts printer = new Prompts();
        DecimalFormat formatter = new DecimalFormat("0.00");

        printer.printSplashLogo();
        console.setOrigin(printer.displayOriginPrompt());
        console.setExchange(printer.displayExchangePrompt());
        console.setAmount(printer.displayMoneyPrompt());

        System.out.println("================================================================================");
        System.out.print(formatter.format(console.getAmount())
                + " " + console.getOrigin() + " converted to " + console.getExchange() + " is ");
        System.out.println(calculator.convert(console.getAmount(), console.getOrigin(), console.getExchange()));

    }

    private Currency origin;
    private Currency exchange;
    private Double amount;

    public Currency getOrigin() {
        return origin;
    }

    public void setOrigin(Currency origin) {
        this.origin = origin;
    }

    public Currency getExchange() {
        return exchange;
    }

    public void setExchange(Currency exchange) {
        this.exchange = exchange;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

}
