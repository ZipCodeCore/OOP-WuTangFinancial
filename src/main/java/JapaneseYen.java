/**
 * Created by luisgarcia on 5/22/17.
 */
public class JapaneseYen extends Currency
{
    final double rate = 115.84;

    public double getRate()
    {
        return rate;
    }

    public char symbol()
    {
        char symbol = '\u00A5';
        return symbol;
    }
}
