import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Created by andrewwong on 5/22/17.
 */
public class Converter {
    MathContext mc = MathContext.DECIMAL128;
    //TODO find out which mathcontext is best for currency
    public BigDecimal convert(BigDecimal amountIn, BigDecimal rateIn, BigDecimal rateOut){
        BigDecimal rate;
        rate = rateOut.divide(rateIn, mc);
        return rate.multiply(amountIn, mc);
    }
}
