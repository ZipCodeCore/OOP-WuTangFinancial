import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by luisgarcia on 5/22/17.
 */
public class CurencyConverterTest
{
    CurrencyConverter exchange;
    USDollar usDollar;
    Euro euro;
    Pound pound;
    Rupee rupee;
    CanadianDollar canadianDollar;
    SingaporeDollar singaporeDollar;
    SwissFranc swissFranc;
    MalaysianRinggit malaysianRinggit;
    JapaneseYen japaneseYen;
    ChineseYuan chineseYuan;

    @Before
    public void initialize()
    {
        exchange = new CurrencyConverter();
        usDollar = new USDollar();
        euro = new Euro();
        pound = new Pound();
        rupee = new Rupee();
        canadianDollar = new CanadianDollar();
        singaporeDollar = new SingaporeDollar();
        swissFranc = new SwissFranc();
        malaysianRinggit = new MalaysianRinggit();
        japaneseYen = new JapaneseYen();
        chineseYuan = new ChineseYuan();

    }

    @Test
    public void convertItselfTest()
    {
        //given
        double expected = 1.00;

        //when
        double actual = exchange.convert(usDollar, usDollar);

        //then
        Assert.assertEquals("USDollar to USDollar",expected,actual,0);
    }

    @Test
    public void convertDollarToEuro()
    {
        //given
        double expected = .94;

        //when
        double actual = exchange.convert(euro, usDollar);

        //then
        Assert.assertEquals("USDollar to Euro", expected, actual, 0);
    }

    @Test
    public void convertEuroToDollar()
    {
        //given
        double expected = 1.06;

        //when
        double actual = exchange.convert(usDollar, euro);

        //then
        Assert.assertEquals("Euro to USDollar", expected, actual, 0);
    }

    @Test
    public void convertEuroToPound()
    {
        //given
        double expected = .87;

        //when
        double actual = exchange.convert(pound, euro);

        //then
        Assert.assertEquals("Euro to Pound", expected, actual, 0);
    }

    @Test
    public void convertPoundToRupee()
    {
        //given
        double expected = 83.32;

        //when
        double actual = exchange.convert(rupee, pound);

        //then
        Assert.assertEquals("Pound to Rupee", expected, actual, 0);
    }

    @Test
    public void convertRupeeToCanadianDollar()
    {
        //given
        double expected = .02;

        //when
        double actual = exchange.convert(canadianDollar, rupee);

        //then
        Assert.assertEquals("Rupee to Canadian Dollar", expected, actual, 0);
    }

    @Test
    public void convertCanadianDollarToSingaporeDollar()
    {
        //given
        double expected = 1.08;

        //when
        double actual = exchange.convert(singaporeDollar, canadianDollar);

        //then
        Assert.assertEquals("Canadian Dollar to Singapore Dollar", expected, actual, 0);
    }

    @Test
    public void convertSingaporeDollarToSwissFranc()
    {
        //given
        double expected = .71;

        //when
        double actual = exchange.convert(swissFranc, singaporeDollar);

        //then
        Assert.assertEquals("Singapore Dollar to Swiss Franc", expected, actual, 0);
    }

    @Test
    public void convertSwissFrancToMalaysianRinggit()
    {
        //given
        double expected = 4.43;

        //when
        double actual = exchange.convert(malaysianRinggit, swissFranc);

        //then
        Assert.assertEquals("Swiss Franc to Malaysian Ringgit", expected, actual, 0);
    }

    @Test
    public void convertMalaysianRinggitToJapaneseYen()
    {
        //given
        double expected = 25.91;

        //when
        double actual = exchange.convert(japaneseYen, malaysianRinggit);

        //then
        Assert.assertEquals("Malaysian Ringgit to Japanese Yen", expected, actual, 0);
    }

    @Test
    public void convertJapaneseYenToChineseYuan()
    {
        //given
        double expected = .06;

        //when
        double actual = exchange.convert(chineseYuan, japaneseYen);

        //then
        Assert.assertEquals("Japanese Yen to Chinese Yuan Renminbi", expected, actual, 0);
    }


    @Test
    public void getAmountTest()
    {
        //given
        double amount = 1500.40;
        double expected = 6706.79;

        //when
        double actual = exchange.getAmount(amount,usDollar, malaysianRinggit);

        //then
        Assert.assertEquals("Get us dollar amount to ringgit", expected, actual,0);
    }

    @Test
    public void getSymbolTest()
    {
        //given
        char expected = (char) 165;

        //when
        char actual = chineseYuan.symbol();

        //then
        Assert.assertEquals("Get us chinese yaun symbol", expected, actual);
    }
<<<<<<< HEAD
=======

>>>>>>> 554391f429c39dc06bd4eb68ef16880beb3085c4



}
