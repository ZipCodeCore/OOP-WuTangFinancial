/**
 * Created by luisgarcia on 5/22/17.
 */
public class Currency
{
    protected double rate;

    public Currency()
    {
        getRate();
    }

    public double getRate()
    {
        return rate;
    }

    public char symbol()
    {
        char symbol = '$';
        return symbol;
    }
}