package Mohammed.Abrar;


import com.sun.org.glassfish.gmbal.ParameterNames;

public class Dollar implements Currency {
    private double dollar;



    public Dollar() {
        this.dollar = dollar;

    }

    public double getDollar() {
        return dollar;
    }

    @Override
    public double dollarConvertor(double input) {

        return input;
    }

    @Override
    public double euroConvertor(double input) {
        return input/0.94;
    }

    @Override
    public double britishPoundConvertor(double input) {
        return input/0.82;
    }

    @Override
    public double indianRupeeConvertor(double input) {
        return input/68.32;
    }

    @Override
    public double australianDollarConvertor(double input) {
        return input/1.35;
    }

    @Override
    public double canadianDollarConvertor(double input) {
        return input/1.32;
    }

    @Override
    public double singaporeDollarConvertor(double input) {
        return input/1.43;
    }

    @Override
    public double swissFrancConvertor(double input) {
        return input/1.01;
    }

    @Override
    public double malaysianRinggitConvertor(double input) {
        return input/4.47;
    }

    @Override
    public double japaneseYenConvertor(double input) {
        return input/115.84;
    }

    @Override
    public double chineseYuanRenminbi(double input) {
        return input/6.92;
    }
}
