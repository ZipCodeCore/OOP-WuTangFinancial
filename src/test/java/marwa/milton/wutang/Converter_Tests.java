package marwa.milton.wutang;

import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;

import static marwa.milton.wutang.Converter.convert;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

/**
 * Created by mkulima on 1/12/17.
 */
public class Converter_Tests {

    @Test
    public void convertName_Test(){
        Currency USD = new Currency("USD",10);
        Currency AUD = convert(USD, "AUD");

        String expectedCurrencyType = "AUD";
        String actualCurrencyType = AUD.currencyType;
        Assert.assertThat(expectedCurrencyType, is(actualCurrencyType));
    }

    @Test
    public void convertValue_Test(){
        Currency USD = new Currency("USD",10.0);
        Currency AUD = convert(USD, "AUD");

        double expectedCurrencyValue = 13.5;
        double actualCurrencyValue = AUD.currencyValue;
        Assert.assertThat(expectedCurrencyValue, is(actualCurrencyValue));

        System.out.println();
        System.out.println(13.5);
        System.out.println(actualCurrencyValue);
    }

    @Test
    public void convert_Test() {
        Currency USD = new Currency("USD",10.0);
        Currency INR = convert(USD, "INR");

        // here check the currency value conversion
        double expectedCurrencyValue = 683.20;
        double actualCurrencyValue = INR.currencyValue;
        Assert.assertEquals("currency name conversion failed",expectedCurrencyValue, actualCurrencyValue, 0.05);

        // here check the currency value conversion
        String expectedCurrencyName = "CAD";
        String actualCurrencyName = INR.currencyType;
        Assert.assertThat("expected conversion not found",expectedCurrencyName, is(actualCurrencyName));


    }

}
