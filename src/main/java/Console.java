import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        Console console = new Console();
        ConversionCalculator calculator = new ConversionCalculator();

        console.setOrigin(displayOriginPrompt());
        console.setExchange(displayExchangePrompt());
        console.setAmount(displayMoneyPrompt());

        System.out.println("================================================================================");
        System.out.print(console.getAmount() + " " + console.getOrigin() + " converted to " + console.getExchange() + " is ");
        System.out.println(calculator.convert(console.getAmount(), console.getOrigin(), console.getExchange()));

    }

    private Currency origin;
    private Currency exchange;
    private Double amount;

    public static Currency displayOriginPrompt() {
        System.out.println("================================================================================");
        System.out.println("");
        System.out.println("Enter one of the following currency types you would like to like to convert from");
        System.out.println("");
        for(Currency c : Currency.values()) {
            System.out.print(c.toString() + " ");
        }
        System.out.println();
        return getEnum(getString());
    }

    public static Currency displayExchangePrompt() {
        System.out.println("================================================================================");
        System.out.println("");
        System.out.println("Enter one of the following currency types you would like to like to convert to");
        System.out.println("");
        for(Currency c : Currency.values()) {
            System.out.print(c.toString() + " ");
        }
        System.out.println();
        return getEnum(getString());
    }

    public static Double displayMoneyPrompt() {
        System.out.println("================================================================================");
        System.out.println("");
        System.out.println("How much money would you like to convert?");
        System.out.println("");
        return getDouble();
    }

    public static Double getDouble() {
        Scanner keyboard = new Scanner(System.in);
        Double value =  keyboard.nextDouble();
        return value;
    }

    public static String getString() {
        Scanner keyboard = new Scanner(System.in);
        String value =  keyboard.nextLine();
        return value;

    }

    public static Currency getEnum(String prompt) {

        do {
            try {
                String userinput = prompt.toUpperCase();
                Currency enuminput = Currency.valueOf(userinput);
                return enuminput;
            } catch (IllegalArgumentException e) {
                System.out.println("Error");
                continue;
            }
        } while (true);
    }

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
