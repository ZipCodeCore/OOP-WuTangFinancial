import org.junit.Test;

import java.math.BigDecimal;
import java.util.Locale;

import static org.junit.Assert.assertEquals;

/**
 * Created by andrewwong on 5/22/17.
 */
public class DisplayTests {
    Display display = new Display();
    @Test
    public void testDisplayAmountUSD(){
        //Given
        BigDecimal money = new BigDecimal(1738.1738);
        Locale locale = Locale.US;
        String expected = "$1,738.17";
        //When
        String actual = display.showAsCurrency(money, locale);

        //Then
        assertEquals(expected, actual);
    }
    @Test
    public void testDisplayAmountEUR(){
        //Given
        BigDecimal money = new BigDecimal(1738.1738);
        Locale locale = Locale.GERMANY;
        String expected = "1.738,17 €";
        //When
        String actual = display.showAsCurrency(money, locale);

        //Then
        assertEquals(expected, actual);
    }
    @Test
    public void testDisplayAmountGBP(){
        //Given
        BigDecimal money = new BigDecimal(1738.1738);
        Locale locale = Locale.UK;
        String expected = "£1,738.17";
        //When
        String actual = display.showAsCurrency(money, locale);

        //Then
        assertEquals(expected, actual);
    }
//    @Test
//    public void testDisplayAmountINR(){
//        //Given
//        BigDecimal money = new BigDecimal(1738.1738);
//        Locale locale = Locale.;
//        String expected = "1.738,17 €";
//        //When
//        String actual = display.showAsCurrency(money, locale);
//
//        //Then
//        assertEquals(expected, actual);
//    }
    @Test
    public void testDisplayAmountAUD(){
        //Given
        BigDecimal money = new BigDecimal(1738.1738);
        Locale locale = Locale.US;
        String expected = "$1,738.17";
        //When
        String actual = display.showAsCurrency(money, locale);

        //Then
        assertEquals(expected, actual);
    }
    @Test
    public void testDisplayAmountCAD(){
        //Given
        BigDecimal money = new BigDecimal(1738.1738);
        Locale locale = Locale.CANADA;
        String expected = "$1,738.17";
        //When
        String actual = display.showAsCurrency(money, locale);

        //Then
        assertEquals(expected, actual);
    }
    @Test
    public void testDisplayAmountSGD(){
        //Given
        BigDecimal money = new BigDecimal(1738.1738);
        Locale locale = Locale.US;
        String expected = "$1,738.17";
        //When
        String actual = display.showAsCurrency(money, locale);

        //Then
        assertEquals(expected, actual);
    }

    //TODO figure out how to do F symbol
    @Test
    public void testDisplayAmountCHF(){
        //Given
        BigDecimal money = new BigDecimal(1738.1738);
        Locale locale = Locale.US;
        String expected = "$1,738.17";
        //When
        String actual = display.showAsCurrency(money, locale);

        //Then
        assertEquals(expected, actual);
    }
    //TODO figure out how to do MYR symbol
    @Test
    public void testDisplayAmountMYR(){
        //Given
        BigDecimal money = new BigDecimal(1738.1738);
        Locale locale = Locale.US;
        String expected = "RM 1,738.17";
        //When
        String actual = display.showAsCurrency(money, locale);

        //Then
        assertEquals(expected, actual);
    }
    @Test
    public void testDisplayAmountJPY(){
        //Given
        BigDecimal money = new BigDecimal(1738.1738);
        Locale locale = Locale.JAPAN;
        String expected = "￥1,738";
        //When
        String actual = display.showAsCurrency(money, locale);

        //Then
        assertEquals(expected, actual);
    }
    @Test
    public void testDisplayAmountCNY(){
        //Given
        BigDecimal money = new BigDecimal(1738.1738);
        Locale locale = Locale.CHINA;
        String expected = "￥1,738.17";
        //When
        String actual = display.showAsCurrency(money, locale);

        //Then
        assertEquals(expected, actual);
    }
}
