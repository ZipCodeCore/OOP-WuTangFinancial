

class CurrencyFormatter {


    String formatCurrencySymbol(double amountToFormat, Currency currencyFormatType){
        String output;
        switch (currencyFormatType){
            case UsDollar:
            case AustralianDollar:
            case CanadianDollar:
            case SingaporeDollar:
                output = "$" + amountToFormat;
                break;
            case JapaneseYen:
            case ChineseYuanRenminbi:
                output = "\u00A5" + amountToFormat;
                break;
            case SwissFranc:
                output = amountToFormat + " Fr.";
                break;
            case MalaysianRinggit:
                output = "RM" + amountToFormat;
                break;
            case Euro:
                output = "\u20AC" + amountToFormat;
                break;
            case BritishPound:
                output = "\u00A3" + amountToFormat;
                break;
            case IndianRupee:
                output = "\u20B9" + amountToFormat;
                break;
            default:
                output = null;
                break;
        }
        return output;
    }

}
