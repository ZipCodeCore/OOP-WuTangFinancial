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
                return dollar;
            case "euro":
                return euro;
            case "pound":
                return pound;
            case "rupee":
                return rupee;
            case "ausdollar":
                return ausDollar;
            case "candollar":
                return canDollar;
            case "sgpdollar":
                return sgpDollar;
            case "franc":
                return franc;
            case "ringgit":
                return ringgit;
            case "yen":
                return yen;
            case "yuan":
                return yuan;
            default:
                return -1.0;
        }
    }
}
