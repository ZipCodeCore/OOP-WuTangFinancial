public abstract class Currency {
    private double exchangeRate;
    private String currencySymbol;


    public Currency(double exchangeRate, String currencySymbol){
        this.exchangeRate = exchangeRate;
        this.currencySymbol = currencySymbol;
    }

    @Deprecated
    public Currency(double exchangeRate){
        this(exchangeRate, null);
    }

    protected  void changeRate(double newRate){
        this.exchangeRate = newRate;
    }

    protected double getRate(){
        return this.exchangeRate;
    }

    protected  double convertToNewCurrency(double denomination, Currency newCurrency) {
        return newCurrency.convertFromDollars(this.convertToDollars(denomination));
    }

    protected double convertFromDollars(double denominationInDollars) {
        double workingDollars = multiplyBy100(denominationInDollars);
        return divideBy100(Math.round(workingDollars * this.getRate()));
    }

    protected double convertToDollars(double denominationInForeignCurrency) {
        double workingForeignCurrency = multiplyBy100(denominationInForeignCurrency);
        return divideBy100(Math.round(workingForeignCurrency / this.getRate()));
    }


    protected double multiplyBy100(double valueToMultiply) {
        double multipliedValue = Math.round(valueToMultiply * 100);
        return multipliedValue;
    }

    protected double divideBy100(double valueToDivide) {
        double dividedValue = valueToDivide / 100;
        return dividedValue;
    }

    protected String displayWithSymbol (double amount){
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("%4s", this.currencySymbol)).append(" " + amount + "\n");
        return builder.toString();
    }



}
