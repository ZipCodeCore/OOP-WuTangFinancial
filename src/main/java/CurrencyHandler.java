import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class CurrencyHandler {

     //All comments are lies

    public BigDecimal formatDecimal(double roundMe){

        BigDecimal bigDecimal = new BigDecimal(roundMe).setScale(2, RoundingMode.HALF_UP);

        return bigDecimal;
    }

    public BigDecimal convertTwo(Currency source, Currency target, double amount){

        double conversionFactor = target.getRate() / source.getRate();
        double convertedAmount = amount * conversionFactor;

        BigDecimal convertedAmountBigDecimal = formatDecimal(convertedAmount);

        return convertedAmountBigDecimal;
    }

    public String getCurrencySymbol(Currency currency){
        for(CurrencySymbol eachSymbol: CurrencySymbol.values()){
            if(eachSymbol.toString().equals(currency.toString())){
                return eachSymbol.getSymbol();
            }
        }return "impossible";
    }

    public double OLDformatDecimal(double formatMe){
        DecimalFormat formatter = new DecimalFormat("0.##");

        String formattedString =  formatter.format(formatMe);
        Double result = Double.parseDouble(formattedString);

        return result;
    }

}
