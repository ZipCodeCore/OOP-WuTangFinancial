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
		assertEquals("These values should be equal", expected, actual, 2);
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

		//: When
		conversionEngine.convertCurrency();
		Currency newUSD = conversionEngine.convertedCurrency;
		double actual = newUSD.getAmount();

		//: Then
		assertEquals("These values should be equal", expected, actual, 2);
	}

	@Test
	public void testConvertCurrencyEuroToGBP()
	{
		//: Given
		Euro eur = new Euro();
		GreatBritainPound gbp = new GreatBritainPound();
		conversionEngine.convertTo(gbp);
		conversionEngine.convertFrom(eur);

		double expected = 0.84;

		//: When
		conversionEngine.convertCurrency();
		Currency newGBP = conversionEngine.convertedCurrency;
		double actual = newGBP.getAmount();

		//: Then
		assertEquals("These values should be equal", expected, actual, 2);
	}

	@Test
	public void testConvertCurrencyGBPToINR()
	{
		//: Given
		IndianRupee inr = new IndianRupee();
		GreatBritainPound gbp = new GreatBritainPound();
		conversionEngine.convertTo(inr);
		conversionEngine.convertFrom(gbp);

		double expected = 68.32;

		//: When
		conversionEngine.convertCurrency();
		Currency newINR = conversionEngine.convertedCurrency;
		double actual = newINR.getAmount();

		//: Then
		assertEquals("These values should be equal", expected, actual, 2);
	}

	@Test
	public void testConvertCurrencyINRToCAD()
	{
		//: Given
		IndianRupee inr = new IndianRupee();
		CanadianDollar cad = new CanadianDollar();
		conversionEngine.convertTo(cad);
		conversionEngine.convertFrom(inr);

		double expected = 1.32;

		//: When
		conversionEngine.convertCurrency();
		Currency newINR = conversionEngine.convertedCurrency;
		double actual = newINR.getAmount();

		//: Then
		assertEquals("These values should be equal", expected, actual, 2);
	}

	@Test
	public void testConvertCurrencyCADToSGD()
	{
		//: Given
		SingaporeDollar sgd = new SingaporeDollar();
		CanadianDollar cad = new CanadianDollar();
		conversionEngine.convertTo(sgd);
		conversionEngine.convertFrom(cad);

		double expected = 1.43;

		//: When
		conversionEngine.convertCurrency();
		Currency newSGD = conversionEngine.convertedCurrency;
		double actual = newSGD.getAmount();

		//: Then
		assertEquals("These values should be equal", expected, actual, 2);
	}

}
