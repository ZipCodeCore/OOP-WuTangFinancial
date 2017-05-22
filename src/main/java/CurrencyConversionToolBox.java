/**
 * Created by byung-chunyoo on 5/22/17.
 */
public class CurrencyConversionToolBox {

    public static double convertDollarToEuro(double inputAmount){
        double conversion = 0.94 * inputAmount;
        return conversion;
    }

    public static double convertEuroToDollar(double inputAmount){
        double conversion = inputAmount / 0.94;
        return conversion;
    }

    public static double convertEuroToBritishPound(double inputAmount){
        double conversion = (inputAmount / 0.94)*0.82;//euro to dollar to pound
        return conversion;
    }

    public static double convertBritishPoundToIndianRupee(double inputAmount){
        double conversion = (inputAmount / 0.82) * 68.32; //pound to dollar to rupee
        return conversion;
    }

    public static double convertIndianRupeeToCanadianDollar(double inputAmount){
        double conversion = (inputAmount / 68.32) * 1.32; //rupee to dollar to canadian dollar
        return conversion;
    }

    public static double convertCanadianDollarToSingaporeDollar(double inputAmount){
        double conversion = (inputAmount / 1.32) * 1.43; //canadian dollar to dollar to singapore dollar
        return conversion;
    }

    public static double convertSingaporeDollarToSwissFranc(double inputAmount){
        double conversion = (inputAmount / 1.43) * 1.01; //singapore dollar to dollar to swiss franc
        return conversion;
    }

    public static double convertSwissFrancToMalaysianRinggit(double inputAmount){
        double conversion = (inputAmount / 1.01) * 4.47; //swiss franc to dollar to malaysian ringgit
        return conversion;
    }

    public static double convertMalaysianRinggitToJapaneseYen(double inputAmount){
        double conversion = (inputAmount / 4.47) * 115.84; //malaysian ringgit to dollar to japanese yen
        return conversion;
    }

    public static double convertJapaneseYenToChineseYuan(double inputAmount){
        double conversion = (inputAmount / 115.84) * 6.92; //japanese yen to dollar to chinese yuan
        return conversion;
    }
}
