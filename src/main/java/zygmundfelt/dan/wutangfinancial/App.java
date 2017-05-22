package zygmundfelt.dan.wutangfinancial;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

/**
 * Welcome to the 36 chambers...
 *
 */
public class App {

    public static void main( String[] args ) {
        CurrencyConverter.ConversionRate fromRate, toRate;
        IOHandler.welcomeMessage();
        String name = IOHandler.getStringInput("What's your name?");
        IOHandler.printCurrencyMenu(name);
        try {
            fromRate = IOHandler.getInitialCurrencyType();
            toRate = IOHandler.getFinalCurrencyType();
            CurrencyConverter converter = new CurrencyConverter(fromRate, toRate);
            long initialAmount = IOHandler.getMoneyInput("How much " + fromRate.toString() + " are you looking to exchange?");
            long finalAmount = converter.convert(initialAmount);
            IOHandler.printMoney(finalAmount,toRate);
        } catch (Exception e) {
            IOHandler.println("Don't be funny with your money. Peace.");
        }

    }
}
