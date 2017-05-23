package weisser.sarah.wtfinancial;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sarahweisser on 5/22/17.
 */
public class CurrencyCreatorTest {
    static CurrencyCreator creator;
    static int choice;

    @Before
    public void stuffToTest() {
        creator = new CurrencyCreator();
    }

    @Test
    public void creatorTestUSDollar() {
        //given
        choice = 0;
        Currency expected = Currency.US_DOLLAR;

        //when
        Currency actual = creator.setCurrency(choice);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void creatorTestEuro() {
        //given
        choice = 1;
        Currency expected = Currency.EURO;

        //when
        Currency actual = creator.setCurrency(choice);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void creatorTestBritishPound() {
        //given
        choice = 2;
        Currency expected = Currency.BRITISH_POUND;

        //when
        Currency actual = creator.setCurrency(choice);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void creatorTestRupee() {
        //given
        choice = 3;
        Currency expected = Currency.INDIAN_RUPEE;

        //when
        Currency actual = creator.setCurrency(choice);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void creatorTestAustralianDollar() {
        //given
        choice = 4;
        Currency expected = Currency.AUSTRALIAN_DOLLAR;

        //when
        Currency actual = creator.setCurrency(choice);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void creatorTestCanadianDollar() {
        //given
        choice = 5;
        Currency expected = Currency.CANADIAN_DOLLAR;

        //when
        Currency actual = creator.setCurrency(choice);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void creatorTestSingaporeDollar() {
        //given
        choice = 6;
        Currency expected = Currency.SINGAPORE_DOLLAR;

        //when
        Currency actual = creator.setCurrency(choice);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void creatorTestSwissFranc() {
        //given
        choice = 7;
        Currency expected = Currency.SWISS_FRANC;

        //when
        Currency actual = creator.setCurrency(choice);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void creatorTestMalaysianRinggit() {
        //given
        choice = 8;
        Currency expected = Currency.MALAYSIAN_RINGGIT;

        //when
        Currency actual = creator.setCurrency(choice);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void creatorTestYen() {
        //given
        choice = 9;
        Currency expected = Currency.JAPANESE_YEN;

        //when
        Currency actual = creator.setCurrency(choice);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void creatorTestYuan() {
        //given
        choice = 10;
        Currency expected = Currency.CHINESE_YUAN_RENMINBI;

        //when
        Currency actual = creator.setCurrency(choice);

        //then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void creatorGetCurrencyRateTestEuro() {
        //given
        double expected = .94;

        //when
        Currency euro = creator.setCurrency(1);
        double actual = euro.getRate();

        //then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void creatorGetCurrencyRateTestPound() {
        //given
        double expected = .82;

        //when
        Currency pound = creator.setCurrency(2);
        double actual = pound.getRate();

        //then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void creatorGetCurrencyRateTestRupee() {
        //given
        double expected = 68.32;

        //when
        Currency rupee = creator.setCurrency(3);
        double actual = rupee.getRate();

        //then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void creatorGetCurrencyRateTestAustralian() {
        //given
        double expected = 1.35;

        //when
        Currency aust = creator.setCurrency(4);
        double actual = aust.getRate();

        //then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void creatorGetCurrencyRateTestCanadian() {
        //given
        double expected = 1.32;

        //when
        Currency canadian = creator.setCurrency(5);
        double actual = canadian.getRate();

        //then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void creatorGetCurrencyRateTestSingapore() {
        //given
        double expected = 1.43;

        //when
        Currency sing = creator.setCurrency(6);
        double actual = sing.getRate();

        //then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void creatorGetCurrencyRateTestSwiss() {
        //given
        double expected = 1.01;

        //when
        Currency swiss = creator.setCurrency(7);
        double actual = swiss.getRate();

        //then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void creatorGetCurrencyRateTestMalay() {
        //given
        double expected = 4.47;

        //when
        Currency malay = creator.setCurrency(8);
        double actual = malay.getRate();

        //then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void creatorGetCurrencyRateTestYen() {
        //given
        double expected = 115.84;

        //when
        Currency yen = creator.setCurrency(9);
        double actual = yen.getRate();

        //then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void creatorGetCurrencyRateTestYuan() {
        //given
        double expected = 6.92;

        //when
        Currency yuan = creator.setCurrency(10);
        double actual = yuan.getRate();

        //then
        Assert.assertEquals(expected, actual, 0);
    }

}
