import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by andrewwong on 5/22/17.
 */
public class UserInput {
    private static Scanner scanner;
    private PrintStream out;

    UserInput(InputStream in, PrintStream out) {
        scanner = new Scanner(in);
        this.out = out;
    }

    public String queryStringInput(){
        return scanner.nextLine();
    }

    public BigDecimal queryAmount(){
        return scanner.nextBigDecimal();
    }




//    UserInput(InputStream scannerIn){
//        in = new Scanner(scannerIn);
//    }
//    UserInput(){
//        in = new Scanner(System.in);
//    }
//    public static String queryStringInput() {
//        String userInput = in.nextLine();
//        return userInput;
//    }
//    public static BigDecimal queryAmount(){
//        return in.nextBigDecimal();
//    }

}
