public enum Currency {
    USD(1.00), EUR(0.94), GBP(0.82), INR(68.32), AUD(1.35), CAD(1.32), SGD(1.43), CHF(1.01), MYR(4.47), JPY(115.84), CNY(6.92);

    private final double rate;

    Currency(double exchangeRate) {this.rate = exchangeRate;}

    public double getRate() {
        return this.rate;
    }

}