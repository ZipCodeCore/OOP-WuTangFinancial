public class ChineseYuan extends Currency {
    private double exchangeRate;
    private String currencySymbol;

    public ChineseYuan(double exchangeRate) {
        super(exchangeRate,  "\u5706");
    }
}
