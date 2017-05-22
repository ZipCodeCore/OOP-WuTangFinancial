import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by andrewwong on 5/22/17.
 */
public class Display {
    public String showAsCurrency(BigDecimal amount){
        Locale locale = Locale.UK;
        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
        String currencyString = formatter.format(amount);
        return (currencyString);
    }
}
