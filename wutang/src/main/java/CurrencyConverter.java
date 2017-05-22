/**
 * Created by gregoryfletcher on 5/22/17.
 */
public class CurrencyConverter
{
	public Currency convertedCurrency;
	public Currency unconvertedCurrency;
	public Currency conversionType;

	public void convertTo(Currency conversionType)
	{
		this.conversionType = conversionType;
	}

	public void convertFrom(Currency unconvertedCurrency)
	{
		this.unconvertedCurrency = unconvertedCurrency;
	}

	public void convertCurrency(Currency unconvertedCurrency)
	{
		conversionType = convertedCurrency;
		double conversionRate = conversionType.getRate();
		double conversionCheck = unconvertedCurrency.getRate();
		double amountToConvert = unconvertedCurrency.getAmount();
		double convertedAmount;
		if (conversionRate > conversionCheck)
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
