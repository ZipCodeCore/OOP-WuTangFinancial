import Utilities.Console;

public class CurrencyConverter {

    private static final String supportedCurrencies = "(UsDollar, Euro," +
            " BritishPound, IndianRupee, AustrialianDollar, CanadianDollar, SingaporeDollar," +
            " SwissFranc, MalaysianRinggit, JapaneseYen, ChineseYuanRenminbi)";

    public static String getSupportedCurrencies() {
        return supportedCurrencies;
    }

    enum ConversionRates { //Start enum ConversionRates
        UsDollar(1.00), Euro(.94), BritishPound(.82), IndianRupee(68.32), AustrialianDollar(1.35),
        CanadianDollar(1.32), SingaporeDollar(1.43), SwissFranc(1.01), MalaysianRinggit(4.47),
        JapaneseYen(115.84), ChineseYuanRenminbi(6.92);

        private Double rate;

        ConversionRates(Double rate) {
            this.rate = rate;
        }

        public Double getRate() {
            return rate;
        }
    } // End enum ConversionRates

    public static Double convertFromCurrentCurrencyToDesiredCurrency(Double currentCurrencyAmount, String currentCurrency, String desiredCurrency) {
        Double conversionRate = calculateConversionRate(currentCurrency, desiredCurrency);
        Double convertedCurrencyValue = currentCurrencyAmount * conversionRate;
        return convertedCurrencyValue;
    }

    protected static Double calculateConversionRate(String currentCurrency, String desiredCurrency) {
        Double currentCurrencyRate = getRate(currentCurrency);
        Double desiredCurrencyRate = getRate(desiredCurrency);
        Double conversionRate = desiredCurrencyRate / currentCurrencyRate;
        return conversionRate;
    }

    public static Double getRate(String currency) {
        Double rate;
        rate = ConversionRates.valueOf(currency).getRate();
        return rate;
    }

    public static String checkCurrencyType(String prompt) {
        String currencyType = Console.getStringInput(prompt);
            try {
                ConversionRates.valueOf(currencyType);
            } catch (IllegalArgumentException e) {
                currencyType = checkCurrencyType(prompt);
            }
            return currencyType;
    } // end method checkCurrencyType

} // end class CurrencyConverter
