package com.zipCodeWilmington;

public class UserChoice {

    AllAboutScanner allAboutScanner = new AllAboutScanner();
    USdollar uSdollar = new USdollar();
    Euro euro = new Euro();
    BritishPound britishPound = new BritishPound();
    IndianRupee indianRupee = new IndianRupee();
    CanadianDollar canadianDollar = new CanadianDollar();
    SingaporeDollar singaporeDollar = new SingaporeDollar();
    SwissFranc swissFranc = new SwissFranc();
    MalaysianRinggit malaysianRinggit = new MalaysianRinggit();
    JapaneseYen japaneseYen = new JapaneseYen();


    public double options() {

        double printOutExchane = 0;

        double convertionDesired = allAboutScanner.userInput();

        switch ((int) convertionDesired ){

            case 1:
                printOutExchane =  uSdollar.userPrompt();
                break;

            case 2:
                printOutExchane =  euro.userPrompt2();
                break;

            case 3:
                printOutExchane =  euro.userPrompt();
                break;

            case 4:
                printOutExchane = britishPound.userPrompt();
                break;

            case 5:
                printOutExchane = indianRupee.userPrompt();
                break;

            case 6:
                printOutExchane = canadianDollar.userPrompt();
                break;

            case 7:
                printOutExchane = singaporeDollar.userPrompt();
                break;

            case 8:
                printOutExchane = swissFranc.userPrompt();
                break;

            case 9:
                printOutExchane = malaysianRinggit.userPrompt();
                break;

            case 10:
                printOutExchane = japaneseYen.userPrompt();
                break;

                default:
                    System.out.println("Opps you have had selected a wrong option, try again...");
        }
        System.out.println(printOutExchane);
        return 0;
    }

}
