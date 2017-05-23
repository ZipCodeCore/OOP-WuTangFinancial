/**
 * Created by gregoryfletcher on 5/22/17.
 */
public class AustralianDollar extends Currency
{
	public AustralianDollar()
	{
		super("AUD", 1.0, 1.35);
	}

	public AustralianDollar(double amount)
	{
		super("AUD", amount, 1.35);
	}
}
