import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class CurrencyHandler {

     //All comments are lies

    public BigDecimal formatDecimal(double roundMe){

        BigDecimal bigDecimal = new BigDecimal(roundMe).setScale(2, RoundingMode.HALF_UP);

        return bigDecimal;
    }

    public double OLDformatDecimal(double formatMe){
        DecimalFormat formatter = new DecimalFormat("0.##");

        String formattedString =  formatter.format(formatMe);
        Double result = Double.parseDouble(formattedString);

        return result;
    }

}
