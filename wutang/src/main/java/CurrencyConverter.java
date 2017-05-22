/**
 * Created by gregoryfletcher on 5/22/17.
 */
public class CurrencyConverter
{

	public Currency currencyOne;
	public Currency currencyTwo;
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

	}


}
