package io.zipcoder.wutangfinancial;

import java.util.Scanner;

public class InputTools {

    private Scanner in = new Scanner (System.in);

    public String getStringInput(String prompt)
    {
        String input;
        System.out.print(prompt);
        input=in.nextLine();
        return input;
    }

    public Double getDoubleInput(String prompt)
    {
        String input;
        Double parsedInput;
        do {
            try {
                input=getStringInput(prompt);
                parsedInput = Double.parseDouble(input);
            } catch (IllegalArgumentException iae) {
                continue;
            }
            return (parsedInput);
        }while(true);
    }

    public Integer getIntegerInput(String prompt)
    {
        Double input=getDoubleInput(prompt);
        return input.intValue();
    }

}
