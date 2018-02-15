public class MalaysianRinggit extends Currency{
    private double exchangeRate;
    private String currencySymbol;

    public MalaysianRinggit(double exchangeRate) {
        super(exchangeRate,  "RM");
    }
}
