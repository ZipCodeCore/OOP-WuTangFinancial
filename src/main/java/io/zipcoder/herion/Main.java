package io.zipcoder.herion;

//This is the solution to one of the labs early on in Zip Code Wilmington course, in which the requirement was to create a
//program which could convert currency from among ten specified currency types with current rates fixed


public class Main {

    public static void main(String[] args) {

        Console console = new Console();
        console.collectiveUserInputs();
        console.userChoicesCalc();

    }
}
