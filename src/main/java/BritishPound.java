public class BritishPound extends Currency{
    private double exhcangeRate;
    private String currencySymbol;

    public BritishPound(double exchangeRate) {
        super(exchangeRate,  "\u00A3");
    }
}
