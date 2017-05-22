/**
 * Created by brianmullin on 5/22/17.
 */

import java.util.Scanner;

public class AppCurrency {

    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Wu Tang Financial's Official Currency Calculator powered by WorldStarHipHop's Java Engine");

        CurrencyConverter convy = new CurrencyConverter();

        System.out.println(convy.convertTo("USD", "Euro", 100.00 ));


    }
}
