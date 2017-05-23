/**
 * Created by rahmirford on 5/22/17.
 */
public class ChineseYuanRenminbi {
    private static double rate = 6.92;
    private double usDollarConvertedValue;
    private static double chineseYuanRenminbiValue;

    public static double convertToUSDollar(double amount){
        return 0;
    }

    public double getUsDollarConvertedValue() {
        return usDollarConvertedValue;
    }

    public static double getRate() {
        return rate;
    }

    public static double convertToChineseYuanRenminbi(double usDollarValue){
        chineseYuanRenminbiValue = usDollarValue * ChineseYuanRenminbi.getRate();
        return chineseYuanRenminbiValue;
    }

}
