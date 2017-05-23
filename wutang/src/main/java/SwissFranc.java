/**
 * Created by gregoryfletcher on 5/22/17.
 */
public class SwissFranc extends Currency
{
	public SwissFranc()
	{
		super("CHF", 1.0, 1.01);
	}

	public SwissFranc(double amount)
	{
		super("CHF", amount, 1.01);
	}
}
