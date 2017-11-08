package fountain.donald.WuTanFinancial;

public class StartApplication {

    public static void main(String[] args) {
        String userInput;

        System.out.println("\n" +
                        "   ||====================================================================||\n" +
                "   ||//$\\\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\//$\\\\||\n" +
                "   ||(100)==================| FEDERAL RESERVE NOTE |================(100)||\n" +
                "   ||\\\\$//        ~         '------========--------'                \\\\$//||\n" +
                "   ||<< /        /$\\              // ____ \\\\                         \\ >>||\n" +
                "   ||>>|  12    //L\\\\            // ///..) \\\\         L38036133B   12 |<<||\n" +
                "   ||<<|        \\\\ //           || <||  >\\  ||                        |>>||\n" +
                "   ||>>|         \\$/            ||  $$ --/  ||        One Hundred     |<<||\n" +
                "||====================================================================||>||\n" +
                "||//$\\\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\//$\\\\||<||\n" +
                "||(100)==================| FEDERAL RESERVE NOTE |================(100)||>||\n" +
                "||\\\\$//        ~         '------========--------'                \\\\$//||\\||\n" +
                "||<< /        /$\\              // ____ \\\\                         \\ >>||)||\n" +
                "||>>|  12    //L\\\\            // ///..) \\\\         L38036133B   12 |<<||/||\n" +
                "||<<|        \\\\ //           || <||  >\\  ||                        |>>||=||\n" +
                "||>>|         \\$/            ||  $$ --/  ||        One Hundred     |<<||\n" +
                "||<<|      L38036133B        *\\\\  |\\_/  //* series                 |>>||\n" +
                "||>>|  12                     *\\\\/___\\_//*   1989                  |<<||\n" +
                "||<<\\      Treasurer     ______/Franklin\\________     Secretary 12 />>||\n" +
                "||//$\\                 ~|UNITED STATES OF AMERICA|~               /$\\\\||\n" +
                "||(100)===================  ONE HUNDRED DOLLARS =================(100)||\n" +
                "||\\\\$//\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\\\$//||\n" +
                "||====================================================================||\n\n");

        ApplicationRun start = new ApplicationRun();
        start.runApplication();

        do {
            userInput = Console.getUserInputString("Would you like to get another currency conversion?\n" +
                       "Please enter YES or NO.");
            if(userInput.equalsIgnoreCase("yes")){
                start.runApplication();
            } else if(userInput.equalsIgnoreCase("no")){
                System.out.println("Thank you for using this our services.\n" +
                        "Have a nice day.");
                break;
            }
        } while (!(userInput.equalsIgnoreCase("yes")) || !(userInput.equalsIgnoreCase("no")));

    }
}
