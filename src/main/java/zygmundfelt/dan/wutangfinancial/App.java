package zygmundfelt.dan.wutangfinancial;

/**
 * Welcome to the 36 chambers...
 *
 */
public class App {

    private static void appEngine() {
        boolean finished = false;
        CurrencyConverter.ConversionRate fromRate, toRate;

        while(!finished) {
            fromRate = IOHandler.getCurrencyType("What sort of currency you starting with?");
            toRate = IOHandler.getCurrencyType("What sort of currency you leaving with?");
            CurrencyConverter converter = new CurrencyConverter(fromRate, toRate);
            long initialAmount = IOHandler.getMoneyInput("How much " + fromRate.toString() + " are you looking to exchange?\n" +
                                                            "Any increments past the second decimal place get sliced off\n" +
                                                            "by our liquid swords.");
            long finalAmount = converter.convert(initialAmount);
            IOHandler.printMoney(finalAmount,toRate);
            finished = IOHandler.promptContinue();
        }
    }

    private static void introduction() {
        IOHandler.welcomeMessage();
        String name = IOHandler.getStringInput("What's your name?");
        IOHandler.printCurrencyMenu(name);
    }

    public static void main(String[] args) {
        introduction();
        try {
            appEngine();
            IOHandler.exitMessage();
        } catch (Exception e) {
            IOHandler.println("Not a valid currency. Don't be funny with your money. Peace.\n");
        }
    }
}
