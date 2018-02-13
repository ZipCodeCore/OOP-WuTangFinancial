import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        ExchangeMaster m = new ExchangeMaster();

        Scanner input = new Scanner(System.in);

        System.out.println("What kind of money you got b?");
        String startingCurrencyType = input.nextLine();
        System.out.println("How many " + startingCurrencyType + " do you have?");

        Scanner input2 = new Scanner(System.in);

        Double startingAmount = input2.nextDouble();
        System.out.println("And what do you want to convert it to?");
        String targetCurrencyType = input.nextLine();
        System.out.println("You have $" + m.converter(startingAmount, startingCurrencyType, targetCurrencyType) + " in" + targetCurrencyType);

    }

}
