package ries.dan.WuTangFinancial;
import java.text.DecimalFormat;
/**
 * Created by danries on 1/11/17.
 */
public class Converter extends Currency {

    DecimalFormat format = new DecimalFormat("##.##");

    public Double conversion(double to, double from){
        double finalConverstion = (to/from);
        return trimLength(finalConverstion);

    }

    public Double trimLength(double conversion){
        String total = format.format(conversion);
        return Double.parseDouble(total);
    }


}
