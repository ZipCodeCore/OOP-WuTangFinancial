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
    private final String USD = "us dollar";
    private final String euro = "euro";
    private final String bP = "british pound";
    private final String iR = "indian rupee";
    private final String a$ = "australian dollar";
    private final String c$ = "canadian dollar";
    private final String s$ = "singapore dollar";
    private final String sF = "swiss franc";
    private final String mR = "malaysian ringgit";
    private final String jY = "japanese yen";
    private final String cYR = "chinese yuan renminbi";

    public CurrencyConverter(double valueToConvert) {
        this.convertIn = valueToConvert;
        this.convertList = new TreeMap<String, Double>();
        this.convertList.put(USD, 1.00);
        this.convertList.put(euro, 0.94);
        this.convertList.put(bP, 0.82);
        this.convertList.put(iR, 68.32);
        this.convertList.put(a$, 1.35);
        this.convertList.put(c$, 1.32);
        this.convertList.put(s$, 1.43);
        this.convertList.put(sF, 1.01);
        this.convertList.put(mR, 4.47);
        this.convertList.put(jY, 115.84);
        this.convertList.put(cYR, 6.92);

    }

    public double convertingInterface(double moneyValue, String beginningC, String endDestination) {
        double conversionRate;
            //convert beginning to USD
            double buffer;
            conversionRate = convertList.get(beginningC.toLowerCase());
            buffer = fromOthertoUSD(moneyValue, conversionRate);

            //convert USD to other
            conversionRate = convertList.get(endDestination.toLowerCase());
            convertedValue = fromUSDtoOther(buffer, conversionRate);

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
