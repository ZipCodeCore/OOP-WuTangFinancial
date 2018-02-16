import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import java.util.Map;



public class CurrencyConversionTest {



public double setInitialAmount;

@Before
public void setup(){

    setInitialAmount = 1.00;

    }

    //1
    @Test
    public void usdToEuro()
    {
        double actual = CurrencyConversion.converter(setInitialAmount, CurrencyConversion.USD, CurrencyConversion.EURO);
        double expected = 0.94;
        Assert.assertEquals(expected, actual, .001);
    }

    //2
    @Test
    public void britishPoundToIndianRupee()
    {
        double actual = CurrencyConversion.converter(setInitialAmount, CurrencyConversion.BRITISH_POUND, CurrencyConversion.INDIAN_RUPEE);
        double expected = 83.32;
        Assert.assertEquals(expected, actual, .001);
    }

    //3
    @Test
    public void australianDollarToCanadianDollar()
    {
        double actual = CurrencyConversion.converter(setInitialAmount, CurrencyConversion.AUSTRALIAN_DOLLAR, CurrencyConversion.CANADIAN_DOLLAR);
        double expected = 0.98;
        Assert.assertEquals(expected, actual, .001);
    }

    //4
    @Test
    public void singaporeDollarToSwissFranc()
    {
        double actual = CurrencyConversion.converter(setInitialAmount, CurrencyConversion.SINGAPORE_DOLLAR, CurrencyConversion.SWISS_FRANC);
        double expected = 0.71;
        Assert.assertEquals(expected, actual, .001);

    }

    //5
    @Test
    public void malaysianRinggitToChineseYuanRenminbi()
    {
        double actual = CurrencyConversion.converter(setInitialAmount, CurrencyConversion.MALAYSIAN_RINGGIT, CurrencyConversion.CHINESE_YUAN_RENMINBI);
        double expected = 1.55;
        Assert.assertEquals(expected, actual, .001);

    }

    //6
    @Test
    public void japaneseYenToChineseYuanRenminbi()
    {
        double actual = CurrencyConversion.converter(setInitialAmount, CurrencyConversion.JAPANESE_YEN, CurrencyConversion.CHINESE_YUAN_RENMINBI);
        double expected = 0.06;
        Assert.assertEquals(expected, actual, .001);
    }

    //7
    @Test
    public void euroToSwissFranc()
    {
        double actual = CurrencyConversion.converter(setInitialAmount, CurrencyConversion.EURO, CurrencyConversion.SWISS_FRANC);
        double expected = 1.07;
        Assert.assertEquals(expected, actual, .001);
    }

    //8
    @Test
    public void canadianDollarToSwissFranc()
    {
        double actual = CurrencyConversion.converter(setInitialAmount, CurrencyConversion.CANADIAN_DOLLAR, CurrencyConversion.SWISS_FRANC);
        double expected = .77;
        Assert.assertEquals(expected, actual, .001);
    }

    //9
    @Test
    public void japaneseYenToIndianRupee()
    {
        double actual = CurrencyConversion.converter(setInitialAmount, CurrencyConversion.JAPANESE_YEN, CurrencyConversion.INDIAN_RUPEE);
        double expected = .59;
        Assert.assertEquals(expected, actual, .001);
    }

    //10
    @Test
    public void malaysianRinggitToUsDollar()
    {
        double actual = CurrencyConversion.converter(setInitialAmount, CurrencyConversion.MALAYSIAN_RINGGIT, CurrencyConversion.USD);
        double expected = .22;
        Assert.assertEquals(expected, actual, .001);

    }



}
