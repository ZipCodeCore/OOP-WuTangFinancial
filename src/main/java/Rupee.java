/**
 * Created by luisgarcia on 5/22/17.
 */
public class Rupee extends Currency
{
    final double rate = 68.32;

    public double getRate()
    {
        return rate;
    }

    public char symbol()
    {
        char symbol = '\u20A7';
        return symbol;
    }



}
