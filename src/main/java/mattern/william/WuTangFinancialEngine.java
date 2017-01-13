package mattern.william;

/**
 * Created by williammattern on 1/13/17.
 * This is the engine of the program.  This class will initialize and call three other objects.
 * This initiates the user interface to get the conversion being requested and the monetary value to convert
 * with a instance of the Prompter class.
 * This gets the relative conversion rate with an instance of the caseGetter class.
 * This then converts the money with an instance of the CurrencyConverter class.
 * This then sends the information back to the user with a Prompter class.
 */
public class WuTangFinancialEngine {

    public void startEngine(){
        char caseIdentifier;
        Double relativeExchangeRate;
        Double inputMonetaryValue;
        Double outputMonetaryValue;

        Prompter prompter = new Prompter();
        caseIdentifier = prompter.getCaseIdentifier();
        inputMonetaryValue = prompter.getInputMonetaryValue();

        CaseGetter caseGetter = new CaseGetter();
        relativeExchangeRate = caseGetter.getRelativeExchangeRate(caseIdentifier);

        CurrencyConverter currencyConverter = new CurrencyConverter();
        outputMonetaryValue = currencyConverter.convertInputValueToOutputValue(relativeExchangeRate,inputMonetaryValue);

        prompter.displayConvertedMonetaryValue(outputMonetaryValue);

    }

}
