public class Rate {

    //created finals because the rates do not change and no one else needs to change them
    private static final double USD = 1.00;
    private static final double EUR = 0.94;
    private static final double GBP = 0.82;
    private static final double INR = 68.32;
    private static final double AUD = 1.35;
    private static final double CAD = 1.32;
    private static final double SGD = 1.43;
    private static final double CHF = 1.01;
    private static final double MYR = 4.47;
    private static final double JPY = 115.84;
    private static final double CNY = 6.92;


    //created my action that will convert the rates and be used in RateTest
    public double rateConverter(double value, String start, String end){

        return value * getRateOfExchange(end)/getRateOfExchange(start);

    }
    //used a switch statement to hold all the values and go through each one.
    private double getRateOfExchange(String rateConverter){

        switch (rateConverter){
            case "USD":
            return USD;

            case "EUR":
                return EUR;

            case "GBP":
                return GBP;

            case "INR":
                return INR;

            case "AUD":
                return AUD;

            case "CAD":
                return CAD;

            case "SGD":
                return SGD;

            case "CHF":
                return CHF;

            case "MYR":
                return MYR;

            case "JPY":
                return JPY;

            case "CNY":
                return CNY;
        }
        return 0;
    }
}
