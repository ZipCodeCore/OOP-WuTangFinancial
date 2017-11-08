package com.zipCodeWilmington;

public class Menu {

    UserChoice userChoice = new UserChoice();

    public void menu() {

        System.out.println("What kind of convention would you like to do ?");

        System.out.println("Press 1 - US Dollar --> Euro");
        System.out.println("Press 2 - Euro --> US Dollar");
        System.out.println("Press 3 - Convert Euro --> British Pound");
        System.out.println("Press 4 - Convert British Pound --> Indian Rupee");
        System.out.println("Press 5 - Convert Indian Rupee to Canadian Dollar");
        System.out.println("Press 6 - Convert Canadian Dollar to Singapore Dollar");
        System.out.println("Press 7 - Convert Singapore Dollar to Swiss Franc");
        System.out.println("Press 8 - Swiss Franc to Malaysian Ringgit");
        System.out.println("Press 9 - Convert Malaysian Ringgit to Japanese Yen");
        System.out.println("Press 10 - Convert Japanese Yen to Chinese Yuan Renminbi");

        userChoice.options();

    }


}
