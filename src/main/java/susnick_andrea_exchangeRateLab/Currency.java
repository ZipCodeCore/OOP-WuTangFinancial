package susnick_andrea_exchangeRateLab;

public enum Currency {

    USD("usa dollar", 1.00),
    EURO("euro", 0.94),
    GBP("british pound", 0.82),
    INR("indian rupee", 68.32),
    AUD("australian dollar", 1.35),
    CAD("canadian dollar", 1.32),
    SGD("singapore dollar", 1.43),
    CHF("swiss franc", 1.01),
    MYR("malaysian ringgit", 4.47),
    JPY("japan yen", 115.84),
    CNY("chinese yuan renminbi", 6.92);

    final double exchangeRate;

    Currency(String name, double exchangeRate){
        this.exchangeRate = exchangeRate;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }
}
