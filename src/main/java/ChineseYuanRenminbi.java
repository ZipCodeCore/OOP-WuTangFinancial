/**
 * Created by rahmirford on 5/22/17.
 */
public class ChineseYuanRenminbi {
    private static double rate = 6.92;
    private static double usDollarConvertedValue;
    private static double chineseYuanRenminbiValue;

    public static double convertToUSDollar(double amount){
        usDollarConvertedValue = Math.round( amount / ChineseYuanRenminbi.getRate()*100.0);
        usDollarConvertedValue = usDollarConvertedValue/100;
        return usDollarConvertedValue;
    }

    public double getUsDollarConvertedValue() {
        return usDollarConvertedValue;
    }

    public static double getRate() {
        return rate;
    }

    public static double convertToChineseYuanRenminbi(double usDollarValue){
        chineseYuanRenminbiValue = Math.round((usDollarValue * ChineseYuanRenminbi.getRate()*100));
        chineseYuanRenminbiValue = chineseYuanRenminbiValue/100;
        return chineseYuanRenminbiValue;
    }

}
