import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

/**
 * created by Frankie!!!
 */

public class CurrencyConverter {
    private double convertIn;
    private TreeMap<String, Double> convertList;
    public double convertedValue;

    public CurrencyConverter(double valueToConvert) {
        this.convertIn = valueToConvert;
        this.convertList = new TreeMap<String, Double>();
        this.convertList.put("euro", 0.94);
        this.convertList.put("british pound", 0.82);
        this.convertList.put("indian rupee", 68.32);
        this.convertList.put("australian dollar", 1.35);
        this.convertList.put("canadian dollar", 1.32);
        this.convertList.put("singapore dollar", 1.43);
        this.convertList.put("swiss franc", 1.01);
        this.convertList.put("malaysian ringgit", 4.47);
        this.convertList.put("japanese yen", 115.84);
        this.convertList.put("chinese yuan renminbi", 6.92);

    }

    public double convertingInterface(double moneyValue, String beginningC, String endDestination) {
        Double conversionRate;

        //from other to USD
        if ((endDestination.toLowerCase()).equals("us dollar")) {
            conversionRate = convertList.get(beginningC.toLowerCase());
            convertedValue = fromOthertoUSD(moneyValue, conversionRate);
        }
        //from USD to other
        else if (beginningC.toLowerCase().equals("us dollar")) {
            conversionRate = convertList.get(endDestination.toLowerCase());
            convertedValue = fromUSDtoOther(moneyValue, conversionRate);
        } else {
            //convert beginning to USD
            double result;
            conversionRate = convertList.get(beginningC.toLowerCase());
            result = fromOthertoUSD(moneyValue, conversionRate);

            //convert USD to other
            conversionRate = convertList.get(endDestination.toLowerCase());
            convertedValue = fromUSDtoOther(result, conversionRate);

        }

        //money rounding
        double temp = convertedValue * 100;

        temp = Math.round(temp);

        double result = temp / 100;

        //return result
        return result;

    }

    public double fromUSDtoOther(double passInValue, Double conversionRate) {
        double result = passInValue * conversionRate;
        return result;
    }

    public Double fromOthertoUSD(double passInValue, Double conversionRate) {
        Double result = passInValue / (Double.valueOf(conversionRate));
        return result;
    }
}
