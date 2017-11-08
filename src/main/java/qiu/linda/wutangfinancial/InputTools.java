package qiu.linda.wutangfinancial;


import java.util.Scanner;

public class InputTools {

    private static Scanner in = new Scanner(System.in);

    public static String getStringInput(String question)
    {
        System.out.println(question);
        String input = in.nextLine();
        return input;
    }

    public static double getDoubleInput(String question){

        String stringInput;
        double doubleInput;

        do{
            stringInput = getStringInput(question);
            try{

                doubleInput = Double.parseDouble(stringInput);
                return doubleInput;
            }catch (IllegalArgumentException iae)
            {
                ;
                continue;
            }
        }while(true);
    }

    public static Currency getEnumInput(String question){
        do {
            try{
                String doubleInput = getStringInput(question).toUpperCase();
                Currency enumUserInput = Currency.valueOf(doubleInput.replace(" ","_"));
                return enumUserInput;
            } catch (IllegalArgumentException iae) {
                continue;
                    }
                } while (true);
            }
        }



