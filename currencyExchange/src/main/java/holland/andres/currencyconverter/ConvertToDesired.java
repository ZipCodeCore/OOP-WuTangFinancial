package holland.andres.currencyconverter;

public class ConvertToDesired {

    public double convertToDesired (double amountInUSD, String desiredCurrency) {
        LookupCurrentRate lookupCurrentRate = new LookupCurrentRate();
        double currentRateOfDesired = lookupCurrentRate.lookupRate(desiredCurrency);
        return amountInUSD * currentRateOfDesired;
    }
}
