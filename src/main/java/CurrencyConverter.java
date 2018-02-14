 public class CurrencyConverter {

     private static final double USD = 1.00;
     private static final double EUR = 0.94;
     private static final double GBP = 0.82;
     private static final double RUPEE = 68.32;
     private static final double AUD = 1.35;
     private static final double CAD = 1.32;
     private static final double SGD = 1.43;
     private static final double FRANC = 1.01;
     private static final double RINGGIT = 4.47;
     private static final double YEN = 115.84;
     private static final double YUAN = 6.92;


     //method 'convert' to get the value(amount of money to exchange) * ending/starting
     public double convert(double value, String starting, String ending) {

         return value * getExchangeRate(ending) / getExchangeRate(starting);
     }

     //use a switch statement to get and return currencies
     private double getExchangeRate(String currency) {
         switch (currency) {
             case "USD":
                 return USD;
             case "EUR":
                 return EUR;
             case "GBP":
                 return GBP;
             case "RUPEE":
                 return RUPEE;
             case "AUD":
                 return AUD;
             case "CAD":
                 return CAD;
             case "SGD":
                 return SGD;
             case "FRANC":
                 return FRANC;
             case "RINGGIT":
                 return RINGGIT;
             case "YEN":
                 return YEN;
             case "YUAN":
                 return YUAN;
         }

         return 0;
     }
 }
