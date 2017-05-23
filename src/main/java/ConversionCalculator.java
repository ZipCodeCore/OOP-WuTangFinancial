/**
 * Created by mollyarant on 5/22/17.
 */
public class ConversionCalculator {
    ConversionToolToUSDollar convertToDollar = new ConversionToolToUSDollar();
    ConversionToolFromUSDollar convertFromDollar= new ConversionToolFromUSDollar();




    public double convertAmountToDollar(int country, double amount){
        double result=amount;
            switch (country){
                case 1: {
                    result= amount;
                    break;
                }
                case 2: {
                    result= convertToDollar.convertEuroToUSDollar(amount);
                    break;
                }
                case 3: {
                    result= convertToDollar.convertPoundToUSDollar(amount);
                    break;
                }
                case 4: {
                    result= convertToDollar.convertIndianRupeeToUSDollar(amount);
                    break;
                }
                case 5: {
                    result=convertToDollar.convertAustralianDollarToUSDollar(amount);
                    break;
                }
                case 6: {
                    result= convertToDollar.convertCanadianDollarToUSDollar(amount);
                    break;
                }
                case 7: {
                    result= convertToDollar.convertSingaporeDollarToUSDollar(amount);
                    break;
                }
                case 8: {
                    result=convertToDollar.convertSwissFrancToUSDollar(amount);
                    break;
                }
                case 9: {
                    result=convertToDollar.convertMalaysianRinggitToUSDollar(amount);
                    break;
                }
                case 10: {
                    result= convertToDollar.convertJapaneseYenToUSDollar(amount);
                    break;
                }
                case 11:{
                    result=convertToDollar.convertChineseYuanToUSDollar(amount);
                    break;
                }

        }
        return result;
    }

    public double convertAmountToNewCurrency(int country, double amount){
        double result= amount;
            switch (country){
                case 1:{
                    result=amount;
                    break;
                }
                case 2:{
                    result= convertFromDollar.convertDollarToEuro(amount);
                    break;
                }
                case 3:{
                    result=convertFromDollar.convertDollarToPound(amount);
                    break;
                }
                case 4:{
                    result= convertFromDollar.convertDollarToIndianRupee(amount);
                    break;
                }
                case 5:{
                    result= convertFromDollar.convertDollarToAustralianDollar(amount);
                    break;
                }
                case 6:{
                    result=convertFromDollar.convertDollarToCanadianDollar(amount);
                    break;
                }
                case 7:{
                    result=convertFromDollar.convertDollarToSingaporeDollar(amount);
                    break;
                }
                case 8:{
                    result=convertFromDollar.convertDollarToSwissFranc(amount);
                    break;
                }
                case 9:{
                    result=convertFromDollar.convertDollarToMalaysianRinggit(amount);
                    break;
                }
                case 10:{
                    result=convertFromDollar.convertDollarToJapaneseYen(amount);
                    break;
                }
                case 11:{
                    result= convertFromDollar.convertDollarToChineseYuan(amount);
                    break;
                }
            }
            return result;
    }

    public double convertOldCurrencyToNewCurrency(int country1, int country2, double amount){
        double result= convertAmountToNewCurrency(country2, convertAmountToDollar(country1, amount));
        return result;
    }






}
