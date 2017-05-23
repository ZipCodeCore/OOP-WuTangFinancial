/**
 * Created by gregoryfletcher on 5/22/17.
 */
public class MalaysianRinggit extends Currency
{
	public MalaysianRinggit()
	{
		super("MYR", 1.0, 4.47);
	}

	public MalaysianRinggit(double amount)
	{
		super("MYR", amount, 4.47);
	}
}
