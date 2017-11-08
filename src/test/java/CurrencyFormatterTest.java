import org.junit.Assert;
import org.junit.Test;


public class CurrencyFormatterTest {

    @Test
    public void formatCurrencySymbolTest(){
        CurrencyFormatter currencyFormatter = new CurrencyFormatter();
        double amountToFormat = 457.23;
        Currency currencyFormatType = Currency.SwissFranc;
        String expected = "457.23";
        String actual = currencyFormatter.formatCurrencySymbol(amountToFormat, currencyFormatType);

        Assert.assertEquals(expected, actual);
    }
}