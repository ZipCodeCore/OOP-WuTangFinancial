import org.junit.Assert;
import org.junit.Test;

public class CurrencyHandlerTest {

    @Test
    public void getCurrencySymbolTest(){
        CurrencyHandler currencyHandler = new CurrencyHandler();

        Currency yen = Currency.JAPANESE_YEN;
        Currency ringgit = Currency.MALAYSIAN_RINGGIT;
        Currency rupee = Currency.INDIAN_RUPEE;

        String expected = "¥, RM, ₹";
        String actual = yen.getSymbol() + ", " +
                        ringgit.getSymbol()+ ", " +
                        rupee.getSymbol();

        Assert.assertEquals(expected,actual);
    }
}
