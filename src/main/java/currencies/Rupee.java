package currencies;

public class Rupee {

    private double rupeeValue = 68.32;

    public Rupee() {};

    public double inUSD(double rupees) {
        return rupees / rupeeValue;
    }

    public double convertToCandadianDollars(double rupees){
        double poundsInUSD = inUSD(rupees);
        return poundsInUSD * 1.32;
    }
}
