public class Currency {

    private final String name;
    private final double rate;

    public Currency(String name, double rate){
        this.name = name;
        this.rate = rate;
    }


    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public double convertTo(Currency targetCurrency, double amount){

        double conversionFactor = 0;
        conversionFactor = targetCurrency.getRate() / this.rate;

        double convertedAmount = amount * conversionFactor;

        return convertedAmount;
    }




}
