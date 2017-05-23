/**
 * Created by luisgarcia on 5/22/17.
 */
public class Pound extends Currency
{
    final double rate = .82;

    public double getRate()
    {
        return rate;
    }

    public char symbol()
    {
        char symbol = '\u00A3';
        return symbol;
    }

}
