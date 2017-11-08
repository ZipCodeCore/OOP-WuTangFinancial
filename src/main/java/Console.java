import currencies.*;

import java.util.Scanner;

public class Console {

    String type;

    UsDollar usDollar = new UsDollar();
    Euro euro = new Euro();
    BritishPound pound = new BritishPound();
    Rupee rupee = new Rupee();
    CanadianDollar canadianDollar = new CanadianDollar();
    SingaporeDollar singaporeDollar = new SingaporeDollar();
    SwissFranc swissFranc = new SwissFranc();
    MalaysianRinggit ringgit = new MalaysianRinggit();
    JapaneseYen yen = new JapaneseYen();
    ChineseYuanRenminbi yuanRenminbi = new ChineseYuanRenminbi();

    public void console(){
        System.out.println("Hey! What kind of currency would you like to convert?");
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        Display display = new Display();
        if (type.equalsIgnoreCase(("US dollar"))){
            Double amount = display.printQuestion();
            Double converted = usDollar.convertToEuro(amount);
            System.out.println("You will have " + converted + " in Euros");
        }
        else if (type.equalsIgnoreCase(("Euro"))){
            Double amount = display.printQuestion();
            Double converted = euro.convertToPounds(amount);
            System.out.println("You will have " + converted + " in British Pounds");
        }
        else if (type.equalsIgnoreCase(("Pound"))){
            Double amount = display.printQuestion();
            Double converted = pound.convertToRupees(amount);
            System.out.println("You will have " + converted + " in rupees");
        }
        else if (type.equalsIgnoreCase(("Rupee"))){
            Double amount = display.printQuestion();
            Double converted = rupee.convertToCandadianDollars(amount);
            System.out.println("You will have " + converted + " in canadian dollars");
        }
        else if (type.equalsIgnoreCase(("Canadian dollar"))){
            Double amount = display.printQuestion();
            Double converted = canadianDollar.convertToSingaporeanDollars(amount);
            System.out.println("You will have " + converted + " in singaporean dollars");
        }
        else if (type.equalsIgnoreCase(("Singaporean dollar"))){
            Double amount = display.printQuestion();
            Double converted = singaporeDollar.convertToSwissFranc(amount);
            System.out.println("You will have " + converted + " in swiss francs");
        }
        else if (type.equalsIgnoreCase("franc")){
            Double amount = display.printQuestion();
            Double converted = swissFranc.convertToRinggit(amount);
            System.out.println("You will have " + converted + " in ringgits");
        }
        else if (type.equalsIgnoreCase("ringgit")){
            Double amount = display.printQuestion();
            Double converted = ringgit.convertToYen(amount);
            System.out.println("You will have " + converted + " in japanese yen");
        }
        else if (type.equalsIgnoreCase("yen")){
            Double amount = display.printQuestion();
            Double converted = yen.convertToYuanRenminbi(amount);
            System.out.println("You will have " + converted + " in yuan renminbi");
        }
        else if (type.equalsIgnoreCase("yuan renminbi")){
            Double amount = display.printQuestion();
            Double converted = yuanRenminbi.inUSD(amount);
            System.out.println("You will have " + converted + " in us dollars:)");
        }
    }
}
