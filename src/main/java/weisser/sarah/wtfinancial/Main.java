package weisser.sarah.wtfinancial;

/**
 * Created by sarahweisser on 5/22/17.
 */
public class Main {

    public static void main(String[] args) {
        UserInput input = new UserInput();
        input.setConvertFrom();
        input.setConvertTo();
        input.setAmountToConvert();
        System.out.println("Converting " + input.getAmountToConvert() + " in "
                + input.getConvertFrom().toString() + " to " + input.getConvertTo() + ".");
        CurrencyConverter converter = new CurrencyConverter(input.getConvertFrom(), input.getConvertTo(), input.getAmountToConvert());
        System.out.println("You will receive: " + converter.convertCurrency() + " in " + input.getConvertTo());

    }
}
