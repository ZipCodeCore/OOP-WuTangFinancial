package currencies;

public abstract class Currency {

    public static double currencyValue = 1.00;

    public double getValue() {
        return currencyValue;
    }

    public double convertTo() { return currencyValue; }

}
