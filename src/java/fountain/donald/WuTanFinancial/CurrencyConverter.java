package fountain.donald.WuTanFinancial;

public class CurrencyConverter {

    static public Double getCurrencyRates(int whichType){
        switch (whichType){
            case 1:
                return Currency.USDollar.getCurrencyRate();
            case 2:
                return Currency.Euro.getCurrencyRate();
            case 3:
                return Currency.BritishPound.getCurrencyRate();
            case 4:
                return Currency.IndianRupee.getCurrencyRate();
            case 5:
                return Currency.AustralianDollar.getCurrencyRate();
            case 6:
                return Currency.CanadianDollar.getCurrencyRate();
            case 7:
                return Currency.SingaporeDollar.getCurrencyRate();
            case 8:
                return Currency.SwissFranc.getCurrencyRate();
            case 9:
                return Currency.MalaysianRinggit.getCurrencyRate();
            case 10:
                return Currency.JapaneseYen.getCurrencyRate();
            case 11:
                return Currency.ChineseYuanRenminbi.getCurrencyRate();
        }
        return null;
    }

    static public String getCurrencyRatesName(int whichType){
        switch (whichType){
            case 1:
                return Currency.USDollar.name();
            case 2:
                return Currency.Euro.name();
            case 3:
                return Currency.BritishPound.name();
            case 4:
                return Currency.IndianRupee.name();
            case 5:
                return Currency.AustralianDollar.name();
            case 6:
                return Currency.CanadianDollar.name();
            case 7:
                return Currency.SingaporeDollar.name();
            case 8:
                return Currency.SwissFranc.name();
            case 9:
                return Currency.MalaysianRinggit.name();
            case 10:
                return Currency.JapaneseYen.name();
            case 11:
                return Currency.ChineseYuanRenminbi.name();
        }
        return null;
    }

    static public double convertMoney(double convertFromRate, double convertToRate, double amountToConvert){
        return (convertToRate/convertFromRate) * amountToConvert;
    }

}
