package kalaygian.dennis;

/**
 * Created by denniskalaygian on 5/22/17.
 *
 * Because, why not?
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        Currency current = CurrencyFactory.createCurrency(
                UserInput.getStringInput("What kind of currency do you have, Method Man? Default is USD"),
                UserInput.getDoubleInput("How much do you have, good sir?"));

        String converted = current.convertTo(UserInput.getStringInput("What kind of currency "
                .concat("would you like to convert to?")));

        System.out.println("You have: $".concat(converted).concat(" in that type of currency."));
    }
}
