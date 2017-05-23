
/**
 * Created by rahmirford on 5/22/17.
 */
public class CurrencyConverter {



    // Switch statement takes a string and double returns double(usDollar)
    // another switch statment is called which takes a string(exchange currency and a double(usDollar)

    public double foreignCurrencyToUsDollar(String currency, double loot){
        double usDollarConvertedValue = 0;

        switch(currency){
            case "euro":
                usDollarConvertedValue = Euro.convertToUSDollar(loot);
            break;
            case "pound":
                usDollarConvertedValue = BritishPound.convertToUSDollar(loot);
            break;
            case "rupee":
                usDollarConvertedValue = Rupee.convertToUSDollar(loot);
            break;
            case "australianDollar":
                usDollarConvertedValue = AustralianDollar.convertToUSDollar(loot);
                break;
            case "canadianDollar":
                usDollarConvertedValue = CanadianDollar.convertToUSDollar(loot);
                break;
            case "singaporeDollar":
                usDollarConvertedValue = SingaporeDollar.convertToUSDollar(loot);
                break;
            case "franc":
                usDollarConvertedValue = SwissFranc.convertToUSDollar(loot);
                break;
            case "ringgit":
                usDollarConvertedValue = MalaysianRinggit.convertToUSDollar(loot);
                break;
            case "yen":
                usDollarConvertedValue = JapaneseYen.convertToUSDollar(loot);
                break;
            case "renminbi":
                usDollarConvertedValue = ChineseYuanRenminbi.convertToUSDollar(loot);
                break;
            default:
                System.out.println("Invalid entry");
                break;
            }
        return usDollarConvertedValue;
    }


    public  double usDollarToForeignCurrency(String exchangeCurrency,)




    public String converter(String currentCurrency, double loot, String exchangeCurrency){

    }








}
