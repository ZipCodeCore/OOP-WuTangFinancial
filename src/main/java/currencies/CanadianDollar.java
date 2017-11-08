package currencies;

public class CanadianDollar {

    private double canadianDollarValue = 1.32;

    public CanadianDollar() {};

    public double inUSD(double dollars) {
        return dollars / canadianDollarValue;
    }

    public double convertToSingaporeanDollars(double dollars){
        double dollarsInUSD = inUSD(dollars);
        return dollarsInUSD * 1.43;
    }
}
