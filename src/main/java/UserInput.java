import java.io.InputStream;
import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by andrewwong on 5/22/17.
 */
public class UserInput {
    static Scanner in;
    UserInput(InputStream scannerIn){
        in = new Scanner(scannerIn);
    }
    UserInput(){
        in = new Scanner(System.in);
    }
    public static String queryStringInput() {
        String userInput = in.nextLine();
        return userInput;
    }
    public static BigDecimal queryAmount(){
        return in.nextBigDecimal();
    }

}
