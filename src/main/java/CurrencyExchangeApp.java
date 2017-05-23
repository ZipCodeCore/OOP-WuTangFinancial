import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Locale;

/**
 * Created by andrewwong on 5/22/17.
 */
public class CurrencyExchangeApp {
    private Display display;
    private UserInput userInput;
    private Converter converter;
    private ExchangeRates rates;

    public CurrencyExchangeApp(Display display, UserInput userInput, Converter converter, ExchangeRates rates) {
        this.display = display;
        this.userInput = userInput;
        this.converter = converter;
        this.rates = rates;
    }

    public void run() {
        String menuSelection;
        Locale locale;
        BigDecimal rateIn;
        BigDecimal rateOut;
        BigDecimal amountIn;
        BigDecimal amountOut;
        String amountOutString;
        String doMoreExchanges;
        //show menu and ask for in currency
        display.printToConsole(display.getMenu());
        display.printToConsole(display.getAskRateIn());
        //TODO put do whiles in own methods
        do {
            menuSelection = userInput.queryStringInput();
            if (menuSelection == null) {
                display.printToConsole(display.getMenuError());
            }
        } while (menuSelection == null);
        locale = null;
        rateIn = rates.selectMenuOption(menuSelection);

        //show menu again and ask for out currency
        display.printToConsole(display.getAskRateOut());
        do {
            menuSelection = userInput.queryStringInput();
            if (menuSelection == null) {
                display.printToConsole(display.getMenuError());
            }
            locale = rates.getLocale();
        } while (menuSelection == null);
        locale = rates.getLocale();
        rateOut = rates.selectMenuOption(menuSelection);

        //ask for amount
        display.printToConsole(display.getAskAmount());
        amountIn = userInput.queryAmount();

        //show the new amount of currency
        amountOut = converter.convert(amountIn, rateIn, rateOut);
        amountOutString = display.showAsCurrency(amountOut, locale);
        display.printToConsole(amountOutString);
        //ask if want to do another
        display.printToConsole(display.getAskAnother());
        userInput = new UserInput();
        doMoreExchanges = UserInput.queryStringInput().toUpperCase();
        if(doMoreExchanges.equals("Y")){
            userInput = new UserInput();
            run();
        }
        else{
            return;
        }
    }
}
