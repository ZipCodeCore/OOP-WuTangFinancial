package holland.andres.currencyconverter;

public class LookupCurrentRate {

    private double result = 0;

    public double lookupRate (String currencyType) {
        switch (currencyType) {
            case "USD": result = 1; break;
            case "EURO": result = .94; break;
            case "GDP": result = .82; break;
            case "IND": result = 68.32; break;
            case "AUS": result = 1.35; break;
            case "CAD": result = 1.32; break;
            case "SIG": result = 1.43; break;
            case "SWISS": result = 1.01; break;
            case "MAL": result = 4.47; break;
            case "JAP": result = 115.84; break;
            case "CHI": result = 6.92; break;
        }
        return result;
    }
}
