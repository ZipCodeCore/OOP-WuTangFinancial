public class Euro extends Currency {
    private double exhangeRate;
    private String currencySymbol;

    public Euro(double exchangeRate) {
        super(exchangeRate,  "\u20AC");
    }
}
