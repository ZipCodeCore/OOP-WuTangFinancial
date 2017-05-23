package io.zipcoder.aaronlong.wutangfinancial;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by aaronlong on 5/22/17.
 */
public class MoneyTest {

  private Money monetary;

  @Before
  public void setUp() {
    //Currencies CANDOLLAR = Currencies.values()[Currencies.CANDOLLAR.ordinal()];
    monetary = Money.mintMoney(Currencies.CANDOLLAR);
  }

  @Test
  public void testMoneyCreation() {
    assertTrue("Confirming Object creation", monetary != null);
  }

  @Test
  public void testToString() {
    assertEquals("Confirming currency symbol is properly returned", "C$0.00", monetary.toString());
  }

  @Test
  public void testExchangeRateReturned() {
    monetary.addQuantity(Currencies.USDOLLAR,600);
    assertEquals("Confirming proper exchange to Dollar conversion", 792000, monetary.getQuantity());
  }

  @Test
  public void testAddingForeignCurrency() {
    monetary.addQuantity(Currencies.JPYEN,10000);
    assertEquals("Confirming adding value from other currency provides a correct value",
            113949, monetary.getQuantity());
  }
}
