/**
 * Created by gregoryfletcher on 5/22/17.
 */
public abstract class Currency
{
	private double rate;
	private double amount;
	private String name;

	public Currency()
	{
		this.rate = 1;
		this.amount = 0.0;
		this.name = "Unit";
	}

	public Currency(String name, double amount, double rate)
	{
		this.name = name;
		this.amount = amount;
		this.rate = rate;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
