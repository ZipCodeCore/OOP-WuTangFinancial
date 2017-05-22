package holland.andres.currencyconverter;

public class ConvertToUSD {

    public double convertToUSD (double amount, String currencyType) {
        LookupCurrentRate lookupCurrentRate = new LookupCurrentRate();
        double currentRate = lookupCurrentRate.lookupRate(currencyType);
        return amount / currentRate;
    }
}
