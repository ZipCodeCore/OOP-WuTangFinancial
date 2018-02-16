import java.text.DecimalFormat;

public class CurrencyConversion {

        static double USD = 1.00;
        static double EURO = 0.94;
        static double BRITISH_POUND = 0.82;
        static double INDIAN_RUPEE = 68.32;
        static double AUSTRALIAN_DOLLAR = 1.35;
        static double CANADIAN_DOLLAR = 1.32;
        static double SINGAPORE_DOLLAR = 1.43;
        static double SWISS_FRANC = 1.01;
        static double MALAYSIAN_RINGGIT = 4.47;
        static double JAPANESE_YEN = 115.84;
        static double CHINESE_YUAN_RENMINBI = 6.92;

        //NEXT CODEBLOCK INCLUDES:
        //Coversion method declaration with parameters
        //Coversion formula
        //format conversion with DecimalFormat data type
        //return it all

        public static double converter(double setInitialAmount, double initialCurrency, double targetCurrency)
        {
            double converted = (setInitialAmount/initialCurrency) * targetCurrency;

            DecimalFormat roundDecimalTwoPlaces = new DecimalFormat("#.00");

            return Double.parseDouble(roundDecimalTwoPlaces.format(converted));

        }




    }

