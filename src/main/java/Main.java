/**
 * Created by andrewwong on 5/23/17.
 */
public class Main {
    public static void main(String[] args) {
        Display display = new Display();
        UserInput userInput = new UserInput(System.in, System.out);
        Converter converter = new Converter();
        ExchangeRates rates = new ExchangeRates();
        CurrencyExchangeApp app = new CurrencyExchangeApp(display, userInput, converter, rates);
        app.run();
    }
}
