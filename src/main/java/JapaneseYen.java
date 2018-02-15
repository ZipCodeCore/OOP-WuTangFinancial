public class JapaneseYen extends Currency {
    private double exchangeRate;
    private String currencySymbol;

    public JapaneseYen(double exchangeRate) {
        super(exchangeRate,  "\u00A5");
    }
}
