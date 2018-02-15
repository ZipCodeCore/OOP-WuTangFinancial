public class SwissFranc extends Currency {
    private double exchangeRate;
    private String currencySymbol;

    public SwissFranc(double exchangeRate) {
        super(exchangeRate,  "\u20A3");
    }
}
