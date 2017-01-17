package ibikunle.tolani;
import java.text.DecimalFormat;
/**
 * Created by tolaniibikunle on 1/13/17.
 */
public class ConvertCurrency extends DifferentCurrencies {
    double exchangeRate;
    DecimalFormat df = new DecimalFormat("##.##");


    public double convert( double convertFrom, double convertTo){
        exchangeRate = (convertTo/convertFrom);
        String decimal = df.format(exchangeRate);// must turn the string back into a double

        return Double.parseDouble(decimal);//how to convert a string into a decimal
    }



}
