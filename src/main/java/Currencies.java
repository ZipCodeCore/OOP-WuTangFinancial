public class Currencies {
    protected static double usDollar = 1.00;
    protected static double euro = 0.94;
    protected static double britishPound = 0.82;
    protected static double indianRupee = 68.32;
    protected static double australianDollar = 1.35;
    protected static double canadianDollar = 1.32;
    protected static double singaporeDollar = 1.43;
    protected static double swissFranc = 1.01;
    protected static double malaysianRingitt = 4.47;
    protected static double japaneseYen = 115.84;
    protected static double chineseYuanRenminbi = 6.92;

    public static double ConvertValueToUSDollar(double valueToBeConverted) {
        return valueToBeConverted * usDollar;
    }

    public static double ConvertValueToEuro(double valueToBeConverted) {
        return valueToBeConverted * euro;
    }

    public static double ConvertValueToBritishPound(double valueToBeConverted) {
        return valueToBeConverted * britishPound;
    }

    public static double ConvertValueToIndianRupee(double valueToBeConverted) {
        return valueToBeConverted * indianRupee;
    }

    public static double CovertValueToAustrailianDollar(double valueToBeConverted) {
        return valueToBeConverted * australianDollar;
    }

    public static double CovertValueToCanadianDollar(double valueToBeConverted) {
        return valueToBeConverted * canadianDollar;
    }

    public static double ConvertValueToSingaporeDollar(double valueToBeConverted) {
        return valueToBeConverted * singaporeDollar;
    }

    public static double ConvertValueToSwissFranc(double valueToBeConverted) {
        return valueToBeConverted * swissFranc;
    }

    public static double ConvertValueToMalaysianRingitt(double valueToBeConverted) {
        return valueToBeConverted * malaysianRingitt;
    }

    public static double ConvertValueToJapaneseYen(double valueToBeConverted) {
        return valueToBeConverted * japaneseYen;
    }

    public static double ConvertValueToChineseYuanRenminbi(double valueToBeConverted) {
        return valueToBeConverted * chineseYuanRenminbi;
    }
}
