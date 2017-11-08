package io.zipcoder.wutangfinancial;

import io.zipcoder.wutangfinancial.currency.*;

public class Console{

    private InputTools in = new InputTools();
    private Currencies convertFrom;
    private Currencies convertTo;
    private Double startingAmount;

    public void run(){
        ZCWCurrency fromZCWCurrency;
        ZCWCurrency toZCWCurrency;
        String runAgain;

        do {
            displayMenu();
            getUserInputs();
            fromZCWCurrency = createCurrencyObject(convertFrom);
            toZCWCurrency = createCurrencyObject(convertTo);
            toZCWCurrency = fromZCWCurrency.convertToCurrency(toZCWCurrency);
            System.out.println(toZCWCurrency.getLocalFormatAmount());

            runAgain = in.getStringInput("Run again? ");

        }while ("Y".equalsIgnoreCase(runAgain));

    }

    private void displayMenu() {
        System.out.println("\n");

        for (Currencies c : Currencies.values())
        {
            System.out.println("["+c+"] : "+c.nameOfCurrency());
        }
    }

    private void getUserInputs(){
        startingAmount = in.getDoubleInput("How much are we converting? ");
        convertFrom = getCurrencyAbbreviation("What currency are we converting from [please use abbreviation]? ");
        convertTo = getCurrencyAbbreviation("What currency are we converting to [please use abbreviation]? ");
    }

    private Currencies getCurrencyAbbreviation(String prompt){
        String abbreviation;

        do {
            abbreviation = in.getStringInput(prompt);
            abbreviation=abbreviation.toUpperCase();
            for (Currencies c : Currencies.values()) {
                if (abbreviation.equals(c.toString())) {
                    return c;
                }
            }
        }while (true);
    }

    private ZCWCurrency createCurrencyObject(Currencies c){

        switch (c)
        {
            case USD:{ return (new UsDollar(startingAmount)); }
            case EUR:{ return (new EuroZCWCurrency(startingAmount)); }
            case GBP:{ return (new BritishPound(startingAmount)); }
            case INR:{ return (new IndianRupee(startingAmount)); }
            case AUD:{ return (new AustralianDollar(startingAmount)); }
            case CAD:{ return (new CanadianDollar(startingAmount)); }
            case SGD:{ return (new SingaporeDollar(startingAmount)); }
            case CHF:{ return (new SwissFranc(startingAmount)); }
            case MYR:{ return (new MalaysianRinggit(startingAmount)); }
            case JPY:{ return (new JapaneseYen(startingAmount)); }
            case CNY:{ return (new ChineseYuan(startingAmount)); }
            default: { return null; }
        }

    }

}
