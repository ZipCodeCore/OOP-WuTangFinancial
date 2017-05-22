package com.markbrown.wutangfinancial;

/**
 * Created by markbrown on 5/22/17.
 */
public class Print {

    private Print() {}

    public static void printInvalidInput(String input) {
        String formattedInput = String.format("[%s]", input);
        System.out.println(formattedInput + " is not a valid input.");
    }
}
