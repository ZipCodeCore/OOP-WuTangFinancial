/**
 * Created by anthonyjones on 5/22/17.
 */
public class Calculate {

    double money;


    public double convertToUSDollar(double money) {
        return 1 * money;
    }

    public double convertToUSSwissFranc(double money) {

        money=money*1.01;

        return money;
    }
    
    public double convertToEuros(double money) {

        money=money*1.01;

        return money;
    }
}
