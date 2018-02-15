import java.util.Scanner;


public class Currency {
    public static final double USD = 1.00;
    public static final double EURO = 0.94;
    public static final double POUND = 0.82;
    public static final double RUPEE = 68.32;
    public static final double AUSTRALIAN = 1.35;
    public static final double CANADIAN = 1.32;
    public static final double SINGAPORE = 1.43;
    public static final double SWISS = 1.01;
    public static final double MALAYSIAN = 4.47;
    public static final double YEN = 115.84;
    public static final double YUAN = 6.92;


    public static double exchanger(double initialVal, double firstCurrency, double secondCurrency) {
        return (initialVal / firstCurrency) * secondCurrency;
    }

}
