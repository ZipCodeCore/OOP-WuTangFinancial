import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by andrewwong on 5/23/17.
 */
public class ExchangeRatesTests {
    @Test
    public void testSelectMenuOption2(){
        //Given
        ExchangeRates rates = new ExchangeRates();
        BigDecimal expected = new BigDecimal(0.94);
        String option = "2";
        //When
        BigDecimal actual = rates.selectMenuOption(option);
        //Then
        assertEquals(expected,actual);
    }
    @Test
    public void testSelectMenuOption5(){
        //Given
        ExchangeRates rates = new ExchangeRates();
        BigDecimal expected = new BigDecimal(1.35);
        String option = "5";
        //When
        BigDecimal actual = rates.selectMenuOption(option);
        //Then
        assertEquals(expected,actual);
    }
}
