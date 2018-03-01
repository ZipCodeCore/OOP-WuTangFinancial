public class Converter {


    static double convertCurrency(double from, double to){
        return convertToDollar(from) * to;
    }
    static double convertToDollar(double from){
        return ExchangeRates.USDollar / from;
    }
//    static double convertFromDollar(double to){
//        double targetAmount = to / ExchangeRates.USDollar;
//        return targetAmount;
//    }
}
