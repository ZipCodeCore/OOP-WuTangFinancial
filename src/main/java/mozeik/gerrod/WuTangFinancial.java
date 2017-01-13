package mozeik.gerrod;

import java.util.Scanner;

/**
 * Created by gerrodmozeik on 1/12/17.
 */
public class WuTangFinancial {


    public Double inputMonetaryValue;
    public Double outputMonetaryValue;
    public Double relativeExchangeRate;

    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        Prompter prompter = new Prompter();

    }

    /*public Double callCurrencyConverter(Double relativeExchangeRate, Double inputMonetaryValue) {

        convertCaseIDToRelativeExchangeRate('a');
        return converter.convertInputValueToOutputValue(relativeExchangeRate,inputMonetaryValue);
    }*/


    public Double convertCaseIDToRelativeExchangeRate(char caseIdentifier) {
        switch (caseIdentifier) {
            case 'a': //Dollar to Euro
                relativeExchangeRate = 0.94;
                return relativeExchangeRate;
            case 'b': //Euro to Dollar
                relativeExchangeRate = 1.063829787234043;
                return relativeExchangeRate;
            case 'c': //Euro to Pound
                relativeExchangeRate = 0.872340425531915;
                return relativeExchangeRate;
            case 'd': //Pound to Rupee
                relativeExchangeRate = 83.317073170731707;
                return relativeExchangeRate;
            case 'e': //Rupee to Canadian Dollar
                relativeExchangeRate = 0.019320843091335;
                return relativeExchangeRate;
            case 'f': //Canadian Dollar to Singapore Dollar
                relativeExchangeRate = 1.083333333333333;
                return relativeExchangeRate;
            case 'g': //Singapore Dollar to Swiss Franc
                relativeExchangeRate = 0.706293706293706;
                return relativeExchangeRate;
            case 'h': //Swiss Franc to Malaysian Ringgit
                relativeExchangeRate = 4.425742574257426;
                return relativeExchangeRate;
            case 'i': //Malaysian Ringgit to Japanese Yen
                relativeExchangeRate = 0.03858770718232;
                return relativeExchangeRate;
            case 'j'://Japanese Yen to Chinese Yuan
                relativeExchangeRate = 0.059737569060773;
                return relativeExchangeRate;
            default:
                relativeExchangeRate = -1.0;
                return relativeExchangeRate;
        }
    }


    public Double run(char c, Double d) {
        WuTangFinancial wuTangFinancial = new WuTangFinancial();
        this.relativeExchangeRate = wuTangFinancial.convertCaseIDToRelativeExchangeRate(c);
        this.inputMonetaryValue = d;
        this.outputMonetaryValue = this.callCurrencyConverter(relativeExchangeRate, inputMonetaryValue);
        return outputMonetaryValue;
    }
}
