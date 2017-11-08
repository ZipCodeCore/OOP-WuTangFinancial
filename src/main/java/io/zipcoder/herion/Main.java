package io.zipcoder.herion;

public class Main {

    public static void main(String[] args) {

        Console console = new Console();
        console.printChooseInitialCurrencyAndUserCurrencySelector();
        console.printChooseAmount();
        console.printChooseTargetCurrencyAndUserCurrencySelector();
        console.userChoicesCalc();

    }
}
