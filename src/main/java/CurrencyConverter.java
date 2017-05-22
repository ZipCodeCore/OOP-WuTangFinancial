

/**
 * Created by aurorabanuelos on 5/22/17.
 */
public class CurrencyConverter {



    public double convert(String currentCurrency, String foreignCurrency, double amountToBeConverted){

        double convertedAmount;
        double toUSDAmount;

        toUSDAmount = amountToBeConverted * getFXRate(currentCurrency);
        convertedAmount = toUSDAmount * getFXRate(foreignCurrency);

        return convertedAmount;
    }



    public double getFXRate(String currency){

        switch (currency) {

            case "USD":
                return 1.00;

            case "EUR":
                return 0.94;

            case "GBP":
                return 0.82;

            case "INR":
                return 68.32;

            case "AUD":
                return 1.35;

            case "CAD":
                return 1.32;

            case "SGD":
                return 1.43;

            case "CHF":
                return 1.01;

            case "MYR":
                return 4.47;

            case "JPY":
                return 115.84;

            case "CNY":
                return 6.92;


            default:
                break;

        }
        return 0.00;
    }
}
