package mozeik.gerrod;

/**
 * Created by gerrodmozeik on 1/13/17.
 */
public class WuTangFinancialEngine {

    public void startEngine() {

        Prompter prompter = new Prompter();
        char caseIdentifier = prompter.getCaseIdentifier();
        Double inputMonetaryValue = prompter.getInputMonetaryValue();

        CaseGetter caseGetter = new CaseGetter();
        Double relativeExchangeRate = caseGetter.convertCaseIDToRelativeExchangeRate(caseIdentifier);

        CurrencyConverter currencyConverter = new CurrencyConverter();
        Double outputMonetaryValue = currencyConverter.convertInputValueToOutputValue(relativeExchangeRate, inputMonetaryValue);

        prompter.displayConvertedMonetaryValue(outputMonetaryValue);

    }



}
