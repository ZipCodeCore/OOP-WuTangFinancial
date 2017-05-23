import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gregoryfletcher on 5/22/17.
 */
public class testCurrencyConverter
{
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

	@Test
	public void testConvertCurrencySGDToCHF()
	{
		//: Given
		SingaporeDollar sgd = new SingaporeDollar();
		SwissFranc chf = new SwissFranc();
		conversionEngine.convertTo(chf);
		conversionEngine.convertFrom(sgd);

		double expected = 1.01;

		//: When
		conversionEngine.convertCurrency();
		Currency newCHF = conversionEngine.convertedCurrency;
		double actual = newCHF.getAmount();

		//: Then
		assertEquals("These values should be equal", expected, actual, 2);
	}

	@Test
	public void testConvertCurrencyCHFToMYR()
	{
		//: Given
		SwissFranc chf = new SwissFranc();
		MalaysianRinggit myr = new MalaysianRinggit();
		conversionEngine.convertTo(myr);
		conversionEngine.convertFrom(chf);

		double expected = 4.47;

		//: When
		conversionEngine.convertCurrency();
		Currency newMYR = conversionEngine.convertedCurrency;
		double actual = newMYR.getAmount();

		//: Then
		assertEquals("These values should be equal", expected, actual, 2);
	}

	@Test
	public void testConvertCurrencyMYRToJYP()
	{
		//: Given
		MalaysianRinggit myr = new MalaysianRinggit();
		JapaneseYen jyp = new JapaneseYen();
		conversionEngine.convertTo(jyp);
		conversionEngine.convertFrom(myr);

		double expected = 115.84;

		//: When
		conversionEngine.convertCurrency();
		Currency newJYP = conversionEngine.convertedCurrency;
		double actual = newJYP.getAmount();

		//: Then
		assertEquals("These values should be equal", expected, actual, 2);
	}

	@Test
	public void testConvertCurrencyJYPToCNYRMB()
	{
		//: Given
		ChineseYuanRenminbi cnyrmb = new ChineseYuanRenminbi();
		JapaneseYen jyp = new JapaneseYen();
		conversionEngine.convertTo(cnyrmb);
		conversionEngine.convertFrom(jyp);

		double expected = 6.92;

		//: When
		conversionEngine.convertCurrency();
		Currency newCNYRMB = conversionEngine.convertedCurrency;
		double actual = newCNYRMB.getAmount();

		//: Then
		assertEquals("These values should be equal", expected, actual, 2);
	}

}
