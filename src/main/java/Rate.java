public class Rate {
    //created finals because the rates do not change and no one else needs to change them
    private static double final USD = 1.00;
    private static double final EUR = 0.94;
    private static double final GBP = 0.82;
    private static double final INR = 68.32;
    private static double final AUD = 1.35;
    private static double final CAD = 1.32;
    private static double final SGD = 1.43;
    private static double final CHF = 1.01;
    private static double final MYR = 4.47;
    private static double final JPY = 115.84;
    private static double final CNY = 6.92;
    //created my action that will convert the rates and be used in RateTest
    public double rateConverter(double value, String start, String end){

        return value * getRateOfExchange(end)/getRateOfExchange(start);

    }
    //used a switch statement to hold all the values and go through each one.
    private double rateOfExchange(String rateConverter){

        switch (currency){
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
