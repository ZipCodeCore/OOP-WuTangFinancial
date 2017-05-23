/**
 * Created by gregoryfletcher on 5/22/17.
 */
public class CanadianDollar extends Currency
{
	public CanadianDollar()
	{
		super("CAD", 1.0, 1.32);
	}

	public CanadianDollar(double amount)
	{
		super("CAD", amount, 1.32);
	}
}
