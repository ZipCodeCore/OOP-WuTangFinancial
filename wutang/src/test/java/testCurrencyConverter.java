import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gregoryfletcher on 5/22/17.
 */
public class testCurrencyConverter
{
	public USDollar dollar;
	public Euro euro;
	public CurrencyConverter crooks;

	@Before
	public void startup()
	{
		dollar = new USDollar();
		euro = new Euro();
		crooks = new CurrencyConverter();
	}

	@Test
	public void testConvertCurrency()
	{
		//: Given
		crooks.convertTo(euro);
		crooks.convertFrom(dollar);

		double expected = 0.94;

		//: When
		crooks.convertCurrency();
		Currency newEuros = crooks.convertedCurrency;
		double actual = newEuros.getAmount();

		//: Then
		assertEquals("These values should be equal", expected, actual, 0);
	}

	@Test
	public void test


}
