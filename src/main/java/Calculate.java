import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.logging.Logger;

/**
 * Created by anthonyjones on 5/22/17.
 */
public class Calculate {

    double currentRate;
        double money;
    public static final Logger logger = Logger.getLogger("*");


    public double conversionMethod(double money, Currency currency) {
        switch (currency) {
            case USD:
                return money;
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

        return round(money, 2);
    }

    public double convertUSDToEuros(double money) {
        currentRate = 0.94;
        money = money * currentRate;
        return round(money, 2);
    }

    public double convertUSDToPound(double money) {
        currentRate = 0.82;
        money = money * currentRate;
        return round(money, 2);
    }

    public double convertUSDToRupee(double money) {
        currentRate = 68.32;
        money = money * currentRate;
        return round(money, 2);
    }

    public double convertUSDToAustralianDollar(double money) {
        money = money * 1.35;
        return round(money, 2);
    }

    public double convertUSDToCanadianDollar(double money) {
        money = money * 1.32;
        return round(money, 2);
    }

    public double convertUSDToSingaporeanDollar(double money) {
        money = money * 1.43;
        return round(money, 2);
    }

    public double convertUSDtoSwissFranc(double money) {
        money = money * 1.01;
        return round(money, 2);
    }

    public double convertUSDToRinggit(double money) {
        money = money * 4.47;
        return round(money, 2);
    }

    public double convertUSDToYen(double money) {
        money = money * 115.84;
        return round(money, 2);
    }

    public double convertUSDToYuan(double money) {
        money = money * 6.92;
        return round(money, 2);
    }

    public double convertEurosToUSD(double money) {
        money = money / 0.94;
        return round(money, 2);
    }

    public double convertPoundsToUSD(double money) {
        currentRate = 0.82;
        money = money / currentRate;
        return round(money, 3);
    }

    public double convertRupeeToUSD(double money) {
        currentRate = 68.32;
        money = money / currentRate;
        return round(money, 2);
    }

    public double convertYuanToUSD(double money) {
        if (money <= 0) {
            logger.warning("You must supply a number greater than 0!");
            throw new IllegalArgumentException();
        }
        currentRate = 6.92;
        money = money / currentRate;
        return round(money, 2);
    }

    public double convertYenToUSD(double money) {
        if (money <= 0) {
            logger.warning("You must supply a number greater than 0!");
            throw new IllegalArgumentException();
        }
        currentRate = 115.84;
        money = money / currentRate;
        return round(money, 2);
    }

    public double convertRinggitToUSD(double money) {
        if (money <= 0) {
            logger.warning("You must supply a number greater than 0!");
            throw new IllegalArgumentException();
        }
        currentRate = 4.47;
        money = money / currentRate;
        return round(money, 2);
    }

    public double convertSwissFrancToUSD(double money) {
        currentRate = 1.01;
        money = money / currentRate;
        return round(money, 2);
    }

    public double convertAustralianDollarToUSD(double money) {
        currentRate = 1.35;
        money = money / currentRate;
        return round(money, 2);
    }

    public double convertCanadianDollarToUSD(double money) {
        currentRate = 1.32;
        money = money / currentRate;
        return round(money, 2);
    }

    public double convertSingaporeanDollarToUSD(double money) {
        currentRate = 1.43;
        money = money / currentRate;
        return round(money, 2);
    }

    public static double round(double val, int decimalPlace) {
        if (decimalPlace < 0) {
            throw new IllegalArgumentException();
        }
        BigDecimal bigDecimal = new BigDecimal(val);
        bigDecimal = bigDecimal.setScale(decimalPlace, RoundingMode.HALF_DOWN);
        return bigDecimal.doubleValue();
    }

    public void setNumber1(double number1) {
        this.money = number1;
    }

}
