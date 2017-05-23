package weisser.sarah.wtfinancial;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sarahweisser on 5/22/17.
 */
public class UserInputTest {
    public static UserInput input;

    @Before
    public void makeTestInput() {
        input = new UserInput();
    }

    @Test
    public void dislayInputChoicesTest() {
        //given
        String expected = "Please enter the number that corresponds to your choice:\n" +
                "(1) US Dollar\n" +
                "(2) Euro\n" +
                "(3) British Pound\n" +
                "(4) Indian Rupee\n" +
                "(5) Australian Dollar\n" +
                "(6) Canadian Dollar\n" +
                "(7) Singapore Dollar\n" +
                "(8) Swiss Franc\n" +
                "(9) Malaysian Ringgit\n" +
                "(10) Japanese Yen\n" +
                "(11) Chinese Yuan Renminbi";

        //when
        String actual = input.printChoice();

        //then
        Assert.assertEquals(expected, actual);
    }
}
