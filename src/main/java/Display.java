import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by andrewwong on 5/22/17.
 */
public class Display {
    private static String menu = "[1] US Dollar\n[2] Euro\n[3] British Pound\n[4] Indian Rupee\n[5] Australian Dollar\n" +
            "[6] Canadian Dollar\n[7] Singapore Dollar\n[8] Swiss France\n[9] Malaysian Ringgit\n[10] Japanese Yen\n" +
            "[11] Chinese Yuan Renminbi\n";
    private String menuError = "Invalid input. Try again.";
    private String askRateIn = "Enter your currency";
    private String askRateOut = "Enter the currency you want";
    private String askAmount = "Enter the amount of your currency";
    private String askAnother = "Would you like to do another conversion? Y/N";

    public String getAskAnother() {
        return askAnother;
    }

    public String getAskRateIn() {
        return askRateIn;
    }

    public String getAskAmount() {
        return askAmount;
    }

    public String getAskRateOut() {
        return askRateOut;
    }

    public String getMenu() {
        return menu;
    }

    public String getMenuError() {
        return menuError;
    }

    public String showAsCurrency(BigDecimal amount, Locale locale){
//        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
        String currencyString = NumberFormat.getCurrencyInstance(locale).format(amount);

//        String currencyString = formatter.format(locale, amount);
        return (currencyString);
    }
    public void printToConsole(String s){
        System.out.println(s);
    }
}
