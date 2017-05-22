/**
 * Created by gregoryfletcher on 5/22/17.
 */
public class Euro extends Currency
{
	public Euro()
	{
		super("EUR", 1.0, 0.94);
	}

	public Euro(double amount)
	{
		super("EUR", amount, 0.94);
	}
}
