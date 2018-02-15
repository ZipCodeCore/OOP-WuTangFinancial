
import com.zipcodewilmington.wutangfinancial.carolynnvansant.CurrencyExchange;
import org.junit.Test;
import org.junit.Assert;

import static com.zipcodewilmington.wutangfinancial.carolynnvansant.CurrencyExchange.currencyRateConversion;


public class CurrencyExchangeTest {

    @Test
    public void testCurrencyRateConversion() {
        //Given:
        //public Double currencyRateConversion(Double firstRate, Double secondRate, Double money)
        Double firstRate = CurrencyExchange.US_DOLLAR;
        Double secondRate = CurrencyExchange.EURO;
        Double money = (double)100000;
        Double expectedAmount = (double)94000;

        Double actualAmount = currencyRateConversion(firstRate, secondRate, money);

        Assert.assertEquals(expectedAmount,actualAmount);
    }



    @Test
    public void testCurrencyRateConversion2() {
        //Given:
        //public Double currencyRateConversion(Double firstRate, Double secondRate, Double money)
        Double firstRate = CurrencyExchange.EURO;
        Double secondRate = CurrencyExchange.US_DOLLAR;
        Double money = (double)94000;
        Double expectedAmount = (double)100000;

        Double actualAmount = currencyRateConversion(firstRate, secondRate, money);

        Assert.assertEquals(expectedAmount,actualAmount);
    }

    @Test
    public void testCurrencyRateConversion3() {
        //Given:
        //public Double currencyRateConversion(Double firstRate, Double secondRate, Double money)
        Double firstRate = CurrencyExchange.EURO;
        Double secondRate = CurrencyExchange.BRITISH_POUND;
        Double money = (double)100000;
        Double expectedAmount = (double)87234.04;

        Double actualAmount = currencyRateConversion(firstRate, secondRate, money);

        Assert.assertEquals(expectedAmount,actualAmount);
    }

    @Test
    public void testCurrencyRateConversion4() {
        //Given:
        //public Double currencyRateConversion(Double firstRate, Double secondRate, Double money)
        Double firstRate = CurrencyExchange.BRITISH_POUND;
        Double secondRate = CurrencyExchange.INDIAN_RUPEE;
        Double money = (double)87234.04;
        Double expectedAmount = (double)7268084.89;

        Double actualAmount = currencyRateConversion(firstRate, secondRate, money);

        Assert.assertEquals(expectedAmount,actualAmount);
    }

    @Test
    public void testCurrencyRateConversion5() {
        //Given:
        //public Double currencyRateConversion(Double firstRate, Double secondRate, Double money)
        Double firstRate = CurrencyExchange.INDIAN_RUPEE;
        Double secondRate = CurrencyExchange.CANADIAN_DOLLAR;
        Double money = (double)7268084.89;
        Double expectedAmount = (double)140425.53;

        Double actualAmount = currencyRateConversion(firstRate, secondRate, money);

        Assert.assertEquals(expectedAmount,actualAmount);
    }

    @Test
    public void testCurrencyRateConversion6() {
        //Given:
        //public Double currencyRateConversion(Double firstRate, Double secondRate, Double money)
        Double firstRate = CurrencyExchange.CANADIAN_DOLLAR;
        Double secondRate = CurrencyExchange.SINGAPORE_DOLLAR;
        Double money = (double)140425.53;
        Double expectedAmount = (double)152127.66;

        Double actualAmount = currencyRateConversion(firstRate, secondRate, money);

        Assert.assertEquals(expectedAmount,actualAmount);
    }

    @Test
    public void testCurrencyRateConversion7() {
        //Given:
        //public Double currencyRateConversion(Double firstRate, Double secondRate, Double money)
        Double firstRate = CurrencyExchange.SINGAPORE_DOLLAR;
        Double secondRate = CurrencyExchange.SWISS_FRANK;
        Double money = (double)152127.66;
        Double expectedAmount = (double)107446.81;

        Double actualAmount = currencyRateConversion(firstRate, secondRate, money);

        Assert.assertEquals(expectedAmount,actualAmount);
    }

    @Test
    public void testCurrencyRateConversion8() {
        //Given:
        //public Double currencyRateConversion(Double firstRate, Double secondRate, Double money)
        Double firstRate = CurrencyExchange.SWISS_FRANK;
        Double secondRate = CurrencyExchange.MALAYSIAN_RINGGIT;
        Double money = (double)107446.81;
        Double expectedAmount = (double)475531.92;

        Double actualAmount = currencyRateConversion(firstRate, secondRate, money);

        Assert.assertEquals(expectedAmount,actualAmount);
    }

    @Test
    public void testCurrencyRateConversion9() {
        //Given:
        //public Double currencyRateConversion(Double firstRate, Double secondRate, Double money)
        Double firstRate = CurrencyExchange.MALAYSIAN_RINGGIT;
        Double secondRate = CurrencyExchange.JAPANESE_YEN;
        Double money = (double)475531.92;
        Double expectedAmount = (double)12323404.39;

        Double actualAmount = currencyRateConversion(firstRate, secondRate, money);

        Assert.assertEquals(expectedAmount,actualAmount);
    }

    @Test
    public void testCurrencyRateConversion10() {
        //Given:
        //public Double currencyRateConversion(Double firstRate, Double secondRate, Double money)
        Double firstRate = CurrencyExchange.JAPANESE_YEN;
        Double secondRate = CurrencyExchange.CHINESE_YUAN_RENMINBI;
        Double money = (double)12323404.39;
        Double expectedAmount = (double)736170.22;

        Double actualAmount = currencyRateConversion(firstRate, secondRate, money);

        Assert.assertEquals(expectedAmount,actualAmount);
    }

}
