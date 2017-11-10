package currencies;

public class Euro extends Currency{

    private double euroValue = 0.94;

    public Euro(){};

    public double inUSD(double euros) {
        return euros / euroValue;
    }

    public double convertToPounds(double euros){
        double eurosInUSD = inUSD(euros);
        return eurosInUSD * 0.88;
    }

    public double getEuroValue() {
        return euroValue;
    }

}
