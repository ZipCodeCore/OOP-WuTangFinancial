public class IndianRupee extends Currency{
    private double exchangeRate;
    private String currencySymbol;

    public IndianRupee(double exchangeRate) {
        super(exchangeRate,  "\u20A8");
    }
}
