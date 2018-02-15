public class AustralianDollar extends Currency{
    private double exchangeRate;
    private String currencySymbol;

    public AustralianDollar(double exchangeRate) {
        super(exchangeRate,  "AU$");
    }
}
