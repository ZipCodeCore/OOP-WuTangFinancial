import java.text.NumberFormat;
import java.util.TreeMap;

public class WuTangFinancial {


    public TreeMap<String, Double> convertList;

    public WuTangFinancial () {
        convertList = new TreeMap<String, Double>();
        //initialization of object TreeMap
        convertList.put("USD", 1.00);
        convertList.put("Euro", 0.94);
        convertList.put("Pound", 0.82);
        convertList.put("Rupee", 68.32);
        convertList.put("Australian Dollar", 1.35);
        convertList.put("Canadian Dollar", 1.32);
        convertList.put("Singapore Dollar", 1.43);
        convertList.put("Swiss Franc", 1.01);
        convertList.put("Malaysian Ringgit", 4.47);
        convertList.put("Japanese Yen", 115.84);
        convertList.put("Chinese Yuan Renminbi", 6.92);
    }

        public String currencyConverter(String beginning, String ending, Double amountToConvert) {
            DecimalFormat df = new DecimalFormat("#.##");
            String result = df.format(Double.toString(this.convertList.get(ending)/ this.convertList.get(beginning) * amountToConvert));

            return result;
        }

    }
