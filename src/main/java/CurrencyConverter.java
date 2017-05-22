import java.text.DecimalFormat;

/**
 * Created by luisgarcia on 5/22/17.
 */
public class CurrencyConverter
{

    double amount;
    Currency currentType = new Currency();
    Currency expectedType = new Currency();

    CurrencyConverter(){};

    public double convert(Currency currentType, Currency expectedType)
    {
       amount = currentType.getRate()/expectedType.getRate();
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


