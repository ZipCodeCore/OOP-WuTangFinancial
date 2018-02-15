public class CanadianDollar extends Currency{
    private double exchangeRate;
    private String currencySymbol;

    public CanadianDollar(double exchangeRate) {
        super(exchangeRate,  "CAN$");
    }
}
