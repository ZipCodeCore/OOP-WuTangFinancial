package currencies;

public class SingaporeDollar {
    private double singaporeanDollarValue = 1.43;

    public SingaporeDollar(){};

    public double inUSD(double dollars) {
        return dollars / singaporeanDollarValue;
    }

    public double convertToSwissFranc(double dollars){
        double dollarsInUSD = inUSD(dollars);
        return dollarsInUSD * 1.01;
    }
}
