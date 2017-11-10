package currencies;

public class UsDollar extends Currency{
    public double dollarValue = 1;

    public double inUSD(Double dollar) {
        return dollar * dollarValue;
    }

    public double convertToEuro(double dollarValue){
        return 0.94 * dollarValue;
    }
}
