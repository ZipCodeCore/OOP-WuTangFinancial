package currencies;

public class BritishPound extends Currency{

    private double poundValue = 0.82;

    public BritishPound(){};

    public double inUSD(double pounds) {
        return pounds / poundValue;
    }

    public double convertToRupees(double pounds){
        double poundsInUSD = inUSD(pounds);
        return poundsInUSD * 68.32;
    }
}