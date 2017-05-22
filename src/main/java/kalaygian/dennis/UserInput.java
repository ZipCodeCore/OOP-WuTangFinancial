package kalaygian.dennis;

import java.util.Scanner;

/**
 * Created by denniskalaygian on 5/22/17.
 */
public class UserInput {

    public static String getStringInput(String prompt) {
        Scanner in = new Scanner(System.in);
        System.out.println(prompt);
        String userInput = in.nextLine();
        return userInput;
    }
    public static Double getDoubleInput(String prompt) {
        try {
            return Double.parseDouble(getStringInput(prompt));
        } catch(Exception e){
            return getDoubleInput("Please input a valid number");
        }
    }
}
