package mattern.william;

import java.util.Scanner;

/**
 * Created by williammattern on 1/12/17.
 */
public class WuTangFinancial {
    public char caseIdentifier;
    public Double relativeExchangeRate;
    public Double inputMonetaryValue;
    public Double outputMonetaryValue;


    public static void main(String[] args){

    }

    public Double callCurrencyConverter(Double relativeExchangeRate, Double inputMonetaryValue){
        CurrencyConverter converter = new CurrencyConverter();
        convertCaseIdToRelativeExchangeRate('a');
        return converter.convertInputValueToOutputValue(relativeExchangeRate,inputMonetaryValue);
    }

    public Double convertCaseIdToRelativeExchangeRate(char caseIdentifier){
        switch (caseIdentifier){
            case 'a':
                //1.Convert Dollar to Euro
                relativeExchangeRate = 0.94;
                return relativeExchangeRate;

            case 'b':
                //2.Convert Euro to Dollar
                relativeExchangeRate = 1.063829787234043; //0.94/1
                return relativeExchangeRate;

            case 'c':
                //3.Convert EUR to GBP
                relativeExchangeRate = 0.872340425531915; //.82/.94
                return relativeExchangeRate;

            case 'd':
                //4.Convert GBP to INR
                relativeExchangeRate = 83.317073170731707;
                return relativeExchangeRate;

            case 'e':
                //5. Convert Rupee to Canadian Dollar
                relativeExchangeRate = 0.019320843091335;
                return relativeExchangeRate;

            case 'f':
                //6. Convert Canadian Dollar to Singapore Dollar
                relativeExchangeRate = 1.083333333333333;
                return relativeExchangeRate;

            case 'g':
                //7. Convert Singapore Dollar to Swiss Franc
                relativeExchangeRate = 0.706293706293706;
                return relativeExchangeRate;

            case 'h':
                //Convert Swiss Franc to Malaysian Ringgit
                relativeExchangeRate = 4.425742574257426;
                return relativeExchangeRate;

            case 'i':
                //Convert Malaysian Ringgit to Japanese Yen
                relativeExchangeRate = 0.03858770718232;
                return relativeExchangeRate;

            case 'j':
                //Convert Japanese Yen to Chinese Yuan Renminbi
                relativeExchangeRate = 0.059737569060773;
                return relativeExchangeRate;

            default:
                relativeExchangeRate = -1.0;
                return relativeExchangeRate;

        }
    }

    public Double run(char c, Double d){
        WuTangFinancial wuTangFinancial = new WuTangFinancial();
        this.relativeExchangeRate = wuTangFinancial.convertCaseIdToRelativeExchangeRate(c);
        this.inputMonetaryValue = d;
        this.outputMonetaryValue = this.callCurrencyConverter(relativeExchangeRate,inputMonetaryValue);
        return outputMonetaryValue;
    }

}
