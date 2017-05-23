package com.zipcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vidyachandasekhar on 5/22/17.
 */
public class CurrencyExchangeTest {

    private CurrencyExchange currencyExchange;

    @Before
    public void setUp() {
        //given for all tests
        currencyExchange = new CurrencyExchange();
    }

    @Test
    public void convertCurrencyDollarToEuro() throws Exception {
        // when
        double actualValue = currencyExchange.convertCurrency(5, CurrencyEnum.USD, CurrencyEnum.EURO);
        assertEquals("USD to Euro test failed", 5 * 0.94, actualValue, 0.001);
    }

    @Test
    public void convertCurrencyEuroToDollar() throws Exception {
        // when
        double actualValue = currencyExchange.convertCurrency(5, CurrencyEnum.EURO, CurrencyEnum.USD);
        assertEquals("Euro to USD test failed", 5 / 0.94, actualValue, 0.001);
    }

    @Test
    public void convertCurrencyEuroToBritishPound() throws Exception {
        // when
        double actualValue = currencyExchange.convertCurrency(5, CurrencyEnum.EURO, CurrencyEnum.POUND);
        assertEquals("Euro to British Pound test failed", (5 / 0.94) * 0.82, actualValue, 0.001);
    }

    @Test
    public void convertCurrencyBritishPoundToIndianRuppe() throws Exception {
        // when
        double actualValue = currencyExchange.convertCurrency(5, CurrencyEnum.POUND, CurrencyEnum.RUPEE);
        assertEquals("British Pound to Indian Ruppe test failed", (5 / 0.82) * 68.32, actualValue, 0.001);
    }

    @Test
    public void convertCurrencyIndianRuppeToCAD() throws Exception {
        // when
        double actualValue = currencyExchange.convertCurrency(5, CurrencyEnum.RUPEE, CurrencyEnum.CAD_DOLLAR);
        assertEquals("Indian Rupee to CAD $ test failed", (5 / 68.32) * 1.32, actualValue, 0.001);
    }


    @Test
    public void convertCurrencyCADToSingaporeDollar() throws Exception {
        // when
        double actualValue = currencyExchange.convertCurrency(5, CurrencyEnum.CAD_DOLLAR, CurrencyEnum.SINGAPORE_DOLLAR);
        assertEquals("CAD to Singapore $ test failed", (5 / 1.32) * 1.43, actualValue, 0.001);
    }

    @Test
    public void convertSingaporeDollarToSwissFrank() throws Exception {
        // when
        double actualValue = currencyExchange.convertCurrency(5, CurrencyEnum.SINGAPORE_DOLLAR, CurrencyEnum.SWISS_FRANK);
        assertEquals("Singapore $ to Swiss Frank test failed", (5 / 1.43) * 1.01, actualValue, 0.001);
    }

    @Test
    public void convertSwissFrankToMalaysianRinggit() throws Exception {
        // when
        double actualValue = currencyExchange.convertCurrency(5, CurrencyEnum.SWISS_FRANK, CurrencyEnum.RINGGIT);
        assertEquals("Swiss Frank to Malaysian Ringgit $ test failed", (5 / 1.01) * 4.47, actualValue, 0.001);
    }

    @Test
    public void convertMalaysianRinggitToJapaneseYen() throws Exception {
        // when
        double actualValue = currencyExchange.convertCurrency(5, CurrencyEnum.RINGGIT, CurrencyEnum.JAPANESE_YEN);
        assertEquals("Malaysian Ringgit to  Japanese Yen test failed", (5 / 4.47) * 115.84, actualValue, 0.001);
    }

    @Test
    public void convertJapaneseYenToChineseYuan() throws Exception {
        // when
        double actualValue = currencyExchange.convertCurrency(5, CurrencyEnum.JAPANESE_YEN, CurrencyEnum.CHINESE_YUAN);
        assertEquals("Japanese Yen  to Chiese Yuan test failed", (5 / 115.84) * 6.92, actualValue, 0.001);
    }

}