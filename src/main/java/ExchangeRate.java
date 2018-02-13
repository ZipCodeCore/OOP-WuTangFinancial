import java.text.DecimalFormat;

public class ExchangeRate {

    static double USD = 1.00;
    static double EUR = 0.94; //Euro
    static double GBP = 0.82; //British Pound
    static double INR = 68.32; //Indian Rupee
    static double AUD = 1.35; //Austrailian Dollar
    static double CAD = 1.32; //Canadian Dollar
    static double SGD = 1.43; //Singapore Dollar
    static double CHF = 1.01; //Swiss Franc
    static double MYR = 4.47; //Malaysian Ringgit
    static double JPY = 115.84; //Japanese Yen
    static double CNY = 6.92; //Chinese Yuan Renminbi

    public static double convert(double InitialAmount, double initialCurrency, double targetCurrency) {
        //Amount will be standardized at USD
        double converted = (InitialAmount/initialCurrency) * targetCurrency;
        DecimalFormat rounded = new DecimalFormat("#.00");
        return Double.parseDouble(rounded.format(converted));
    }

}
