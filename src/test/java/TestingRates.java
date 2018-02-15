import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.math.BigDecimal;

import static com.sun.tools.doclint.Entity.delta;

public class TestingRates {

        CurrencyExchange testRate;

        @Before
        public void setUp() {
            testRate = new CurrencyExchange();
        }

        @Test
        public void testUSDtoEuro() {
            double expectedAmount = 0.94;
            double actualAmount = testRate.conversionFormula("USD", "EURO", 1.00);
            Assert.assertEquals("Convert Dollar to Euro",expectedAmount, actualAmount, 0.1);
        }

        @Test
        public void testEUROtoUSD() {
        double expectedAmount = 53.20;
        double actualAmount = testRate.conversionFormula("EURO", "USD", 50.00);
        Assert.assertEquals("Convert Euro to US Dollar", expectedAmount, actualAmount, 0.1);
        }

        @Test
        public void testRUPEEtoCAD () {
        double expectedAmount = 1.55;
        double actualAmount = testRate.conversionFormula("RUPEE", "CAD", 80.00);
        Assert.assertEquals("Convert Rupee to Canadian Dollar", expectedAmount, actualAmount, 0.1);
        }

        @Test
        public void testPOUNDtoRUPEE () {
        double expectedAmount = 2916.10;
        double actualAmount = testRate.conversionFormula("POUND", "RUPEE", 35.00);
        Assert.assertEquals("Convert British Pound to Indian Rupee", expectedAmount, actualAmount, 0.1);
        }

        @Test
        public void testCADtoSGD () {
        double expectedAmount = 107.25;
        double actualAmount = testRate.conversionFormula("CAD", "SGD", 99.00);
        Assert.assertEquals(
                "Convert Canadian Dollar to Singapore Dollar", expectedAmount, actualAmount, 0.1);
        }

        @Test
        public void testSGDtoFRANC () {
        double expectedAmount = 47.09;
        double actualAmount = testRate.conversionFormula("SGD", "FRANC", 66.66);
        Assert.assertEquals(
                "Convert Singapore Dollar to Swiss Franc",expectedAmount, actualAmount, 0.1);
        }

        @Test
        public void testFRANCtoRINGGIT () {
        double expectedAmount = 4425.75;
        double actualAmount = testRate.conversionFormula("FRANC", "RINGGIT", 1000.00);
        Assert.assertEquals(
                "Convert Swiss Franc to Malaysian Ringgit",expectedAmount, actualAmount, 0.1);
        }

        @Test
        public void testRINGGITtoYEN () {
        double expectedAmount = 259.15;
        double actualAmount = testRate.conversionFormula("RINGGIT", "YEN", 10.00);
        Assert.assertEquals(
                "Convert Malaysian Ringgit to Japanese Yen",expectedAmount, actualAmount, 0.1);
        }

        @Test
        public void testYENtoRENMINBI () {
        double expectedAmount = 2.99;
        double actualAmount = testRate.conversionFormula("YEN", "RENMINBI", 50.00);
        Assert.assertEquals(
                "Convert Japanese Yen to Chinese Yuan Renminb", expectedAmount, actualAmount, 0.1);
        }
    }