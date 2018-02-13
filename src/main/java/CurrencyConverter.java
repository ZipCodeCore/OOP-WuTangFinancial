import java.util.Map;
import java.util.TreeMap;

/**
 * created by Frankie!!!
 */

public class CurrencyConverter {
    private double convertIn;
    private TreeMap<String, Double> convertList;
    private double convertedValue;

    public CurrencyConverter(double valueToConvert){
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
        this.convertList.put("chinese yen renminbi", 6.92);
        this.convertedValue = 0.0;
    }

    public double convertingInterface(double moneyValue, String beginningC, String endDestination){
        Double conversionRate;

        //from other to USD
        if (endDestination.toLowerCase().equals("us dollar")){
            for(Map.Entry<String, Double> entry : convertList.entrySet()){
                if (entry.equals(beginningC.toLowerCase())){
                    conversionRate = entry.getValue();
                    this.convertedValue = fromOthertoUSD(moneyValue, conversionRate);
                }
            }

        }
        //from USD to other
        else if(beginningC.toLowerCase().equals("us dollar")){
            for(Map.Entry<String, Double> entry : convertList.entrySet()){
                if (entry.equals(endDestination.toLowerCase())){
                    conversionRate = entry.getValue();
                    convertedValue = fromOthertoUSD(moneyValue, conversionRate);
                }
            }
        }


        else{
            //convert beginning to USD
            double result = 0.0;
            for(Map.Entry<String, Double> entry : convertList.entrySet()){
                if (entry.equals(beginningC.toLowerCase())){
                    conversionRate = entry.getValue();
                    result = fromOthertoUSD(moneyValue, conversionRate);

                }
            }

            //convert USD to other
            for(Map.Entry<String, Double> entry : convertList.entrySet()){
                if (entry.equals(endDestination.toLowerCase())){
                    conversionRate = entry.getValue();
                    convertedValue = fromUSDtoOther(result, conversionRate);;
                }
            }
        }
        return convertedValue;

    }

    public double fromUSDtoOther(double passInValue, Double conversionRate){
        double result = passInValue*conversionRate;
        return result;
    }

    public double fromOthertoUSD(double passInValue, Double conversionRate){
        double result = passInValue/conversionRate;
        return result;
    }
}
