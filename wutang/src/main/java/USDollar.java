/**
 * Created by gregoryfletcher on 5/22/17.
 */
public class USDollar extends Currency
{
	public USDollar()
	{
		super("USD", 1.00, 1);
	}

	public USDollar(double amount)
	{
		super("USD", amount, 1);
	}
}
