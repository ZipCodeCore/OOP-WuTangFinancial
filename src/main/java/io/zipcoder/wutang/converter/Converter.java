package io.zipcoder.wutang.converter;

import io.zipcoder.wutang.currencies.Currency;

public class Converter {

    public Double convert(Double currencyAmount1, Currency currencyType1, Currency currencyType2) {
        Double currencyAmount2 = 0d;
        Double conversionRate1 = currencyType1.getConversionRate();
        Double conversionRate2 = currencyType2.getConversionRate();

        currencyAmount2 = currencyAmount1 * (conversionRate2/conversionRate1);

        return currencyAmount2;
    }
}
