package io.zipcoder.aaronlong.wutangfinancial;

/**
 * Created by aaronlong on 5/22/17.
 */
public enum Currencies {
  USDOLLAR(100, "$"),
  EURO(940, "€"),
  POUND(820, "£"),
  RUPEE(68320, "₹"),
  AUDOLLAR(1350, "A$"),
  SGDOLLAR(1430, "S$"),
  CANDOLLAR(1320, "C$"),
  CHFRANK(1010, "CHF"),
  MYRINGGIT(4470, "RM"),
  JPYEN(115840, "¥"),
  CNYUAN(6920, "¥");

  private long exchangeRate;
  private String symbol;

  Currencies(long theExchangeRate, String theSymbol) {
    exchangeRate = theExchangeRate;
    symbol = theSymbol;
  }

  @Override
  public String toString() {
    return symbol;
  }

  public long getExchangeRate() {
    return exchangeRate;
  }

}
