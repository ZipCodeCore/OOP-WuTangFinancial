package io.zipcoder.aaronlong.wutangfinancial;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by aaronlong on 5/23/17.
 */
public class ConversionTest {
  @Test
  public void dollarsToEuros() {
    Money euros = Money.mintMoney(Currencies.EURO);
    euros.addQuantity(Currencies.USDOLLAR, 400);
    assertEquals("Confirming Euros to Dollars conversion", 376000, euros.getQuantity());
  }

  @Test
  public void eurosToDollars() {
    Money usdollars = Money.mintMoney(Currencies.USDOLLAR);
    usdollars.addQuantity(Currencies.EURO, 700);
    assertEquals("Confirming Euros to Dollars conversion", 65800, usdollars.getQuantity());
  }

  @Test
  public void eurosToPound() {
    Money euros = Money.mintMoney(Currencies.POUND);
    euros.addQuantity(Currencies.EURO, 700);
    assertEquals("Confirming Euro to Pound conversion", 539560, euros.getQuantity());
  }

  @Test
  public void rupeeToCanadianDollars() {
    Money canDollar = Money.mintMoney(Currencies.CANDOLLAR);
    canDollar.addQuantity(Currencies.RUPEE, 800);
    assertEquals("Confirming Rupees to Canadian Dollars ", 15455, canDollar.getQuantity());
  }

  @Test
  public void canadianDollarsToSingaporeDollar() {
    Money canDollar = Money.mintMoney(Currencies.CANDOLLAR);
    canDollar.addQuantity(Currencies.SGDOLLAR, 1800);
    assertEquals("Confirming Singapore to Canadian Dollars ", 1661538, canDollar.getQuantity());
  }

  @Test
  public void singaporeDollarToSwissFranc() {
    Money singDollar = Money.mintMoney(Currencies.CHFRANK);
    singDollar.addQuantity(Currencies.SGDOLLAR, 7000);
    assertEquals("Confirming Singapore Dollars to Swiss Franks ", 4944055, singDollar.getQuantity());
  }

  @Test
  public void swissFrancToMaylasianRiggit() {
    Money swissFranc = Money.mintMoney(Currencies.MYRINGGIT);
    swissFranc.addQuantity(Currencies.CHFRANK, 7000);
    assertEquals("Confirming Singapore Dollars to Swiss Franks ", 30980197, swissFranc.getQuantity());
  }

  @Test
  public void malaysianRigidToJapaneseYuan() {
    Money ringitt = Money.mintMoney(Currencies.MYRINGGIT);
    ringitt.addQuantity(Currencies.JPYEN, 90000);
    assertEquals("Confirming Singapore Dollars to Swiss Franks ", 3472890, ringitt.getQuantity());
  }

  @Test
  public void japaneseYenToChineseYuan() {
    Money chineseYuan = Money.mintMoney(Currencies.CNYUAN);
    chineseYuan.addQuantity(Currencies.JPYEN, 90000);
    assertEquals("Confirming Japanese Yen to Chinese Yan", 5376376, chineseYuan.getQuantity());
  }
}
