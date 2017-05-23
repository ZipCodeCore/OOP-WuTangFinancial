package kalaygian.dennis;

import kalaygian.dennis.typesofcurrency.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by denniskalaygian on 5/22/17.
 */
public class TestCurrencyFactory {

    @Test
    public void testCreateCurrency_dollar() {
        // Given
        Class expected = Dollar.class;
        // When
        Currency currency = CurrencyFactory.createCurrency("Dollar", 20);
        // Then
        Assert.assertEquals("Factory is not returning an instance of the Dollar class",
                expected, currency.getClass());
    }

    @Test
    public void testCreateCurrency_euro() {
        // Given
        Class expected = Euro.class;
        // When
        Currency currency = CurrencyFactory.createCurrency("Euro", 20);
        // Then
        Assert.assertEquals("Factory is not returning an instance of the Euro class",
                expected, currency.getClass());
    }

    @Test
    public void testCreateCurrency_britishPound() {
        // Given
        Class expected = BritishPound.class;
        // When
        Currency currency = CurrencyFactory.createCurrency("British Pound", 20);
        // Then
        Assert.assertEquals("Factory is not returning an instance of the BritishPound class",
                expected, currency.getClass());
    }

    @Test
    public void testCreateCurrency_australianDollar() {
        // Given
        Class expected = AustralianDollar.class;
        // When
        Currency currency = CurrencyFactory.createCurrency("Australian Dollar", 20);
        // Then
        Assert.assertEquals("Factory is not returning an instance of the AustriallianDollar class",
                expected, currency.getClass());
    }

    @Test
    public void testCreateCurrency_canadianDollar() {
        // Given
        Class expected = CanadianDollar.class;
        // When
        Currency currency = CurrencyFactory.createCurrency("Canadian Dollar", 20);
        // Then
        Assert.assertEquals("Factory is not returning an instance of the CanadianDollar class",
                expected, currency.getClass());
    }

    @Test
    public void testCreateCurrency_singaporeDollar() {
        // Given
        Class expected = SingaporeDollar.class;
        // When
        Currency currency = CurrencyFactory.createCurrency("Singapore Dollar", 20);
        // Then
        Assert.assertEquals("Factory is not returning an instance of the SingaporeDollar class",
                expected, currency.getClass());
    }

    @Test
    public void testCreateCurrency_malaysianRinggit() {
        // Given
        Class expected = MalaysianRinggit.class;
        // When
        Currency currency = CurrencyFactory.createCurrency("Malaysian Ringgit", 20);
        // Then
        Assert.assertEquals("Factory is not returning an instance of the MalaysianRinggit class",
                expected, currency.getClass());
    }

    @Test
    public void testCreateCurrency_japaneseYen() {
        // Given
        Class expected = JapaneseYen.class;
        // When
        Currency currency = CurrencyFactory.createCurrency("Japanese Yen", 20);
        // Then
        Assert.assertEquals("Checking to see if the factory returned an instance of the JapaneseYen class",
                expected, currency.getClass());
    }

    @Test
    public void testCreateCurrency_chineseYuanRenminbi() {
        // Given
        Class expected = ChineseYuanRenminbi.class;
        // When
        Currency currency = CurrencyFactory.createCurrency("Chinese Yuan Renminbi", 20);
        // Then
        Assert.assertEquals("Factory is not returning an instance of the Chinese Yuan Renminbi"
                        .concat(" class"),
                expected, currency.getClass());
    }

    @Test
    public void testCreateCurrency_irrelevantString() {
        // Given
        Class expected = Dollar.class;
        // When
        Currency currency = CurrencyFactory.createCurrency("Not a valid input", 20);
        // Then
        Assert.assertEquals("Factory is not returning an instance of the Dollar class for an irrelevant "
                        .concat("string"),
                expected, currency.getClass());
    }

}
