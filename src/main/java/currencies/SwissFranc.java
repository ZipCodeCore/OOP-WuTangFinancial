package currencies;

public class SwissFranc {
    private double swissFrancValue = 1.01;

    public SwissFranc(){};

    public double inUSD(double dollars) {
        return dollars / swissFrancValue;
    }

    public double convertToRinggit(double franc){
        double francsInUSD = inUSD(franc);
        return francsInUSD * 4.47;
    }
}
