package com.markbrown.wutangfinancial;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class InputSetup {

    private Scanner scanner;
    private PrintStream out;

    public InputSetup (InputStream in, PrintStream out) {
        scanner = new Scanner (in);
        this.out = out;
    }

    public String askForInput(String message) {
        out.println(message);
        return scanner.nextLine();
    }
}
