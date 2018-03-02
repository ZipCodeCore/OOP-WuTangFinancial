
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

    public class CurrencyConvertTest {
        private static CurrencyConvert test;

        @Before
        public void setUp() {
            HashMap<String, Float> originalRecord = new HashMap<String, Float>() {{
                put("USD", 1.00F);
                put("EUR", 0.94F);
                put("GBP", 0.82F);
                put("INR", 68.32F);
                put("AUD", 1.35F);
                put("CAD", 1.32F);
                put("SGD", 1.43F);
                put("CHF", 1.01F);
                put("MYR", 4.47F);
                put("JPY", 115.84F);
                put("CNY", 6.92F);
            }};
            test = new CurrencyConvert();
        }

        @Test
        public void dollarToEuro() {
            String actual = test.makeConversion("USD", "EUR", 500.00F);
            Assert.assertEquals("$470.00", actual);
        }

        @Test
        public void euroToDollar() {
            String actual = test.makeConversion("EUR", "USD", 500.00F);
            Assert.assertEquals("$531.91", actual);
        }

        @Test
        public void britishPoundToDollar() {
            String actual = test.makeConversion("GBP", "USD", 500.00F);
            Assert.assertEquals("$609.76", actual);
        }


        @Test
        public void euroToBritishPound() {
            String actual = test.makeConversion("EUR", "GBP", 500.00F);
            Assert.assertEquals("$436.17", actual);
        }


        @Test
        public void britishPoundToIndianRupee() {
            String actual = test.makeConversion("GBP", "INR", 500.00F);
            Assert.assertEquals("$41,658.54", actual);
        }


        @Test
        public void rupeeToCanadianDollar() {
            String actual = test.makeConversion("INR", "CAD", 500.00F);
            Assert.assertEquals("$9.66", actual);
        }


        @Test
        public void canadianDollarToSingaporeDollar() {
            String actual = test.makeConversion("CAD", "SGD", 500.00F);
            Assert.assertEquals("$541.67", actual);
        }

        @Test
        public void SingaporeDollarToSwissFranc() {
            String actual = test.makeConversion("SGD", "CHF", 500.00F);
            Assert.assertEquals("$353.15", actual);
        }

        @Test
        public void SwissFrancToMalaysianRinggit() {
            String actual = test.makeConversion("CHF", "MYR", 500.00F);
            Assert.assertEquals("$2,212.87", actual);
        }

        @Test
        public void MalaysianRinggitToJapaneseYen() {
            String actual = test.makeConversion("MYR", "JPY", 500.00F);
            Assert.assertEquals("$12,957.50", actual);
        }

        @Test
        public void JapaneseYenToChineseYuanRenminbi() {
            String actual = test.makeConversion("JPY", "CNY", 500.00F);
            Assert.assertEquals("$29.87", actual);
        }

    }

