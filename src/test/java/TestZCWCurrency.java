import io.zipcoder.wutangfinancial.currency.ZCWCurrency;
import org.junit.Assert;
import org.junit.Test;
import java.util.Random;

public abstract class TestZCWCurrency {

    ZCWCurrency cur1;
    ZCWCurrency cur2;

    public TestZCWCurrency(ZCWCurrency cur1, ZCWCurrency cur2){
        this.cur1=cur1;
        this.cur2=cur2;
    }

    @Test
    public void testSetGetAmount(){
        Random rando = new Random();
        Double expected = rando.nextDouble();
        Double priorAmount = cur1.getAmount();
        Double actual;

        cur1.setAmount(expected);
        actual=cur1.getAmount();

        Assert.assertNotEquals(priorAmount, actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConvertToCurrency(){


        String expectedClassName=cur2.getClass().getSimpleName();
        Double preConversionAmount=cur1.getAmount();

        cur1=cur1.convertToCurrency(cur2);
        String actualClassName=cur1.getClass().getSimpleName();

        Assert.assertEquals(expectedClassName, actualClassName);

        Double postConversionAmount=cur1.getAmount();

        Assert.assertNotEquals(preConversionAmount, postConversionAmount);

    }

}
