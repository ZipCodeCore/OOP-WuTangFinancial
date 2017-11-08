package currencies;

public class SwissFranc {
    private double swissFrancValue = 1.01;

    public SwissFranc(){};

    public double inUSD(double dollars) {
        return dollars / swissFrancValue;
    }

    public double convertToRinggit(double dollars){
        double francsInUSD = inUSD(dollars);
        return francsInUSD * 4.47;
    }
}
