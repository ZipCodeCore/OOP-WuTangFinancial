import java.util.TreeMap;

public class WuTangFinancial {

    static TreeMap<String, Double> currencyRateStorage = new TreeMap<String, Double>(){
        {
            put("USD", 1.00);
            put("Euro", 0.94);
            put("Pound", 0.82);
            put("Rupee", 68.32);
            put("AUS", 1.35);
            put("CAD", 1.32);
            put("SingaporeDollar", 1.43);
            put("SwissFranc", 1.01);
            put("MalaysianRinggit", 4.47);
            put("Yen", 115.84);
            put("ChineseYuanRenminbi", 6.92);
        }
    };

    private String countryNameConvertTo;
    private String countryNameConvertFrom;

    public static void main(String[] args) {

    }
    public WuTangFinancial(){

    }

    public static Double dollarDivideByForeignRate(Double initial, String countryNameConvertFrom){
       return initial / currencyRateStorage.get(countryNameConvertFrom);
    }

    public static Double multiplyByCurrencyWanted( Double initial,  String countryNameConvertFrom, String countryNameConvertTo){
        return dollarDivideByForeignRate(initial, countryNameConvertFrom) * currencyRateStorage.get(countryNameConvertTo);
    }



}
