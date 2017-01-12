package WuTangFinancial;

import java.text.NumberFormat;

/**
 * Created by randallcrame on 1/11/17.
 */
public class CurrencyConverter {

    public static final Double usDollar = 1.00;
    public static final Double euro = 0.94;
    public static final Double britishPound = 0.82;
    public static final Double indianRupee = 68.32;
    public static final Double australianDollar = 1.35;
    public static final Double canadianDollar = 1.32;
    public static final Double singaporeDollar = 1.43;
    public static final Double swissFranc = 1.01;
    public static final Double malaysianRinggit = 4.47;
    public static final Double japaneseYen = 115.84;
    public static final Double chineseYuanRenminbi = 6.92;

   public Double convertCurrency (Double from, Double to){
       Double convertedCurrency = usDollar/from * to;
       return convertedCurrency;
   }
}
