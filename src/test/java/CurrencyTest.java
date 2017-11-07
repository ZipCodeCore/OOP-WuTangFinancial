import org.junit.Assert;
import org.junit.Test;


public class CurrencyTest {


    @Test
    public void CurrencyTest(){

        String[] currencyNames = {"Us Dollar", "Euro", "British Pound", "Indian Rupee",
                "Australian Dollar", "Canadian Dollar", "Singapore Dollar", "Swiss Franc",
                "Malaysian Ringgit", "Japanese Yen", "Chinese Yuan Renminbi"};
        Double[] exchangeRate = {1.00, 0.94, 0.82, 68.32, 1.35, 1.32, 1.43, 1.01, 4.47, 115.84, 6.92};

        Currency[] currencies = new Currency[currencyNames.length];

        for(int i =0; i<currencyNames.length; i++){
            currencies[i] = new Currency(currencyNames[i],exchangeRate[i]);
        }

        String expected =   "Us Dollar 1.0\n" +
                            "Euro 0.94\n" +
                            "British Pound 0.82\n" +
                            "Indian Rupee 68.32\n" +
                            "Australian Dollar 1.35\n" +
                            "Canadian Dollar 1.32\n" +
                            "Singapore Dollar 1.43\n" +
                            "Swiss Franc 1.01\n" +
                            "Malaysian Ringgit 4.47\n" +
                            "Japanese Yen 115.84\n" +
                            "Chinese Yuan Renminbi 6.92\n";
        String actual = "";



        for(Currency eachCurrency: currencies){
            actual += eachCurrency.getName() + " " + eachCurrency.getRate() + "\n";
        }

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void convertToTest(){

        String[] currencyNames = {"Us Dollar", "Euro", "British Pound", "Indian Rupee",
                "Australian Dollar", "Canadian Dollar", "Singapore Dollar", "Swiss Franc",
                "Malaysian Ringgit", "Japanese Yen", "Chinese Yuan Renminbi"};
        Double[] exchangeRate = {1.00, 0.94, 0.82, 68.32, 1.35, 1.32, 1.43, 1.01, 4.47, 115.84, 6.92};

        Currency[] currencies = new Currency[currencyNames.length];

        for(int i =0; i<currencyNames.length; i++){
            currencies[i] = new Currency(currencyNames[i],exchangeRate[i]);
        }

        Currency dollars = currencies[0];
        Currency yen = currencies[9];

        double sourceInDollars = 53;
        double expectedInYen = 53*115.84;
        double actualInYen = dollars.convertTo(yen, sourceInDollars);

        Assert.assertEquals(expectedInYen,actualInYen, 0);

        Currency canadianDollar = currencies[5];
        Currency singaporeDollar = currencies[6];

        double sourceInCanadianDollars = 53;
        double expectedInSingaporeDollars = 53* (1.43/1.32);
        double actualInSingaporeDollars = canadianDollar.convertTo(singaporeDollar, sourceInCanadianDollars);


        Assert.assertEquals(expectedInSingaporeDollars,actualInSingaporeDollars, 0);
    }


}