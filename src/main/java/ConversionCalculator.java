/**
 * Created by mollyarant on 5/22/17.
 */
public class ConversionCalculator {
    ConversionToolToUSDollar convertToDollar = new ConversionToolToUSDollar();
    ConversionToolFromUSDollar convertFromDollar= new ConversionToolFromUSDollar();

    public double calculateCurrencyEuroToPound(double amount){
        double dollarConversion= convertToDollar.convertEuroToUSDollar(amount);
        double result= convertFromDollar.convertDollarToPound(dollarConversion);
        return result;
    }

    public double calculateCurrencyEuroToRupee(double amount){
        double dollarConversion= convertToDollar.convertEuroToUSDollar(amount);
        double result= convertFromDollar.convertDollarToIndianRupee(dollarConversion);
        return result;
    }

    public double calculateCurrencyPoundToRupee(double amount){
        double dollarConversion= convertToDollar.convertPoundToUSDollar(amount);
        double result= convertFromDollar.convertDollarToIndianRupee(dollarConversion);
        return result;
    }

    public double calculateCurrencyRupeeToCanadianDollar(double amount){
        double dollarConversion= convertToDollar.convertIndianRupeeToUSDollar(amount);
        double result= convertFromDollar.convertDollarToCanadianDollar(dollarConversion);
        return result;
    }

    public double calculateCurrencyCanadianDollarToSingaporeDollar(double amount){
        double dollarConversion= convertToDollar.convertCanadianDollarToUSDollar(amount);
        double result= convertFromDollar.convertDollarToSingaporeDollar(dollarConversion);
        return result;
    }
    public double calculateCurrencySingaporeDollarToMalaysianRinggit(double amount){
        double dollarConversion= convertToDollar.convertSingaporeDollarToUSDollar(amount);
        double result= convertFromDollar.convertDollarToMalaysianRinggit(dollarConversion);
        return result;
    }
    public double calculateCurrencySingaporeDollarToSwissFranc(double amount){
        double dollarConversion= convertToDollar.convertSingaporeDollarToUSDollar(amount);
        double result= convertFromDollar.convertDollarToSwissFranc(dollarConversion);
        return result;
    }
    public double calculateCurrencySwissFranctoMalaysianRinggit(double amount){
        double dollarConversion= convertToDollar.convertSwissFrancToUSDollar(amount);
        double result= convertFromDollar.convertDollarToMalaysianRinggit(dollarConversion);
        return result;
    }

    public double calculateCurrencyRinggitToYen(double amount){
        double dollarConversion= convertToDollar.convertMalaysianRinggitToUSDollar(amount);
        double result= convertFromDollar.convertDollarToJapaneseYen(dollarConversion);
        return result;
    }

    public double calculateCurrencyYenToYuan(double amount){
        double dollarConversion= convertToDollar.convertJapaneseYenToUSDollar(amount);
        double result= convertFromDollar.convertDollarToChineseYuan(dollarConversion);
        return result;
    }




}
