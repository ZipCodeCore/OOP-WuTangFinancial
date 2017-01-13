package marwa.milton.wutang;
import java.util.Arrays;

/**
 * Created by mkulima on 1/11/17.
 */
public class Converter {


    // main convert method that calls convertName and convertValue
    public static Currency convert(Currency c2v, String nuName){

        convertValue(c2v, nuName);  // change value before name otherwise convertValue method will not work
        convertName(c2v, nuName);   // now convert name
        return  c2v;
    }

    // change name
    public static void convertName(Currency c2v, String nuName){
        c2v.currencyType = nuName;
        return;
    }

    // change value
    public static void convertValue(Currency c2v, String nuName){
        String[] cnames    = {"USD", "EUR",       "GBP",         "INR",     "AUD",     "CAD",      "SGD",      "CHF",       "MYR",     "JPY",   "CNY"};
        //String[] countries = {"US", "Europe", "United Kingdom", "India", "Australia", "Canada", "Singapore","Switzerland","Malaysia", "Japan", "China"};
        double[] valz      = {1.00,  0.94,        0.82,        68.32,    1.35,        1.32,      1.43,        1.01,        1.01,      115.84,  6.92};

        double origValue = c2v.currencyValue;
        c2v.currencyValue = origValue * valz[Arrays.asList(cnames).indexOf(nuName)] / valz[Arrays.asList(cnames).indexOf(c2v.currencyType)] ;
        //System.out.println(Arrays.asList(cnames).indexOf(c2v.currencyType));
        //System.out.println(Arrays.asList(cnames).indexOf(nuName));
        //c2v.currencyValue = newValue;
        return;
    }

    public  static  void main(String[] args){
        Currency USD = new Currency("USD", 10.0);  // make new currency
        System.out.println("b4 conversion");
        System.out.println(USD.currencyType);
        System.out.println(USD.currencyValue);

        Currency indian_rupees = convert(USD, "INR");

        System.out.println();
        System.out.println("after conversion");
        System.out.println(indian_rupees.currencyType);
        System.out.println(String.format(" %5.2f ", (float)indian_rupees.currencyValue));
    }

}
