import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Created by eugenevendensky on 2/16/17.
 */
public class con {

    DecimalFormat decimalFormat = new DecimalFormat("#.##");


      Double converter(double from, double to, double howMuch){

          decimalFormat.setRoundingMode(RoundingMode.CEILING);

        return    Double.parseDouble(  decimalFormat.format ((CurrencyRateCollection.usDollar/from * to    * howMuch ) ) );


    }



}
