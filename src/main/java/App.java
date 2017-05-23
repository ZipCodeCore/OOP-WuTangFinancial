import java.util.ArrayList;

/**
 * Created by paco on 5/22/17.
 */
public class App
{

    public static void main(String[] args)
    {
        ArrayList<Currency> myList = new ArrayList();
        CurrencyConverter myConverter = new CurrencyConverter();
        USDollar usDollar = new USDollar();
        CanadianDollar canadian = new CanadianDollar();
        Currency chineseYuan = new ChineseYuan();
        Currency euro = new Euro();
        Currency japaneseYen = new JapaneseYen();
        Currency malaysian = new MalaysianRinggit();
        Currency pound = new Pound();
        Currency rupee = new Rupee();
        Currency singDollar = new SingaporeDollar();
        Currency swissFranc = new SwissFranc();
        myList.add(usDollar);
        myList.add(canadian);
        myList.add(chineseYuan);
        myList.add(euro);
        myList.add(japaneseYen);
        myList.add(malaysian);
        myList.add(pound);
        myList.add(rupee);
        myList.add(singDollar);
        myList.add(swissFranc);
        double total;
        double myAmount = 1500.50;

        for(int i = 1; i < myList.size(); i++)
        {
            total = myConverter.getAmount(myAmount, myList.get(0), myList.get(i));
            System.out.printf("My US of money %s%.2f in %ss at the rate of %.2f is %s%.2f%n",usDollar.symbol(), myAmount, myList.get(i).getClass().getName(),
                    myList.get(i).getRate(), myList.get(i).symbol(), total);
        }

    }

}
