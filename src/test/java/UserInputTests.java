import org.junit.Test;
import org.mockito.Mockito;
import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by andrewwong on 5/23/17.
 */
public class UserInputTests {

    @Test
    public void testQueryStringInput(){
        // Given
        UserInput mockedInput = Mockito.mock(UserInput.class);
        String expected = "Mock return";
        // When
        Mockito.when(mockedInput.queryStringInput()).thenReturn(expected);
        String actual = mockedInput.queryStringInput();
        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void testQueryAmount(){
        // Given
        UserInput mockedInput = Mockito.mock(UserInput.class);
        BigDecimal expected = new BigDecimal(10);
        // When
        Mockito.when(mockedInput.queryAmount()).thenReturn(expected);
        BigDecimal actual = mockedInput.queryAmount();
        // Then
        assertEquals(expected, actual);
    }
}
