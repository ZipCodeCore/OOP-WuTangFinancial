/**
 * Created by rahmirford on 5/22/17.
 */
public class JapaneseYen {
    private static double rate = 115.84;
    private double usDollarConvertedValue;
    private double japaneseYenValue;

    public double convertToUSDollar(){
        return 0;
    }

    public double getUsDollarConvertedValue() {
        return usDollarConvertedValue;
    }


    public static double getRate() {
        return rate;
    }

    public double convertToJapaneseYen(double usDollarValue){
        japaneseYenValue= usDollarValue * JapaneseYen.getRate();
        return japaneseYenValue;
    }
}
