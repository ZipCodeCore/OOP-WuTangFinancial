package mozeik.gerrod;

/**
 * Created by gerrodmozeik on 1/13/17.
 * This class calls objects from three other classes.
 * The engine prompts the user for a code to select the conversion type they want and the amount of money they want converted.
 * It then uses this code (the case ID) to select an appropriate exchange rate with caseGetter.
 * It passes this exchange rate and the value to be converted to the CurrencyConverter.
 * It rounds these values with CurrencyRounder.
 */
public class WuTangFinancialEngine {

    public void startEngine() {

        Prompter prompter = new Prompter();
        char caseIdentifier = prompter.getCaseIdentifier(); // asks the user to select a conversion code
        Double inputMonetaryValue = prompter.getInputMonetaryValue();

        CaseGetter caseGetter = new CaseGetter();
        Double relativeExchangeRate = caseGetter.convertCaseIDToRelativeExchangeRate(caseIdentifier);

        CurrencyConverter currencyConverter = new CurrencyConverter();
        Double outputMonetaryValue = currencyConverter.convertInputValueToOutputValue(relativeExchangeRate, inputMonetaryValue);

        prompter.displayConvertedMonetaryValue(outputMonetaryValue);

    }



}
