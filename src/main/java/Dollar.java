public class Dollar extends Currency {
    private double exchangeRate;
    private String currencySymbol;


    public Dollar(double exchangeRate) {
        super(exchangeRate, "$");
    }
}
