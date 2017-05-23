import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gregoryfletcher on 5/22/17.
 */
public class testCurrencyConverter
{
	public AustralianDollar aud;
	public GreatBritainPound gbp;
	public CanadianDollar cad;
	public ChineseYuanRenminbi cnyrmb;
	public IndianRupee inr;
	public JapaneseYen jpy;
	public MalaysianRinggit myr;
	public SingaporeDollar sgd;
	public SwissFranc chf;
	public CurrencyConverter conversionEngine;

	@Before
	public void startup()
	{

		conversionEngine = new CurrencyConverter();
	}

	@Test
	public void testConvertCurrencyDollarToEuro()
	{
		//: Given
		USDollar usd = new USDollar();
		Euro eur = new Euro();
		conversionEngine.convertTo(eur);
		conversionEngine.convertFrom(usd);

		double expected = 0.94;

		//: When
		conversionEngine.convertCurrency();
		Currency newEuros = conversionEngine.convertedCurrency;
		double actual = newEuros.getAmount();

		//: Then
		assertEquals("These values should be equal", expected, actual, 0);
	}

	@Test
	public void testConvertCurrencyEuroToDollar()
	{
		//: Given
		USDollar usd = new USDollar();
		Euro eur = new Euro();
		conversionEngine.convertTo(usd);
		conversionEngine.convertFrom(eur);

		double expected = 1.06;
	}


}
