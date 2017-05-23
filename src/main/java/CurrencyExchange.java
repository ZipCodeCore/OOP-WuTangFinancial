import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by vilenalivinsky on 5/22/17.
 */
public class CurrencyExchange {

    public void currencyExchange(){}

    public static BigDecimal dollarToEuro(double dollar){

        BigDecimal oneConstant = new BigDecimal(1);

        BigDecimal dollarBig = new BigDecimal(dollar);
        BigDecimal usDollarRate = new BigDecimal(1.00);
        BigDecimal euRate = new BigDecimal(0.94);

        BigDecimal step1= dollarBig.multiply(usDollarRate);
        BigDecimal result = step1.divide(euRate,2,BigDecimal.ROUND_HALF_UP);
        BigDecimal result2 = oneConstant.divide(result,2,BigDecimal.ROUND_HALF_UP);
        //BigDecimal result = step1.multiply(euRate).setScale(2, RoundingMode.HALF_DOWN);

        return result2;
    }

    public static BigDecimal euroToDollar(double euro){

        BigDecimal oneConstant = new BigDecimal(1);

        BigDecimal euroBig = new BigDecimal(euro);
        BigDecimal euroRate = new BigDecimal(0.94);
        BigDecimal usDollarRate = new BigDecimal(1.00);

        BigDecimal step1 = euroBig.multiply(euroRate);
        BigDecimal result = step1.divide(usDollarRate,2,BigDecimal.ROUND_HALF_UP);
        BigDecimal result2 = oneConstant.divide(result,2,BigDecimal.ROUND_HALF_UP);
        //BigDecimal result = step1.multiply(usDollarRate).setScale(2,RoundingMode.HALF_DOWN);

        return result2;
    }

    public static BigDecimal euroToBritishPound(double euro){

        BigDecimal oneConstant = new BigDecimal(1);

        BigDecimal euroBig = new BigDecimal(euro);
        BigDecimal euroRate = new BigDecimal(0.94);
        BigDecimal britishPoundRate = new BigDecimal(0.82);

        BigDecimal step1 = euroBig.multiply(euroRate);
        BigDecimal result = step1.divide(britishPoundRate,2,BigDecimal.ROUND_HALF_UP);
        BigDecimal result2 = oneConstant.divide(result,2,BigDecimal.ROUND_HALF_UP);

        return result2;
    }

    public static BigDecimal britishPoundToIndianRupee(double pound){

        BigDecimal oneConstant = new BigDecimal(1);

        BigDecimal poundBig = new BigDecimal(pound);
        BigDecimal britishPoundRate = new BigDecimal(0.82);
        BigDecimal indianRupeeRate = new BigDecimal(68.32);

        BigDecimal step1 = poundBig.multiply(britishPoundRate);
        BigDecimal result = step1.divide(indianRupeeRate,3, BigDecimal.ROUND_HALF_EVEN);
        BigDecimal result2 = oneConstant.divide(result,3, BigDecimal.ROUND_HALF_EVEN);

        return result2;
    }

    public static BigDecimal rupeeToCanDollar(double rupee){

        BigDecimal oneConstant = new BigDecimal(1);

        BigDecimal rupeeBig = new BigDecimal(rupee);
        BigDecimal rupeeRate = new BigDecimal(68.32);
        BigDecimal canDollarRate = new BigDecimal(1.32);

        BigDecimal step1 = rupeeBig.multiply(rupeeRate);
        BigDecimal result = step1.divide(canDollarRate,2, BigDecimal.ROUND_HALF_UP);
        BigDecimal result2 = oneConstant.divide(result,2, BigDecimal.ROUND_HALF_UP);

        return result2;
    }

    public static BigDecimal canDollarToSingaporeDollar(double can){

        BigDecimal oneConstant = new BigDecimal(1);

        BigDecimal canBig = new BigDecimal(can);
        BigDecimal canRate = new BigDecimal(1.32);
        BigDecimal singaporeDollarRate = new BigDecimal(1.43);

        BigDecimal step1 = canBig.multiply(canRate);
        BigDecimal result = step1.divide(singaporeDollarRate,2, BigDecimal.ROUND_DOWN);
        BigDecimal result2 = oneConstant.divide(result,2, BigDecimal.ROUND_DOWN);

        return result2;
    }

    public static BigDecimal singaporeDollarToSwiss(double singapore){

        BigDecimal oneConstant = new BigDecimal(1);

        BigDecimal singaporeBig = new BigDecimal(singapore);
        BigDecimal singaporeRate = new BigDecimal(1.43);
        BigDecimal swissDollarRate = new BigDecimal(1.01);

        BigDecimal step1 = singaporeBig.multiply(singaporeRate);
        BigDecimal result = step1.divide(swissDollarRate,2, BigDecimal.ROUND_CEILING);
        BigDecimal result2 = oneConstant.divide(result,2, BigDecimal.ROUND_CEILING);

        return result2;
    }

    public static BigDecimal swissToMalaysianR(double swiss){

        BigDecimal oneConstant = new BigDecimal(1);

        BigDecimal swissBig = new BigDecimal(swiss);
        BigDecimal swissRate = new BigDecimal(1.01);
        BigDecimal MalaysianDollarRate = new BigDecimal(4.47);

        BigDecimal step1 = swissBig.multiply(swissRate);
        BigDecimal result = step1.divide(MalaysianDollarRate,2, BigDecimal.ROUND_HALF_UP);
        BigDecimal result2 = oneConstant.divide(result,2, BigDecimal.ROUND_HALF_UP);

        return result2;
    }

    public static BigDecimal malayToYen(double malay){

        BigDecimal oneConstant = new BigDecimal(1);

        BigDecimal malayBig = new BigDecimal(malay);
        BigDecimal malayRate = new BigDecimal(4.47);
        BigDecimal YenDollarRate = new BigDecimal(115.84);

        BigDecimal step1 = malayBig.multiply(malayRate);
        BigDecimal result = step1.divide(YenDollarRate,2, BigDecimal.ROUND_HALF_EVEN);
        BigDecimal result2 = oneConstant.divide(result,2, BigDecimal.ROUND_HALF_EVEN);

        return result2;
    }

    public static BigDecimal yenToYuan(double yen){

        BigDecimal oneConstant = new BigDecimal(1);

        BigDecimal yenBig = new BigDecimal(yen);
        BigDecimal yenRate = new BigDecimal(115.84);
        BigDecimal YuanDollarRate = new BigDecimal(6.92);

        BigDecimal step1 = yenBig.multiply(yenRate);
        BigDecimal result = step1.divide(YuanDollarRate,2, BigDecimal.ROUND_HALF_EVEN);
        BigDecimal result2 = oneConstant.divide(result,2, BigDecimal.ROUND_HALF_EVEN);

        return result2;
    }
}
