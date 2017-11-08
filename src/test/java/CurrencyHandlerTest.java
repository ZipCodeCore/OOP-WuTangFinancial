import org.junit.Assert;
import org.junit.Test;

public class CurrencyHandlerTest {

    @Test
    public void getCurrencySymbolTest(){
        CurrencyHandler currencyHandler = new CurrencyHandler();

        CurrencySymbol yen = CurrencySymbol.JAPANESE_YEN;
        Currency ringgit = Currency.MALAYSIAN_RINGGIT;
        Currency rupee = Currency.INDIAN_RUPEE;

        String expected = "¥, RM, ₹";
        String actual = yen.getSymbol() + ", " +
                        currencyHandler.getCurrencySymbol(ringgit)+ ", " +
                        currencyHandler.getCurrencySymbol(rupee);

        Assert.assertEquals(expected,actual);
    }
}
