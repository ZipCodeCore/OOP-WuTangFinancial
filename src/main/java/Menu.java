import java.util.Scanner;

public abstract class Menu {
    private final Enum[] enumerations;

    public Menu(Enum[] enumerations) {
        this.enumerations = enumerations;
    }

    Scanner in = new Scanner(System.in);

    public abstract void userSelect(String userInput);

    public abstract void printMenuMessage();

    public void display() {

        String userInput = null;

        do {
            try {
                userInput = getUserInput();
                //userInput = menuToInt(userInput.toUpperCase());
                userSelect(userInput);
            } catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                System.out.println("Invalid menu selection. Try again.");
            }
        } while (!"exit".equalsIgnoreCase(userInput));

    }

    public String getUserInput() {
        in = new Scanner(System.in);
        int count = 0;
        printMenuMessage();
        for (Enum e : enumerations) {
            count++;
            System.out.println(count + ") " + e);
        }
        System.out.print("\nEnter your selection: " + "\n");
        return in.nextLine();
    }
}
