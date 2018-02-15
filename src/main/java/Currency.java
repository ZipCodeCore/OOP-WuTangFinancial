

public class Currency {
    public static final double USD =1;
    public static final double EURO =0.94;
    public static final double BPOUND = 0.82;
    public static final double RUPEE = 68.32;
    public static final double AUS = 1.35;
    public static final double CAN = 1.32;
    public static final double SING = 1.43;
    public static final double FRANC =1.01;
    public static final double RINGGIT =4.47;
    public static final double YEN = 115.84;
    public static final double CHINA = 6.92;


    public static double currency(double initialValue, double firstCurrency, double secondCurrency){
        return (initialValue/firstCurrency) * secondCurrency;
        }
}
