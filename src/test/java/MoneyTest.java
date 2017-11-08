import org.junit.Assert;
import org.junit.Test;

public class MoneyTest {

    @Test
    public void convertUSDollarToEuroTest() {
        Money testMoney = new Money(1000, CurrencyType.US_DOLLAR);
        testMoney.convert(CurrencyType.EURO);

        String expected = "9.40 in EURO";
        String actual = String.format("%.2f in %s", testMoney.getAmount(), testMoney.getCurrencyType());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertEuroToDollarTest() {
        Money testMoney = new Money(1000, CurrencyType.EURO);
        testMoney.convert(CurrencyType.US_DOLLAR);

        String expected = "10.64 in US_DOLLAR";
        String actual = String.format("%.2f in %s", testMoney.getAmount(), testMoney.getCurrencyType());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertEuroToBritishPoundTest() {
        Money testMoney = new Money(1000, CurrencyType.EURO);
        testMoney.convert(CurrencyType.BRITISH_POUND);

        String expected = "8.72 in BRITISH_POUND";
        String actual = String.format("%.2f in %s", testMoney.getAmount(), testMoney.getCurrencyType());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertBritishPoundToIndianRupeeTest() {
        Money testMoney = new Money(1000, CurrencyType.BRITISH_POUND);
        testMoney.convert(CurrencyType.INDIAN_RUPEE);

        String expected = "833.17 in INDIAN_RUPEE";
        String actual = String.format("%.2f in %s", testMoney.getAmount(), testMoney.getCurrencyType());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertIndianRupeeToCanadianDollarTest() {
        Money testMoney = new Money(1000, CurrencyType.INDIAN_RUPEE);
        testMoney.convert(CurrencyType.CANADIAN_DOLLAR);

        String expected = "0.19 in CANADIAN_DOLLAR";
        String actual = String.format("%.2f in %s", testMoney.getAmount(), testMoney.getCurrencyType());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertCanadianDollarToSingaporeDollarTest() {
        Money testMoney = new Money(1000, CurrencyType.CANADIAN_DOLLAR);
        testMoney.convert(CurrencyType.SINGAPORE_DOLLAR);

        String expected = "10.83 in SINGAPORE_DOLLAR";
        String actual = String.format("%.2f in %s", testMoney.getAmount(), testMoney.getCurrencyType());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertSingaporeDollarToSwissFrancTest() {
        Money testMoney = new Money(1000, CurrencyType.SINGAPORE_DOLLAR);
        testMoney.convert(CurrencyType.SWISS_FRANC);

        String expected = "7.06 in SWISS_FRANC";
        String actual = String.format("%.2f in %s", testMoney.getAmount(), testMoney.getCurrencyType());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertSwissFrancToMalaysianRinggitTest() {
        Money testMoney = new Money(1000, CurrencyType.SWISS_FRANC);
        testMoney.convert(CurrencyType.MALAYSIAN_RINGGIT);

        String expected = "44.26 in MALAYSIAN_RINGGIT";
        String actual = String.format("%.2f in %s", testMoney.getAmount(), testMoney.getCurrencyType());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertMalaysianRinggitToJapaneseYenTest() {
        Money testMoney = new Money(1000, CurrencyType.MALAYSIAN_RINGGIT);
        testMoney.convert(CurrencyType.JAPANESE_YEN);

        String expected = "259.15 in JAPANESE_YEN";
        String actual = String.format("%.2f in %s", testMoney.getAmount(), testMoney.getCurrencyType());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertJapaneseYenToChineseYuanRenminbiTest() {
        Money testMoney = new Money(1000, CurrencyType.JAPANESE_YEN);
        testMoney.convert(CurrencyType.CHINESE_YUAN_RENMINBI);

        String expected = "0.60 in CHINESE_YUAN_RENMINBI";
        String actual = String.format("%.2f in %s", testMoney.getAmount(), testMoney.getCurrencyType());

        Assert.assertEquals(expected, actual);
    }

}
