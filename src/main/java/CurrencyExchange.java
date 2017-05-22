import java.math.BigDecimal;

/**
 * Created by vilenalivinsky on 5/22/17.
 */
public class CurrencyExchange {

    public void currencyExchange(){}

    public static BigDecimal dollarToEuro(double dollar){

        BigDecimal dollarBig = new BigDecimal(dollar);
        BigDecimal usDollarRate = new BigDecimal(1.00);
        BigDecimal euRate = new BigDecimal(0.94);

        BigDecimal step1= dollarBig.multiply(usDollarRate);
        BigDecimal result = step1.divide(euRate,2,BigDecimal.ROUND_HALF_UP);

        return result;
    }

    public static BigDecimal euroToDollar(double euro){

        BigDecimal euroBig = new BigDecimal(euro);
        BigDecimal euroRate = new BigDecimal(0.94);
        BigDecimal usDollarRate = new BigDecimal(1.00);

        BigDecimal step1 = euroBig.multiply(euroRate);
        BigDecimal result = step1.divide(usDollarRate,2,BigDecimal.ROUND_HALF_UP);

        return result;
    }

    public static BigDecimal euroToBritishPound(double euro){

        BigDecimal euroBig = new BigDecimal(euro);
        BigDecimal euroRate = new BigDecimal(0.94);
        BigDecimal britishPoundRate = new BigDecimal(0.82);

        BigDecimal step1 = euroBig.multiply(euroRate);
        BigDecimal result = step1.divide(britishPoundRate,2,BigDecimal.ROUND_HALF_UP);

        return result;
    }

    public static BigDecimal britishPoundToIndianRupee(double pound){

        BigDecimal poundBig = new BigDecimal(pound);
        BigDecimal britishPoundRate = new BigDecimal(0.82);
        BigDecimal indianRupeeRate = new BigDecimal(68.32);

        BigDecimal step1 = poundBig.multiply(britishPoundRate);
        BigDecimal result = step1.divide(indianRupeeRate,2,BigDecimal.ROUND_HALF_UP);

        return result;
    }

}
