/**
 * Created by brianmullin on 5/22/17.
 */
import java.util.Map;
import java.util.Map;
import java.util.TreeMap;
import java.math.BigDecimal;

public class CurrencyConverter {

    Map<String, Long> conversionMap = new TreeMap<String, Long>() {{put("USD", 1.00); put("Euro", 0.94);
                                put("POUND", 0.82); put("AUS", 1.35); put("RUP", 68.32); put("CAN", 1.32);
                                put("SING", 1.43); put("FRANC", 1.01); put("RINGGIT", 4.47); put("YEN", 115.84); put("YUAN", 6.92)}}


    public long convertTo(long firstRate, long secondRate, long amount){

        return convertedAmount;
    }

    public long getFirstExchangeRate(String country){

        long firstRate = conversionMap.get(country);

        return firstRate;
    }

    public long getSecondExchangeRate(String country){

        long secondRate = conversionMap.get(country);

        return secondRate;
    }





}
