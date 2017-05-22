import org.junit.Test;

import java.math.BigDecimal;

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

        String expected = "$1,738.17";
        //When
        String actual = display.showAsCurrency(money);

        //Then
        assertEquals(expected, actual);
    }
}
