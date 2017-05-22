import java.text.DecimalFormat;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by anthonyjones on 5/22/17.
 */
public class Calculate {

    double money;
    double newSum;
    Map<String, Double> currentCurrency = new TreeMap<>();


    public double convertToUSDollar(double money, Currency currency) {//take an enum, and money amount, to do the calculations

        switch (currency) {
            case EURO:// when called euro calls method to change it to usd, then convert to euro
                newSum = money * 1.01;
                money = newSum * 0.94;
                break;
            case SWISSFRANC:
                newSum = money * 1.01;
                money = newSum * 0.94;
                break;
            default:
                break;
        }

        return money;
    }


    public double convertUSDToEuros(double money) {
        money = money * 0.94;
        currentCurrency.put("€", money);
        return money;
    }

    public double convertUSDToPound(double money) {
        money = money * 0.82;
        currentCurrency.put("£",money);
        return money;
    }

    public double convertUSDToRupee(double money) {
        money = money * 68.32;
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

    public double convertEurosToUSD(double money){
        return money;
    }
}
