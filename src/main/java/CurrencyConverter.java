import Utilities.Console;

public class CurrencyConverter {

    enum ConversionRates { //Start enum ConversionRates
        UsDollar(1.00), Euro(.94), BritishPound(.82), IndianRupee(68.32), AustrialianDollar(1.35),
        CanadianDollar(1.32), SingaporeDollar(1.43), SwissFranc(1.01), MalaysianRinnggit(4.47),
        JapaneseYen(115.84), ChineseYuanRenminbi(6.92);

        private Double rate;

        ConversionRates(Double rate) {
            this.rate = rate;
        }

        public Double getRate() {
            return rate;
        }
    } // End enum ConversionRates

    public static Double convertToDesiredCurrencyValue(Double currentCurrencyAmount, String currentCurrency, String desiredCurrency) {
        Double conversionRate = calculateConversionRate(currentCurrency, desiredCurrency);
        Double convertedCurrencyValue = currentCurrencyAmount * conversionRate;
        return convertedCurrencyValue;
    }

    private static Double calculateConversionRate(String currentCurrency, String desiredCurrency) {
        Double currentCurrencyRate = getConversionRates(currentCurrency);
        Double desiredCurrencyRate = getConversionRates(desiredCurrency);
        Double conversionRate = desiredCurrencyRate / currentCurrencyRate;
        return conversionRate;
    }

    private static Double getConversionRates(String currency) {
        Double conversionRate = null;
        switch (ConversionRates.valueOf(currency)) {
            case UsDollar:
                conversionRate = ConversionRates.UsDollar.getRate();
                break;
            case Euro:
                conversionRate = ConversionRates.Euro.getRate();
                break;
            case BritishPound:
                conversionRate = ConversionRates.BritishPound.getRate();
                break;
            case IndianRupee:
                conversionRate = ConversionRates.IndianRupee.getRate();
                break;
            case AustrialianDollar:
                conversionRate = ConversionRates.AustrialianDollar.getRate();
                break;
            case CanadianDollar:
                conversionRate = ConversionRates.CanadianDollar.getRate();
                break;
            case SingaporeDollar:
                conversionRate = ConversionRates.SingaporeDollar.getRate();
                break;
            case SwissFranc:
                conversionRate = ConversionRates.SwissFranc.getRate();
                break;
            case MalaysianRinnggit:
                conversionRate = ConversionRates.MalaysianRinnggit.getRate();
                break;
            case JapaneseYen:
                conversionRate = ConversionRates.JapaneseYen.getRate();
                break;
            case ChineseYuanRenminbi:
                conversionRate = ConversionRates.ChineseYuanRenminbi.getRate();
                break;
        }
        return conversionRate;
    } // end method getConversionRates

} // end class CurrencyConverter
