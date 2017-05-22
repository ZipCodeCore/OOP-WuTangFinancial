import java.math.BigDecimal;

/**
 * Created by andrewwong on 5/22/17.
 */
public class Converter {
    public BigDecimal convert(BigDecimal amountIn, BigDecimal rateIn, BigDecimal rateOut){
        BigDecimal rate;
        rate = rateIn.divide(rateOut);
        return rate.multiply(amountIn);
    }
}
