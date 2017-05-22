package wolfe.michael.WUTANGFinancial;

import java.text.DecimalFormat;


public class CalculateExchange {
    public double USD;
    public double EUR;
    public double GBP;
    public double INR;
    public double AUD;
    public double CAD;
    public double SGD;
    public double CHF;
    public double MYR;
    public double JPY;
    public double CNY;

    public CalculateExchange() {
        this.USD = 1.00;
        this.EUR = 0.94;
        this.GBP = 0.82;
        this.INR = 68.32;
        this.AUD = 1.35;
        this.CAD = 1.32;
        this.SGD = 1.43;
        this.CHF = 1.01;
        this.MYR = 4.47;
        this.JPY = 115.84;
        this.CNY = 6.92;
    }

    DecimalFormat df = new DecimalFormat("0.00");
    public String exchange(double convertFrom, double convertTo, double amount) {
        double ratio = convertTo / convertFrom;
        double total = ratio * amount;
        return df.format(total);
    }
}
