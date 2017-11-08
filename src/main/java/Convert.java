import java.text.DecimalFormat;
import java.util.ArrayList;

public class Convert {
    private final static ArrayList<Currency> currencyRatesList = new ArrayList<Currency>();

    private static DecimalFormat tdp = new DecimalFormat("0.00");

    Convert(){
        String[] currencyNames = {"US Dollar","Euro","British Pound","Indian Rupee",
                "Australian Dollar","Canadian Dollar","Singapore Dollar","Swiss Franc",
                "Malaysian Ringgit","Japanese Yen","Chinese Yuan Renminbi"};
        String[] currencyTypes = {"USD","EUR","GPB","INR",
                "AUD","CAD","SGD","CHF",
                "MYR","JPY","CNY"};
        double[] currencyRates = {1.00,0.94,0.82,68.32,1.35,1.32,1.43,1.01,4.47,115.84,6.92};
        for(int i =0;i<currencyTypes.length;i++){
            String currencyType = currencyTypes[i];
            double currencyRate = currencyRates[i];
            String currencyName = currencyNames[i];
            Currency currentCurrency = new Currency(currencyType,currencyRate,currencyName);
            currencyRatesList.add(currentCurrency);
        }
    }

    public ArrayList<Currency> getCurrencyRateList(){
        return currencyRatesList;
    }

    public Currency getCurrencyByType(String type){
        for(Currency currentCurrency: currencyRatesList){
            String currentCurrencyType = currentCurrency.getCurrencyType();
            if(type.equalsIgnoreCase(currentCurrencyType)){
                return currentCurrency;
            }

        }
        return null;
    }

    public double convertCurrency(Currency currency1,Currency currency2,double amount){
        double currencyRate1 = currency1.getRate();
        double currencyRate2 = currency2.getRate();
        amount*=(currencyRate2/currencyRate1);
        String stringAmount = tdp.format(amount);
        return Double.parseDouble(stringAmount);
    }
}
