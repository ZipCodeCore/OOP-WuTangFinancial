import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import java.io.ByteArrayInputStream;
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
//    @Test
//    public void testGetStringInput(){
//        //Given
//        String stringInput = "test";
//        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(stringInput.getBytes());
//        UserInput userInput = new UserInput(byteArrayInputStream);
//
//        //When
//        String actualOutput = userInput.queryStringInput();
//
//        //Then
//        assertEquals(stringInput, actualOutput);
//    }

    //TODO figure out how to use bytearrayinptustream constructor with bigdecimal byte
//    @Test
//    public void testGetAmountInput(){
//        //Given
//        BigDecimal amount = new BigDecimal(100);
//        byte[] b = new byte[1];
//        b[0]= amount.byteValue();
//        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b);
//        UserInput userInput = new UserInput(byteArrayInputStream);
//
//        //When
//        BigDecimal actualOutput = userInput.queryAmount();
//
//        //Then
//        assertEquals(amount, actualOutput);
//    }
}
