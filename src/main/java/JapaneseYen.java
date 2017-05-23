/**
 * Created by rahmirford on 5/22/17.
 */
public class JapaneseYen {
    private static double rate = 115.84;
    private static double usDollarConvertedValue;
    private static double japaneseYenValue;

    public static double convertToUSDollar(double amount){
        usDollarConvertedValue = ( amount / JapaneseYen.getRate()*100.0);
        return usDollarConvertedValue;
    }

    public double getUsDollarConvertedValue() {
        return usDollarConvertedValue;
    }


    public static double getRate() {
        return rate;
    }

    public static double convertToJapaneseYen(double usDollarValue){
        japaneseYenValue= Math.round((usDollarValue * JapaneseYen.getRate()*100));
        japaneseYenValue = japaneseYenValue/100;
        return japaneseYenValue;
    }
}
