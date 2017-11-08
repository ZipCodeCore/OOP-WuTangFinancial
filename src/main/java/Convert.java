import java.text.DecimalFormat;

public class Convert {
    private final static Currency[] currencyRatesList = Currency.values();

    public Currency getCurrencyByType(String type){
        for(Currency currentCurrency: currencyRatesList){
            String currentCurrencyType = currentCurrency.name();
            if(type.equalsIgnoreCase(currentCurrencyType)){
                return currentCurrency;
            }

        }
        return null;
    }

    public String formatDouble(double amount){
        DecimalFormat tdp = new DecimalFormat("0.00");
        return tdp.format(amount);
    }

    public double convertCurrency(Currency currency1, Currency currency2, double amount){
        double currencyRate1 = currency1.getRate(), currencyRate2 = currency2.getRate();
        amount*=(currencyRate2/currencyRate1);
        String stringAmount = formatDouble(amount);
        return Double.parseDouble(stringAmount);
    }
}
