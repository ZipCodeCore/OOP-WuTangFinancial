package currencies;

public class MalaysianRinggit {
    private double malaysianRinggitValue = 4.47;

    public MalaysianRinggit(){}

    public double inUSD(double ringgits) {
        return ringgits / malaysianRinggitValue;
    }

    public double convertToYen(double ringgits){
        double ringgitsInUSD = inUSD(ringgits);
        return ringgitsInUSD * 115.84;
    }
}
