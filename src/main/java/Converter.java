/**
 * Created by anthonyjones on 5/23/17.
 */
public class Converter {
    Calculate calculate = new Calculate();

    public double conversionMethod(double money, Currency currency) {
        switch (currency) {
            case USD:
                return money;
            case EURO:
                return calculate.convertUSDToEuros(money);
            case SWISSFRANC:
                return calculate.convertUSDtoSwissFranc(money);
            case AUSTRALIANDOLLAR:
                return calculate.convertUSDToAustralianDollar(money);
            case CANADIANDOLLAR:
                return calculate.convertUSDToCanadianDollar(money);
            case SINGAPORIANDOLLAR:
                return calculate.convertUSDToSingaporeanDollar(money);
            case YUAN:
                return calculate.convertUSDToYuan(money);
            case YEN:
                return calculate.convertUSDToYen(money);
            case RINGGIT:
                return calculate.convertUSDToRinggit(money);
            case RUPEE:
                return calculate.convertUSDToRupee(money);
            case BRITISHPOUND:
                return calculate.convertUSDToPound(money);
            default:
                break;
        }

        return calculate.round(money, 2);
    }
}
