package wolfe.michael.WUTANGFinancial;

/**
 * Created by michaelwolfe on 1/12/17.
 */
public class ExchangeRateRetriever {

    public static double retrieveRate(String country){
        double exchangeRate = 0.0;

        switch (country){
            case "USD":
                exchangeRate = 1.00;
                break;
            case "EUR":
                exchangeRate = 0.94;
                break;
            case "GBP":
                exchangeRate = 0.82;
                break;
            case "INR":
                exchangeRate = 68.32;
                break;
            case "AUD":
                exchangeRate = 1.35;
                break;
            case "CAD":
                exchangeRate = 1.32;
                break;
            case "SGD":
                exchangeRate = 1.43;
                break;
            case "CHF":
                exchangeRate = 1.01;
                break;
            case "MYR":
                exchangeRate = 4.47;
                break;
            case "JPY":
                exchangeRate = 115.84;
                break;
            case "CNY":
                exchangeRate = 6.92;
                break;
        }
        return exchangeRate;
    }
}
