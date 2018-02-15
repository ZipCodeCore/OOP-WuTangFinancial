public class SingaporeDollar extends Currency {
    private double exchangeRate;
    private String currencySymbol;

    public SingaporeDollar(double exchangeRate) {
        super(exchangeRate,  "S$");
    }
}
