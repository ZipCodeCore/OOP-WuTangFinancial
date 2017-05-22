/**
 * Created by gregoryfletcher on 5/22/17.
 */
public class BritishGrandPound extends Currency
{
	public BritishGrandPound()
	{
		super("GBP", 1.0, 0.84);
	}

	public BritishGrandPound(double amount)
	{
		super("GBP", amount, 0.84);
	}
}
