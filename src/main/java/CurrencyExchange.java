import java.math.BigDecimal;
import java.util.HashMap;
import java.util.TreeMap;

import static javax.swing.UIManager.put;
//Currency converter
public class CurrencyExchange {

    private HashMap<String, Double> currencyMap;

    {
        currencyMap = new HashMap<String, Double>() {
            {
                put("USD", 1.00);     //US Dollar
                put("EURO", 0.94);    //Euro
                put("POUND", 0.82);   //British Pound
                put("RUPEE", 68.32);  //Indian Rupee
                put("AUD", 1.35);     //Australian Dollar
                put("CAD", 1.32);     //Canadian Dollar
                put("SGD", 1.43);     //Singapore Dollar
                put("FRANC", 1.01);   //Swiss Franc
                put("RINGGIT", 4.47); //Malaysian Ringgit
                put("YEN", 115.84);   //Japanese Yen
                put("RENMINBI", 6.92);//Chinese Yuan Renminbi

            }
        };
    }

    public double conversionFormula (String nation1, String nation2, double amount){

        double convertedAmount = (currencyMap.get(nation2)) / (currencyMap.get(nation1)) * amount;

        return convertedAmount;

    }

}
