/**
 * Created by gregoryfletcher on 5/22/17.
 */
public class CurrencyConverter
{
	public Currency convertedCurrency;
	private Currency unconvertedCurrency;
	private Currency conversionType;

	public void convertTo(Currency conversionType)
	{
		this.conversionType = conversionType;
	}

	public void convertFrom(Currency unconvertedCurrency)
	{
		this.unconvertedCurrency = unconvertedCurrency;
	}

	public void convertCurrency()
	{
		convertedCurrency = conversionType;
		double conversionRate = conversionType.getRate();
		double rateComparator = unconvertedCurrency.getRate();
		double amountToConvert = unconvertedCurrency.getAmount();
		double convertedAmount;
		if (conversionRate > rateComparator)
		{
			convertedAmount = amountToConvert * conversionRate;
		}
		else
		{
			convertedAmount = amountToConvert / conversionRate;
		}
		convertedCurrency.setAmount(convertedAmount);
	}


}
