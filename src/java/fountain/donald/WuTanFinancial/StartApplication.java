package fountain.donald.WuTanFinancial;

public class StartApplication {

    public static void main(String[] args) {
        String userInput;
        ApplicationRun start = new ApplicationRun();
        start.runApplication();

        do {
            userInput = Console.getUserInputString("Would you like to get another currency conversion?\n" +
                       "Please enter yes or no.");
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
