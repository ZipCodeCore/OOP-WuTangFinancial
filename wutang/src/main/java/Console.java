import java.util.Scanner;

/**
 * Created by jarrydstamatelos on 5/22/17.
 */
public class Console {

    private static final Scanner scanner = new Scanner(System.in);

    public static void print(String val, Object... args) {
        System.out.format(val, args);
    }

    public static void println(String val, Object... vals) {
        print(val + "\n", vals);
    }

    public static void printDouble(double val, Object... args){println(Double.toString(val), args);}

    public static void printMoney(long val) {
        println(moneyToString(val));
    }

    public static String getStringInput(String prompt, Object... args) {
        println(prompt, args);
        return scanner.nextLine();
    }


    public static String moneyToString(long amount) {
        long whole = amount / 100;
        long  part = amount % 100;
        return String.format("$%d.%02d", whole, part);
    }

    public static Double getDoubleInput(String prompt, Object... args) {
        String stringInput = getStringInput(prompt, args);
        try {
            Double doubleInput = Double.parseDouble(stringInput);
            return doubleInput;
        } catch (NumberFormatException nfe) {
            println("[ %s ] is an invalid input!", stringInput);
            println("Try inputting a numeric value!");
            return getDoubleInput(prompt, args);
        }
    }

}
