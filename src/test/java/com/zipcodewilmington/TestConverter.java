package com.zipcodewilmington;

import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;

public class TestConverter {
    @Test
    public void testConstructor() {
        // Given
        HashMap<String, Float> conversion = new HashMap<String, Float>();
        conversion.put("USD", 1.00F);
        conversion.put("EUR", 0.94F);
        conversion.put("GBP", 0.82F);
        conversion.put("INR", 68.32F);
        conversion.put("AUD", 1.35F);
        conversion.put("CAD", 1.32F);
        conversion.put("SGD", 1.43F);
        conversion.put("CHF", 1.01F);
        conversion.put("MYR", 4.47F);
        conversion.put("JPY", 115.84F);
        conversion.put("CNY", 6.92F);

        // When
        Converter converter = new Converter();

        // Then
        Assert.assertTrue(conversion.equals(converter.getConversion()));

    }

    @Test
    public void testConvertToUsd() {
        // Given
        float amount = 100;
        String type = "EUR";
        float expected = 106.38f;

        //When
        Converter converter = new Converter();
        float actual = converter.convertToDollar(amount, type);

        // Then
        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void testEurToUsd() {
        // Given
        float amount = 100;
        String fromType = "EUR";
        String toType = "USD";
        float expected = 106.38f;

        //When
        Converter converter = new Converter();
        float actual = converter.convert(amount, fromType, toType);

        // Then
        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void testUsdToEur() {
        // Given
        float amount = 100;
        String fromType = "USD";
        String toType = "EUR";
        float expected = 94;

        // When
        Converter converter = new Converter();
        float actual = converter.convert(amount, fromType, toType);

        // Then
        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void testEurToGbp() {
        // Given
        float amount = 100;
        String fromType = "EUR";
        String toType = "GBP";
        float expected = 87.23f;

        // When
        Converter converter = new Converter();
        float actual = converter.convert(amount, fromType, toType);

        // Then
        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void testGbpToInr() {
        // Given
        float amount = 100;
        String fromType = "GBP";
        String toType = "INR";
        float expected = 8331.70f;

        // When
        Converter converter = new Converter();
        float actual = converter.convert(amount, fromType, toType);

        // Then
        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void testInrToCad() {
        // Given
        float amount = 1000;
        String fromType = "INR";
        String toType = "CAD";
        float expected = 19.32f;

        // When
        Converter converter = new Converter();
        float actual = converter.convert(amount, fromType, toType);

        // Then
        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void testCadToSgd() {
        // Given
        float amount = 100;
        String fromType = "CAD";
        String toType = "SGD";
        float expected = 108.33f;

        // When
        Converter converter = new Converter();
        float actual = converter.convert(amount, fromType, toType);

        // Then
        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void testSgdToChf() {
        // Given
        float amount = 100;
        String fromType = "SGD";
        String toType = "CHF";
        float expected = 70.62f;

        // When
        Converter converter = new Converter();
        float actual = converter.convert(amount, fromType, toType);

        // Then
        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void testChfToMYR() {
        // Given
        float amount = 100;
        String fromType = "CHF";
        String toType = "MYR";
        float expected = 442.57f;

        // When
        Converter converter = new Converter();
        float actual = converter.convert(amount, fromType, toType);

        // Then
        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void testMyrToJpy() {
        // Given
        float amount = 1000;
        String fromType = "MYR";
        String toType = "JPY";
        float expected = 25914.98f;

        // When
        Converter converter = new Converter();
        float actual = converter.convert(amount, fromType, toType);

        // Then
        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void testJpyToCny() {
        // Given
        float amount = 100;
        String fromType = "JPY";
        String toType = "CNY";
        float expected = 5.97f;

        // When
        Converter converter = new Converter();
        float actual = converter.convert(amount, fromType, toType);

        // Then
        Assert.assertEquals(expected, actual, .01);
    }
}
