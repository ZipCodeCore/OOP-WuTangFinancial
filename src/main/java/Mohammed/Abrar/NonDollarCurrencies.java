package Mohammed.Abrar;

public class NonDollarCurrencies implements Currency {

    private double dollarCurrency;

    public NonDollarCurrencies() {
        this.dollarCurrency = dollarCurrency;
    }

    public double getDollarCurrency() {
        return dollarCurrency;
    }

    @Override
    public double dollarConvertor(double dollarCurrency) {
        return dollarCurrency;
    }

    @Override
    public double euroConvertor(double dollarCurrency) {
        return dollarCurrency * 0.94;
    }

    @Override
    public double britishPoundConvertor(double dollarCurrency) {
        return dollarCurrency * 0.82;
    }

    @Override
    public double indianRupeeConvertor(double dollarCurrency) {
        return dollarCurrency * 68.32;
    }

    @Override
    public double australianDollarConvertor(double dollarCurrency) {
        return dollarCurrency * 1.35;
    }

    @Override
    public double canadianDollarConvertor(double dollarCurrency) {
        return dollarCurrency * 1.32;
    }

    @Override
    public double singaporeDollarConvertor(double dollarCurrency) {
        return dollarCurrency * 1.43;
    }

    @Override
    public double swissFrancConvertor(double dollarCurrency) {
        return dollarCurrency * 1.01;
    }

    @Override
    public double malaysianRinggitConvertor(double dollarCurrency) {
        return dollarCurrency * 4.47 ;
    }

    @Override
    public double japaneseYenConvertor(double dollarCurrency) {
        return dollarCurrency * 115.84;
    }

    @Override
    public double chineseYuanRenminbi(double dollarCurrency) {
        return dollarCurrency * 6.92;
    }
}
