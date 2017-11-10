import java.util.Scanner;

public class Display {
public double printQuestion(){
    Scanner scan = new Scanner(System.in);
    System.out.println("how much would you like to convert?");
    Double amount = scan.nextDouble();
    return amount;
}
}
