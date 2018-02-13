import java.math.BigDecimal;
import java.util.TreeMap;


public class Rate {

    private String country;
    private BigDecimal rate;

    TreeMap<String, Double> currenyCollection = new TreeMap<String, Double>() {
        {

            put("USD", 1.00);
            put("EUR", 0.94);
            put("GBP", 0.82);
            put("INR", 68.32);
            put("AUD", 1.35);
            put("CAD", 1.32);
            put("SGD", 1.43);
            put("CHF", 1.01);
            put("MYR", 4.47);
            put("JPY", 115.84);
            put("CNY", 6.92);
        }


    };

    public Rate(){

    }

    private double getFirstCountry (String country1) {
        return currenyCollection.get(country1);
    }

    private double getSecondCountry (String country2) {
        return currenyCollection.get(country2);
    }

    private double getRate (String country1, String country2) {
        return getSecondCountry(country2) / getFirstCountry(country1);
    }

    public BigDecimal conversion ( String country1, String country2, double amount) {
        double convertedAmount = getRate(country1,country2) * amount;
        BigDecimal currencyAmount = new BigDecimal(convertedAmount);
        return currencyAmount.setScale(2, BigDecimal.ROUND_CEILING);

    }



    public static void main(String[] args) {

        System.out.println();

    }
}


//    public final static double usDollar = 1.00;
//    public final static double euro = 0.94;
//    public final static double britishPound = 0.82;
//    public final static double indianRupee = 68.32;
//    public final static double austrialianDollar = 1.35;
//    public final static double canadianDollar = 1.32;
//    public final static double singaporeDollar = 1.43;
//    public final static double swissFranc = 1.01;
//    public final static double malaysianRiggit = 4.47;
//    public final static double japaneseYen = 115.84;
//    public final static double chineseYuan = 6.92;