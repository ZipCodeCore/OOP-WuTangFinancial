package io.zipcoder.wutangfinancial;

import static io.zipcoder.wutangfinancial.ConversionRates.*;

public class Conversion {


    public Conversion(){

    }

    public double convert(double userAmount, ConversionRates moneyTypeGiven, ConversionRates moneyTypeExpected){
        double givenRate = valueOf(String.valueOf(moneyTypeGiven)).getConversionRate();
        double expectedRate = valueOf(String.valueOf(moneyTypeExpected)).getConversionRate();
        double conversionRate = expectedRate/givenRate;

        double amountConverted = userAmount * conversionRate;

      return amountConverted;

    }



}
