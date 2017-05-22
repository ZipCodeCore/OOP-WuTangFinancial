/**
 * Created by aurorabanuelos on 5/22/17.
 */
public class Main {

    public static void main(String[] args) {

        Input input = new Input();
        CurrencyConverter cc = new CurrencyConverter();

        do {
            input.print();
            System.out.println("Amount in " + input.foreignCurrency + " = " +
                    cc.convert(input.currentCurrency, input.foreignCurrency, input.amountToBeConverted));
            input.continueUse();
        }
        while(input.continueOrExit.equalsIgnoreCase("Y"));
    }
}
