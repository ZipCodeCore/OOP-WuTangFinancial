package vedensky.eugene.currencyconverter;

/**
 * Created by eugenevendensky on 1/12/17.
 */

import java.util.Scanner;
//import java.lang.String;
public class CurrencyConverter {

    private Double dollar;
    private Double euro;
    private Double britishPound;
    private Double indianRupee;
    private Double australianDollar;
    private Double canadianDollar;
    private Double singaporeDollar;
    private Double swissFranc;
    private Double malaysianRingit;
    private Double japaneseYen;
    private Double yuanRenminbi;
    private String enterDesiredConversion;

    public CurrencyConverter() {
        this.dollar = 1.00;
        this.euro = .94;
        this.britishPound = .82;
        this.indianRupee = 68.32;
        this.australianDollar = 1.35;
        this.canadianDollar = 1.32;
        this.singaporeDollar = 1.43;
        this.swissFranc = 1.01;
        this.malaysianRingit = 4.47;
        this.japaneseYen = 115.84;
        this.yuanRenminbi = 6.92;
        this.enterDesiredConversion = enterDesiredConversion;
    }

   /* public Double currencyCalculator(Double from, Double to) {
        return (dollar / from) * to;
    }*/

    public Double euroToDollar() {
        return dollar / euro;
    }

    public Double euroToBritishPound() {
        return (dollar / euro) * britishPound;
    }

    public Double britishPoundToIndianRupee() {
        return (dollar / britishPound) * indianRupee;
    }

    public Double rupeeToCanadianDollar() {
        return (dollar / indianRupee) * indianRupee;
    }

    public Double canadianDollarToSingaporeDollar() {
        return (dollar / canadianDollar) * singaporeDollar;
    }

    public Double singaporeDollarToSwissFranc() {
        return (dollar / britishPound) * indianRupee;
    }

    public Double swissFrancToMalaysianRinggit() {
        return (dollar / swissFranc) * malaysianRingit;
    }

    public Double japaneseYenToChineseYuanRenminbi() {
        return (dollar / japaneseYen) * yuanRenminbi;
    }

    public Double malaysianRingitToJapaneseYen() {
        return (dollar / malaysianRingit) * japaneseYen;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter destination country:");
       // String enterDesiredConversion = ();
        //System.out.print(enterDesiredConversion);
        System.out.print(pickConverter(scanner.nextLine()));
    }

    public static double pickConverter(String converter){
        CurrencyConverter Gene = new CurrencyConverter();
        switch (converter){
            case "Euro to Dollar":
                return Gene.euroToDollar();
            case "Swiss Franc To Malaysian Ringit":
                return Gene.swissFrancToMalaysianRinggit();


            default: return 0;
        }
    }


}
