package io.zipcoder.aaronlong.wutangfinancial;

/**
 * Created by aaronlong on 5/22/17.
 */
public class Money {
  private Currencies currency;
  private long quantity;

  private Money(Currencies theCurrency) {
    currency = theCurrency;
    quantity = 0;
  }

  public static Money mintMoney(Currencies currency) {
    return new Money(currency);
  }

  @Override
  public String toString() {
    double formatted = downHandleDoubles(quantity);
    return String.format("%s%.2f", currency.toString(), formatted);
  }

  public long toUsDollar() {
    return convertToUsDollar(quantity, currency.getExchangeRate());
  }

  private static long convertToUsDollar(long quantity, long exchange) {
    if (exchange > 1000) {
      double total = (downHandleDoubles(quantity) / downHandleDoubles(exchange));
      return upHandleDoubles(total);
    } else if (exchange < 1000) {
      double total = downHandleDoubles(quantity) * downHandleDoubles(exchange);
      return upHandleDoubles(total);
    }
    return quantity;
  }

  private long convertToCurrency(long usDollars) {
    double exchange;
    long exchangeRate = currency.getExchangeRate();
    if (exchangeRate > 1000) {
      exchange = (downHandleDoubles(usDollars) * downHandleDoubles(exchangeRate));
    } else if (exchangeRate < 1000) {
      exchange = (downHandleDoubles(usDollars) / downHandleDoubles(exchangeRate));
    } else {
      exchange = usDollars;
    }
    return upHandleDoubles(exchange);
  }

  public void addQuantity(Currencies foreignCurrency, long theQuantity) {
    long quantityFormatted = theQuantity * 1000;
    if (foreignCurrency == Currencies.USDOLLAR) {
      quantity += convertToCurrency(quantityFormatted);
    } else {
      long convertedForeignCurrency = convertToUsDollar(quantityFormatted,
              foreignCurrency.getExchangeRate());
      quantity += convertToCurrency(convertedForeignCurrency);
    }
  }

  public long getQuantity() {
    return quantity;
  }

  private static long upHandleDoubles(double unformatted) {
    return (long) (unformatted * 1000);
  }

  private static double downHandleDoubles(long unformatted) {
    return (unformatted / 1000.0);
  }

}
