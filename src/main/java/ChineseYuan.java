import org.jcp.xml.dsig.internal.dom.Utils;

import java.util.Locale;

/**
 * Created by luisgarcia on 5/22/17.
 */
public class ChineseYuan extends Currency
{
    final double rate = 6.92;

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
