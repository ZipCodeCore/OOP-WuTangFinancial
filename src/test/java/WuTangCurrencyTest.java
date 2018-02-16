import org.junit.Assert;
import org.junit.Test;

public class WuTangCurrencyTest {

    WuTangCurrency exchangeRate = new WuTangCurrency(); //created to test currencyExchangeFormula()

    @Test
    public void usDollarToEuroTest() {
        double amountFrom = 1.00;
        double expected = 0.94;
        double actual = exchangeRate.currencyExchangeFormula(amountFrom, exchangeRate.US_DOLLAR, exchangeRate.EURO);
        Assert.assertEquals(expected, actual, 0.01); //delta measures accuracy, within .01
    }

    @Test
    public void EuroToUsDollarTest() {
        double amountFrom = 0.94;
        double expected = 1.00;
        double actual = exchangeRate.currencyExchangeFormula(amountFrom, exchangeRate.EURO, exchangeRate.US_DOLLAR);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void EuroToBritishPoundTest() {
        double amountFrom = 0.94;
        double expected = 0.82;
        double actual = exchangeRate.currencyExchangeFormula(amountFrom, exchangeRate.EURO, exchangeRate.BRITISH);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void BritishPoundToINDIAN_RUPEETest() {
        double amountFrom = 0.82;
        double expected = 68.32;
        double actual = exchangeRate.currencyExchangeFormula(amountFrom, exchangeRate.BRITISH, exchangeRate.INDIAN_RUPEE);
        Assert.assertEquals(expected, actual, 0.01);
    }

   @Test
    public void IndianRupeeToCanadianDollarTest(){
        double amountFrom = 68.82;
        double expected = 1.32;
        double actual = exchangeRate.currencyExchangeFormula(amountFrom, exchangeRate.INDIAN_RUPEE, exchangeRate.CANADIAN_DOLLAR);
       Assert.assertEquals(expected, actual, 0.01);
   }

    @Test
    public void CanadianDollarToSingaporeDollarTest(){
        double amountFrom = 1.32;
        double expected = 1.43;
        double actual = exchangeRate.currencyExchangeFormula(amountFrom, exchangeRate.CANADIAN_DOLLAR, exchangeRate.SINGAPORE_DOLLAR);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void SingaporeDollarToSwissFrancTest(){
        double amountFrom = 1.43;
        double expected = 1.01;
        double actual = exchangeRate.currencyExchangeFormula(amountFrom, exchangeRate.SINGAPORE_DOLLAR, exchangeRate.SWISS_FRANC);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void SwissFrancToMalaysianRinggitTest(){
        double amountFrom = 1.01;
        double expected = 4.47;
        double actual = exchangeRate.currencyExchangeFormula(amountFrom, exchangeRate.SWISS_FRANC, exchangeRate.MALAYSIAN_RINGGIT);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void MalaysianRinggitToJapaneseYenTest(){
        double amountFrom = 4.47;
        double expected = 115.84;
        double actual = exchangeRate.currencyExchangeFormula(amountFrom, exchangeRate.MALAYSIAN_RINGGIT, exchangeRate.JAPANESE_YEN);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void JapaneseYenToChineseYuanRenminbiTest(){
        double amountFrom = 115.84;
        double expected = 6.92;
        double actual = exchangeRate.currencyExchangeFormula(amountFrom, exchangeRate.JAPANESE_YEN, exchangeRate.CHINESE_YUAN_RENMINBI);
        Assert.assertEquals(expected, actual, 0.01);
    }


}