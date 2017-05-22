import java.text.DecimalFormat;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by anthonyjones on 5/22/17.
 */
public class Calculate {

    double money;
    double newSum;
    static Map<String, Double> currentCurrency = new TreeMap<>();
    double currentRate;


    public double conversionMethod(double money, Currency currency) {//take an enum, and money amount, to do the calculations

        money = money / currentRate;

        switch (currency) {
            case USD:
                return convertUSDToEuros(money);
            case EURO:
                return convertUSDToEuros(money);
            case SWISSFRANC:
               return convertUSDtoSwissFranc(money);
            case AUSTRALIANDOLLAR:
                return convertUSDToAustralianDollar(money);
            case CANADIANDOLLAR:
                return convertUSDToCanadianDollar(money);
            case SINGAPORIANDOLLAR:
                return convertUSDToSingaporeanDollar(money);
            case YUAN:
                return convertUSDToYuan(money);
            case YEN:
                return convertUSDToYen(money);
            case RINGGIT:
                return convertUSDToRinggit(money);
            case RUPEE:
                return convertUSDToRupee(money);
            case BRITISHPOUND:
                return convertUSDToPound(money);
            default:
                break;
        }

        return money;
    }


    public double convertUSDToEuros(double money) {
        currentRate = 0.94;
        money = money * currentRate;
        currentCurrency.put("€", money);
        return money;
    }

    public double convertUSDToPound(double money) {
        currentRate = 0.82;
        money = money * currentRate;
        currentCurrency.put("£", money);
        return money;
    }

    public double convertUSDToRupee(double money) {
        currentRate = 68.32;
        money = money * currentRate;
        return money;
    }

    public double convertUSDToAustralianDollar(double money) {
        money = money * 1.35;
        return money;
    }

    public double convertUSDToCanadianDollar(double money) {
        money = money * 1.32;
        return money;
    }

    public double convertUSDToSingaporeanDollar(double money) {
        money = money * 1.43;
        return money;
    }

    public double convertUSDtoSwissFranc(double money) {
        money = money * 1.01;
        return money;
    }

    public double convertUSDToRinggit(double money) {
        money = money * 4.47;
        return money;
    }

    public double convertUSDToYen(double money) {
        money = money * 115.84;
        return money;
    }

    public double convertUSDToYuan(double money) {
        money = money * 6.92;
        return money;
    }

    public double convertEurosToUSD(double money) {
        money = money / 0.94;
        return money;
    }
}
