package squier.john.wutangFinancial;

/**
 * This class stores the exchange rates for various currencies relative to the U.S. Dollar.
 * @author John Squier
 * @author github.com/jasquier
 * @version 1.0
 */
public class DollarExchangeRates {

    private double dollar = 1.00;
    private double euro = 0.94;
    private double pound = 0.82;
    private double rupee = 68.32;
    private double ausDollar = 1.35;
    private double canDollar = 1.32;
    private double sgpDollar = 1.43;
    private double franc = 1.01;
    private double ringgit = 4.47;
    private double yen = 115.84;
    private double yuan = 6.92;

    public Double getDollarExchangeRate(String inputCurrency) {

        switch(inputCurrency.toLowerCase()) {

            case "dollar":
            case "dollars":
                return dollar;
            case "euro":
            case "euros":
                return euro;
            case "pound":
            case "pounds":
                return pound;
            case "rupee":
            case "rupees":
                return rupee;
            case "ausdollar":
            case "ausdollars":
                return ausDollar;
            case "candollar":
            case "candollars":
                return canDollar;
            case "sgpdollar":
            case "sgpdollars":
                return sgpDollar;
            case "franc":
            case "francs":
                return franc;
            case "ringgit":
            case "ringgits":
                return ringgit;
            case "yen":
            case "yens":
                return yen;
            case "yuan":
            case "yuans":
                return yuan;
            default:
                return -1.0;
        }
    }
}
