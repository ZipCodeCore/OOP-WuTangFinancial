/**
 * Created by gregoryfletcher on 5/22/17.
 */
public class SingaporeDollar extends Currency
{
	public SingaporeDollar()
	{
		super("SGD", 1.0, 1.43);
	}

	public SingaporeDollar(double amount)
	{
		super("SGD", amount, 1.43);
	}
}
