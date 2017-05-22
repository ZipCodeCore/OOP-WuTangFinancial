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
        long expected = 94;

        //when
        Currency euro = creator.setCurrency(1);
        long actual = euro.getRate();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void creatorGetCurrencyRateTestPound() {
        //given
        long expected = 82;

        //when
        Currency pound = creator.setCurrency(2);
        long actual = pound.getRate();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void creatorGetCurrencyRateTestRupee() {
        //given
        long expected = 6832;

        //when
        Currency rupee = creator.setCurrency(3);
        long actual = rupee.getRate();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void creatorGetCurrencyRateTestAustralian() {
        //given
        long expected = 135;

        //when
        Currency aust = creator.setCurrency(4);
        long actual = aust.getRate();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void creatorGetCurrencyRateTestCanadian() {
        //given
        long expected = 132;

        //when
        Currency canadian = creator.setCurrency(5);
        long actual = canadian.getRate();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void creatorGetCurrencyRateTestSingapore() {
        //given
        long expected = 143;

        //when
        Currency sing = creator.setCurrency(6);
        long actual = sing.getRate();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void creatorGetCurrencyRateTestSwiss() {
        //given
        long expected = 101;

        //when
        Currency swiss = creator.setCurrency(7);
        long actual = swiss.getRate();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void creatorGetCurrencyRateTestMalay() {
        //given
        long expected = 447;

        //when
        Currency malay = creator.setCurrency(8);
        long actual = malay.getRate();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void creatorGetCurrencyRateTestYen() {
        //given
        long expected = 11584;

        //when
        Currency yen = creator.setCurrency(9);
        long actual = yen.getRate();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void creatorGetCurrencyRateTestYuan() {
        //given
        long expected = 692;

        //when
        Currency yuan = creator.setCurrency(10);
        long actual = yuan.getRate();

        //then
        Assert.assertEquals(expected, actual);
    }

}
