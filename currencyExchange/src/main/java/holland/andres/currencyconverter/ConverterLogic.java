package holland.andres.currencyconverter;

public class ConverterLogic {

    public double converter (double amount, String currencyType, String desiredCurrency) {
        ConvertToUSD convertToUSD = new ConvertToUSD();
        ConvertToDesired convertToDesired = new ConvertToDesired();
        RoundedResult roundedResult = new RoundedResult();
        double amountInUSD = convertToUSD.convertToUSD(amount, currencyType);
        double unRoundedResult = convertToDesired.convertToDesired(amountInUSD, desiredCurrency);
        return roundedResult.round(unRoundedResult);
    }
}
