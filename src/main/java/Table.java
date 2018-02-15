import java.util.TreeMap;

public class Table {


    public static TreeMap<String, Double> fxTable = new TreeMap<String, Double>();


    public static void createMap() {

        fxTable.put("USD", 1.00);
        fxTable.put("EUR", 0.94);
        fxTable.put("GBP", 0.82);
        fxTable.put("INR", 68.32);
        fxTable.put("AUD", 1.35);
        fxTable.put("CAD", 1.32);
        fxTable.put("SGD", 1.43);
        fxTable.put("CHF", 1.01);
        fxTable.put("MYR", 4.47);
        fxTable.put("JPY", 115.84);
        fxTable.put("CNY", 6.92);

    }


}
