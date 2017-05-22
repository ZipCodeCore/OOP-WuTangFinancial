package marwa.milton.wutang;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;


/**
 * Created by mkulima on 1/12/17.
 */
public class Currency_Test {

    @Test
    public void currencyType_Test(){
        Currency toBeTested = new Currency("USD",10);
        String expectedCurrencyType = "USD";
        String actualCurrencyType = toBeTested.currencyType;
        //Assert.assertEquals("wrong currency type", expectedCurrencyType, actualCurrencyType);
        Assert.assertThat(expectedCurrencyType, is(actualCurrencyType));
    }

    @Test
    public void currencyValue_Test(){
        Currency toBeTested = new Currency("USD",10);
        double expectedCurrencyType = 10.0;
        double actualCurrencyType = toBeTested.currencyValue;
        //Assert.assertEquals("wrong currency type", expectedCurrencyType, actualCurrencyType);
        Assert.assertThat(expectedCurrencyType, is(actualCurrencyType));
    }

}
