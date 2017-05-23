import java.text.DecimalFormat;

/**
 * Created by luisgarcia on 5/22/17.
 */
public class CurrencyConverter
{

    double amount;
    Currency currencyOne = new Currency();
    Currency currencyTwo = new Currency();

    CurrencyConverter(){};

    public double convert(Currency currencyOne, Currency currencyTwo)
    {
       amount = currencyOne.getRate()/currencyTwo.getRate();
       amount = round(amount);
       return amount;
    }

    public double round(double val)
    {
        DecimalFormat rounder = new DecimalFormat("##########.##");
        val = Double.valueOf(rounder.format(val));
        return val;
    }

    public double getAmount(double money, Currency out, Currency in)
    {
        money = money * convert(in, out);
        money = round(money);
        return money;
    }

}


